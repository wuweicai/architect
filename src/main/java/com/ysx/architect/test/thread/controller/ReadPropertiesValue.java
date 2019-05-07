package com.ysx.architect.test.thread.controller;


import com.ysx.architect.test.thread.Common.PropertiesUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

//@PropertySource({"classpath:config/my.properties","classpath:config/config.properties"})
public class ReadPropertiesValue {

    @Value("${poolSize}")
    static private  String poolSize;

    @Value("${maxThreadAmount}")
    static private  String maxThreadAmount;

    public static void main(String[] args) {

        //String poolSize = PropertiesUtil.getContentByName("poolSize");

        System.out.println("maxThreadAmount"+maxThreadAmount);
        System.out.println("poolSize"+poolSize);

    }
}
