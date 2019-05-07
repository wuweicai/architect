package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;
import java.util.concurrent.Future;

public class ThreadMidResult implements Serializable {
    private static final long serialVersionUID = -443332820091847624L;

    private ThreadConfig config;
    private Future<String> future;
    private MultithreadExecuteDetail mDetail;

    public ThreadConfig getConfig() {
        return config;
    }
    public void setConfig(ThreadConfig config) {
        this.config = config;
    }
    public Future<String> getFuture() {
        return future;
    }
    public void setFuture(Future<String> future) {
        this.future = future;
    }
    public MultithreadExecuteDetail getmDetail() {
        return mDetail;
    }
    public void setmDetail(MultithreadExecuteDetail mDetail) {
        this.mDetail = mDetail;
    }



}