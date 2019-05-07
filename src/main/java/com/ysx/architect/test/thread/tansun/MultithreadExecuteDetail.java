package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;

public class MultithreadExecuteDetail extends MultithreadExecuteDetailKey implements Serializable {
    private static final long serialVersionUID = -161123581321345589L;

    protected String managerId;// 关联字段，管理表中的主键id [64,0], Not NULL
    protected String threadName;// 线程的名字 [64,0], Not NULL
    protected String starttime;// 线程开始时间 [64,0]
    protected String endtime;// 线程结束时间 [64,0]
    protected String legalpernum;// 法人编号 [64,0]
    protected String orgid;// 机构id编号 [64,0]
    protected String execlass;// 执行的类 [128,0]
    protected String execlassmethod;// 执行的方法 [128,0]
    protected String status;// 线程运行状态 [64,0]

    public MultithreadExecuteDetailKey getMultithreadExecuteDetailKey() {
        MultithreadExecuteDetailKey _MultithreadExecuteDetailKey = new MultithreadExecuteDetailKey(id);
        return _MultithreadExecuteDetailKey;
    }

    /** 取值 <== 关联字段，管理表中的主键id [64,0], Not NULL */
    public String getManagerId() {
        return managerId;
    }

    /** 赋值 ==> 关联字段，管理表中的主键id [64,0], Not NULL */
    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    /** 取值 <== 线程的名字 [64,0], Not NULL */
    public String getThreadName() {
        return threadName;
    }

    /** 赋值 ==> 线程的名字 [64,0], Not NULL */
    public void setThreadName(String threadName) {
        this.threadName = threadName == null ? null : threadName.trim();
    }

    /** 取值 <== 线程开始时间 [64,0] */
    public String getStarttime() {
        return starttime;
    }

    /** 赋值 ==> 线程开始时间 [64,0] */
    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    /** 取值 <== 线程结束时间 [64,0] */
    public String getEndtime() {
        return endtime;
    }

    /** 赋值 ==> 线程结束时间 [64,0] */
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    /** 取值 <== 法人编号 [64,0] */
    public String getLegalpernum() {
        return legalpernum;
    }

    /** 赋值 ==> 法人编号 [64,0] */
    public void setLegalpernum(String legalpernum) {
        this.legalpernum = legalpernum == null ? null : legalpernum.trim();
    }

    /** 取值 <== 机构id编号 [64,0] */
    public String getOrgid() {
        return orgid;
    }

    /** 赋值 ==> 机构id编号 [64,0] */
    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    /** 取值 <== 执行的类 [128,0] */
    public String getExeclass() {
        return execlass;
    }

    /** 赋值 ==> 执行的类 [128,0] */
    public void setExeclass(String execlass) {
        this.execlass = execlass == null ? null : execlass.trim();
    }

    /** 取值 <== 执行的方法 [128,0] */
    public String getExeclassmethod() {
        return execlassmethod;
    }

    /** 赋值 ==> 执行的方法 [128,0] */
    public void setExeclassmethod(String execlassmethod) {
        this.execlassmethod = execlassmethod == null ? null : execlassmethod.trim();
    }

    /** 取值 <== 线程运行状态 [64,0] */
    public String getStatus() {
        return status;
    }

    /** 赋值 ==> 线程运行状态 [64,0] */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String toString() {
        return "MultithreadExecuteDetail [managerId = " + managerId + ", threadName = " + threadName + ", starttime = " + starttime + ", endtime = " + endtime + ", legalpernum = " + legalpernum + ", orgid = " + orgid + ", execlass = " + execlass + ", execlassmethod = " + execlassmethod + ", status = " + status + "]";
    }
}