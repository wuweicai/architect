package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;
import java.util.Queue;

public class ThreadConfig implements Serializable {
    private static final long serialVersionUID = -443332820091847624L;

    private String execlass; //执行的类
    private String execlassmethod;//执行的方法
    private String legalpernum;  //法人编号
    private String threadName;   //线程名称
    private Queue<String> queue; //提交参数放到队列中

    private String callbackmethod; //线程执行后的回调方法

    public static void main(String[] args) {
        System.out.println("ow3kow");
    }

    public String getExeclass() {
        return execlass;
    }

    public void setExeclass(String execlass) {
        this.execlass = execlass;
    }

    public String getExeclassmethod() {
        return execlassmethod;
    }

    public void setExeclassmethod(String execlassmethod) {
        this.execlassmethod = execlassmethod;
    }

    public String getLegalpernum() {
        return legalpernum;
    }

    public void setLegalpernum(String legalpernum) {
        this.legalpernum = legalpernum;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public void setQueue(Queue<String> queue) {
        this.queue = queue;
    }

    public String getCallbackmethod() {
        return callbackmethod;
    }

    public void setCallbackmethod(String callbackmethod) {
        this.callbackmethod = callbackmethod;
    }




}
