package com.ysx.architect.test.thread.tansun;

import java.io.Serializable;

public class MultithreadExectaskMangerKey implements Serializable {
    private static final long serialVersionUID = -161123581321345589L;

    protected String id;// 表的主键ID [64,0], Not NULL

    public MultithreadExectaskMangerKey(String id) {
        this.id = id;
    }

    public MultithreadExectaskMangerKey() {
        super();
    }

    /** 取值 <== 表的主键ID [64,0], Not NULL */
    public String getId() {
        return id;
    }

    /** 赋值 ==> 表的主键ID [64,0], Not NULL */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}
