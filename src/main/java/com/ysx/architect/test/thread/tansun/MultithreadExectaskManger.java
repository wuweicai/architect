package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;

public class MultithreadExectaskManger extends MultithreadExectaskMangerKey implements Serializable {
    private static final long serialVersionUID = -161123581321345589L;

    protected String serialnumber;// 线程的序列号 [16,0]
    protected String threadName;// 任务名称 [64,0], Not NULL
    protected String legalpernum;// 线程执行时需要的法人编号 [64,0], Not NULL
    protected String threadStatus;// 线程的运行状态 [32,0]
    protected Integer execNumtimes;// 线程的执行次数 [8,0]
    protected String execlass;// 执行的类 [128,0], Not NULL
    protected String execlassmethod;// 执行类中的方法 [128,0], Not NULL
    protected String createTime;// 创建时间 [64,0]
    protected String describe;// 线程目标的描述 [512,0]
    protected String endtime;// 结束时间 [64,0]

    public MultithreadExectaskMangerKey getMultithreadExectaskMangerKey() {
        MultithreadExectaskMangerKey _MultithreadExectaskMangerKey = new MultithreadExectaskMangerKey(id);
        return _MultithreadExectaskMangerKey;
    }

    /** 取值 <== 线程的序列号 [16,0] */
    public String getSerialnumber() {
        return serialnumber;
    }

    /** 赋值 ==> 线程的序列号 [16,0] */
    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber == null ? null : serialnumber.trim();
    }

    /** 取值 <== 任务名称 [64,0], Not NULL */
    public String getThreadName() {
        return threadName;
    }

    /** 赋值 ==> 任务名称 [64,0], Not NULL */
    public void setThreadName(String threadName) {
        this.threadName = threadName == null ? null : threadName.trim();
    }

    /** 取值 <== 线程执行时需要的法人编号 [64,0], Not NULL */
    public String getLegalpernum() {
        return legalpernum;
    }

    /** 赋值 ==> 线程执行时需要的法人编号 [64,0], Not NULL */
    public void setLegalpernum(String legalpernum) {
        this.legalpernum = legalpernum == null ? null : legalpernum.trim();
    }

    /** 取值 <== 线程的运行状态 [32,0] */
    public String getThreadStatus() {
        return threadStatus;
    }

    /** 赋值 ==> 线程的运行状态 [32,0] */
    public void setThreadStatus(String threadStatus) {
        this.threadStatus = threadStatus == null ? null : threadStatus.trim();
    }

    /** 取值 <== 线程的执行次数 [8,0] */
    public Integer getExecNumtimes() {
        return execNumtimes;
    }

    /** 赋值 ==> 线程的执行次数 [8,0] */
    public void setExecNumtimes(Integer execNumtimes) {
        this.execNumtimes = execNumtimes;
    }

    /** 取值 <== 执行的类 [128,0], Not NULL */
    public String getExeclass() {
        return execlass;
    }

    /** 赋值 ==> 执行的类 [128,0], Not NULL */
    public void setExeclass(String execlass) {
        this.execlass = execlass == null ? null : execlass.trim();
    }

    /** 取值 <== 执行类中的方法 [128,0], Not NULL */
    public String getExeclassmethod() {
        return execlassmethod;
    }

    /** 赋值 ==> 执行类中的方法 [128,0], Not NULL */
    public void setExeclassmethod(String execlassmethod) {
        this.execlassmethod = execlassmethod == null ? null : execlassmethod.trim();
    }

    /** 取值 <== 创建时间 [64,0] */
    public String getCreateTime() {
        return createTime;
    }

    /** 赋值 ==> 创建时间 [64,0] */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /** 取值 <== 线程目标的描述 [512,0] */
    public String getDescribe() {
        return describe;
    }

    /** 赋值 ==> 线程目标的描述 [512,0] */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /** 取值 <== 结束时间 [64,0] */
    public String getEndtime() {
        return endtime;
    }

    /** 赋值 ==> 结束时间 [64,0] */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String toString() {
        return "MultithreadExectaskManger [serialnumber = " + serialnumber + ", threadName = " + threadName + ", legalpernum = " + legalpernum + ", threadStatus = " + threadStatus + ", execNumtimes = " + execNumtimes + ", execlass = " + execlass + ", execlassmethod = " + execlassmethod + ", createTime = " + createTime + ", describe = " + describe + ", endtime = " + endtime + "]";
    }
}