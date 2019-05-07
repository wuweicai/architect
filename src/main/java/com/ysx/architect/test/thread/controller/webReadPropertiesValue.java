package com.ysx.architect.test.thread.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class webReadPropertiesValue {

    @Value("${maxThreadAmount}")
    private String maxThreadAmount;

    /*@Value("${mail.password}")
    private String password;*/

    @RequestMapping(value = { "/", "" })
    public String hellTask() {
        System.out.println("maxThreadAmount:" + maxThreadAmount);
        return "hello task !!";
    }

}
