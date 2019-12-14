package com.ysx.architect.test.hutool.JavaBean;

import cn.hutool.core.lang.UUID;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.JavaBean
 * @ClassName: SubPerson
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 15:05
 * @Version: 1.0
 */
public class SubPerson extends Person {
    public static final String SUBNAME = "TEST";

    private UUID id;
    private String subName;
    private Boolean isSlow;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getSubName() {
        return subName;
    }
    public void setSubName(String subName) {
        this.subName = subName;
    }
    public Boolean isSlow() {
        return isSlow;
    }
    public void setSlow(Boolean isSlow) {
        this.isSlow = isSlow;
    }
}
