package com.ysx.architect.test.thread.tansun;

import com.ysx.architect.common.DateUtil;
import com.ysx.architect.common.StringUtil;
import com.ysx.architect.test.thread.Common.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;

public class TansunThread implements Callable<String> {

    @Autowired
    public static MultithreadExecuteDetailDao  mDetailDao;
    @Autowired
    public static MultithreadExectaskMangerService service;

    /**
     * 1.线程执行时的配置对象，调试的时候需要注入，
     * 2.调用静态方法时，作为一个参数
     * **/
    private static Map<String , String > map;

    private static Map<String , ThreadManagerVo> managerMap;


    private String orgId;  //机构编号
    private String legalPerNum; //法人编号
    private ThreadConfig config; //配置文对象


    static{
        map = new HashMap<String, String>();
        managerMap = new HashMap<String, ThreadManagerVo>();
    }

    public TansunThread(String orgId, String legalPerNum ,ThreadConfig config) {
        super();
        this.orgId = orgId;
        this.legalPerNum = legalPerNum;
        this.config = config;
    }

    public static void main(String[] args) throws Exception {
        Queue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.add("aaaa");
        queue.add("dfefe");
        queue.add("aete4daa");
        ThreadConfig config = new ThreadConfig();
        config.setExeclass("com.tansun.batchjob.codeRefactoring.tansunTread.PerformBussiness");
        config.setExeclassmethod("executeCore");
        config.setLegalpernum("legelperNum");
        config.setThreadName("performBussy");
        config.setQueue(queue);
        TansunThread.runCurrent(config);
    }

    @Override
    public String call() {

        /**
         * 采用第二种方案执行，使用Spring Bean得到对象
         * **/

        try {
            TansunThread.secondPlanForReflex(this.orgId , this.legalPerNum , this.config);
        } catch (InvocationTargetException e) {
            try {
                TansunThread.callback(this.orgId , this.legalPerNum , this.config);
            } catch (InvocationTargetException e1) {
                return "回退失败";
            } catch (Exception e1) {
                e1.printStackTrace();
                return "回退失败";
            }
            return "0";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }

        return "1";
    }

    /**
     * 暴露给外界调用多线程的静态方法，需要提供多线程的配置对象
     * **/
    public static synchronized void runCurrent(ThreadConfig config ) throws Exception{

        Queue<String> queue = config.getQueue();
        map.put(config.getExeclass(), "0");
        //线程池创建线程的数量进行处理
        String poolSize = PropertiesUtil.getContentByName("poolSize");
        //1 poolSize为空时 ， 默认开启10个线程
        if(poolSize == null ){
            poolSize = "10";
        }
        //尝试转换Int一次 , 如果不能转换，默认开启10个线程
        try {
            Integer.valueOf(poolSize);
        } catch (NumberFormatException e) {
            poolSize = "10";
        }
        ExecutorService pool = Executors.newFixedThreadPool(Integer.valueOf(poolSize));
        /**
         * 线程名的处理
         * **/
        String threadName =config.getThreadName();
        String execlass = config.getExeclass();
        String[] arr= execlass.split("\\.");
        if(!StringUtil.isNotNullOrBlock(threadName)){
            if(arr.length>1){
                threadName = arr[arr.length-1];
            }else{
                threadName = arr[0];
            }
        }

        String legalpernum = config.getLegalpernum();
        /**
         * 多线程管理对象进行保存
         * **/
        /*MultithreadExectaskMangerService service = (MultithreadExectaskMangerService)BeanUtil
                .getBean(MultithreadExectaskMangerServiceImpl.class);*/
        MultithreadExectaskManger manager = new MultithreadExectaskManger();
        final String managerId = UUID.randomUUID().toString();
        String serialNum = threadName+"_"+TansunThread.getDiffCode();
        manager.setId(managerId);
        manager.setSerialnumber(serialNum);
        manager.setThreadName(threadName);
        manager.setLegalpernum(legalpernum);
        manager.setThreadStatus("运行中");
        manager.setExeclass(config.getExeclass());
        manager.setExeclassmethod(config.getExeclassmethod());
        manager.setCreateTime(DateUtil.date2Str(DateUtil.getNowTime(), "yyyy-MM-dd HH:mm:ss"));
        manager.setExecNumtimes(1);
        service.insert(manager);

        //1.1 先拿到保存明细数据的DAO
        /*MultithreadExecuteDetailDao  mDetailDao =(MultithreadExecuteDetailDao) BeanUtil
                .getBean(MultithreadExecuteDetailDaoImpl.class);*/
        //2.监听线程的执行结果
        List<ThreadMidResult> midResultList = new ArrayList<ThreadMidResult>();
        ThreadMidResult midResult = null;
        TansunThread thread =null;

        MultithreadExecuteDetail mDetail = null;
        int thredNum=0;
        while(queue.size()>0){
            String orgid = queue.poll();
            thread = new TansunThread(orgid , legalpernum ,config);
            //1.将线程丢给线程池执行
            Future<String> f= pool.submit(thread );
            midResult = new ThreadMidResult();
            midResult.setFuture(f);

            //2.在多线程明细表中插入一条记录插入执行记录
            mDetail = new MultithreadExecuteDetail();
            mDetail.setId(UUID.randomUUID().toString());
            mDetail.setManagerId(managerId);
            String detailName = threadName+"_"+thredNum;
            mDetail.setThreadName(detailName);
            mDetail.setStarttime(DateUtil.date2Str(DateUtil.getNowTime(), "yyyy-MM-dd HH:mm:ss"));
            mDetail.setLegalpernum(legalpernum);
            mDetail.setOrgid(orgid);
            mDetail.setStatus("运行中");
            mDetail.setExeclass(config.getExeclass());
            mDetail.setExeclassmethod(config.getExeclassmethod());

            midResult.setmDetail(mDetail);
            midResultList.add(midResult);
            mDetailDao.insert(mDetail);
            thredNum++;
        }

        /** 线程池执行结果的监听**/
        ThreadManagerVo  vo = new ThreadManagerVo();
        vo.setMangerDao(service);
        vo.setManager(manager);
        vo.setDetailDao(mDetailDao);
        vo.setMidResultList(midResultList);
        vo.setConfig(config);
        managerMap.put(managerId, vo);

        ///制作管理线程
        Thread threadManager =	new Thread(new Runnable() {
            private String  key_id = managerId;
            @Override
            public void run() {
                ThreadManagerVo mVo = managerMap.get(key_id);
                List<ThreadMidResult> list = mVo.getMidResultList();
                //拿到传进来的config
                ThreadConfig config = mVo.getConfig();
                MultithreadExecuteDetailDao detailDao = mVo.getDetailDao();
                while(list.size()>0){
                    ThreadMidResult mid = list.get(0);
                    Future<String> f = mid.getFuture();

                    MultithreadExecuteDetail mDetail = mid.getmDetail();
                    String result ="";
                    try {
                        result = f.get(60, TimeUnit.MINUTES);
                        mDetail.setEndtime(DateUtil.date2Str(DateUtil.getNowTime(), "yyyy-MM-dd HH:mm:ss"));
                        if("1".equals(result)){
                            mDetail.setStatus("已完成");
                            try {
                                detailDao.updateByPrimaryKey(mDetail);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            list.remove(mid);
                        }else if("0".equals(result)){
                            mDetail.setStatus("执行过程发生错误");
                            try {
                                detailDao.updateByPrimaryKey(mDetail);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            list.remove(mid);
                        }else if("回退失败".equals(result)){
                            mDetail.setStatus("回退过程中发生错误");
                            try {
                                detailDao.updateByPrimaryKey(mDetail);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            list.remove(mid);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        continue;
                    }
                }

                if(list.size()==0){
                    MultithreadExectaskManger manager = mVo.getManager();
                    MultithreadExectaskMangerService MangerDao = mVo.getMangerDao();
                    manager.setThreadStatus("已完成");
                    manager.setEndtime(DateUtil.date2Str(DateUtil.getNowTime(), "yyyy-MM-dd HH:mm:ss"));
                    map.put(config.getExeclass(), "1");
                    managerMap.remove(key_id);
                    try {

                        MangerDao.updateByPrimaryKey(manager);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        pool.submit(threadManager);
    }
    /**
     * 调用多线程公共方法执行失败后，进行的回调，需要用户传入需回调的方法名称
     * **/
    public static void callback(String orgId , String legalPerNum ,ThreadConfig config) throws ClassNotFoundException,
            NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
        String execlass = config.getExeclass();

        String callbackmethod = config.getCallbackmethod();
        System.out.println("将要执行的回滚方法："+callbackmethod);
        //执行类的命名空间不为空 ， 方法名不为空时，用反射机制进行调用
        if(StringUtil.isNotNullOrBlock(execlass) &&
                StringUtil.isNotNullOrBlock(callbackmethod)){
            //通过反射去执行
            Class classname = Class.forName(execlass);
            Method method = classname.getMethod(callbackmethod ,String.class,String.class);
            method.invoke(classname.newInstance(),orgId , legalPerNum);
        }

    }

    /**
     * 多线程执行的核心方法，此方法在call()内部调用，调用的时机交给多线程池
     * **/
    public static void secondPlanForReflex(String orgId , String legalPerNum ,ThreadConfig config) throws ClassNotFoundException,
            NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
        String execlass = config.getExeclass();
        String execlassmethod = config.getExeclassmethod();
        //执行类的命名空间不为空 ， 方法名不为空时，用反射机制进行调用
        if(StringUtil.isNotNullOrBlock(execlass) &&
                StringUtil.isNotNullOrBlock(execlassmethod)){
            //通过反射去执行
            Class classname = Class.forName(execlass);
            Method method = classname.getMethod(execlassmethod ,String.class,String.class);
            method.invoke(classname.newInstance(),orgId , legalPerNum);
        }

    }

    public static String getDiffCode(){
        Random random = new Random();
        int ends = random.nextInt(99);
        return String.format("%02d", ends);
    }

    public static boolean judgeIsFilinsh(String execlass){
        String result =map.get(execlass);
        boolean flag = false;
        if( "1".equals( result )){
            flag = true ;
            map.remove(execlass);
        }
        return flag;
    }

}
