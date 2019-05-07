package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;
import java.util.List;

public class ThreadManagerVo implements Serializable {
    private static final long serialVersionUID = -443332820091847624L;

    private MultithreadExectaskMangerService MangerDao;
    private MultithreadExectaskManger manager ;
    private MultithreadExecuteDetailDao detailDao;

    private ThreadConfig config;
    private List<ThreadMidResult> midResultList ;

    public MultithreadExectaskMangerService getMangerDao() {
        return MangerDao;
    }
    public void setMangerDao(MultithreadExectaskMangerService mangerDao) {
        MangerDao = mangerDao;
    }
    public MultithreadExectaskManger getManager() {
        return manager;
    }
    public void setManager(MultithreadExectaskManger manager) {
        this.manager = manager;
    }
    public MultithreadExecuteDetailDao getDetailDao() {
        return detailDao;
    }
    public void setDetailDao(MultithreadExecuteDetailDao detailDao) {
        this.detailDao = detailDao;
    }
    public List<ThreadMidResult> getMidResultList() {
        return midResultList;
    }
    public void setMidResultList(List<ThreadMidResult> midResultList) {
        this.midResultList = midResultList;
    }
    public ThreadConfig getConfig() {
        return config;
    }
    public void setConfig(ThreadConfig config) {
        this.config = config;
    }



}
