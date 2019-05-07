package com.ysx.architect.test.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Student {
    private final static Logger LOG = LoggerFactory.getLogger(Student.class);

    public static void main(String[] args) {


        LOG.info("开始测试！");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        CheckScore check = new CheckScore();
        try {
            check.check(score);
        }
        /*catch (BaseException e) {// 用自己的异常类来捕获异常
            e.printStackTrace();
        }*/
        catch (Exception e) {// 用通用异常类来捕获异常
            //e.printStackTrace();
            LOG.error(e.getMessage());
        }
    }

}