package com.ysx.architect.test.hutool.JavaBean;

import java.io.Serializable;

/**
 * @ProjectName: architect
 * @Package: com.ysx.architect.test.hutool.JavaBean
 * @ClassName: Person
 * @Author: wuweicai
 * @Description:
 * @Date: 2019/12/11 15:05
 * @Version: 1.0
 */
public class Person implements Serializable {
    private int age;
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
