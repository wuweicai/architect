package com.ysx.architect.test.thread.shareVariable;

import cn.hutool.core.convert.Convert;

import java.util.Date;

public class ThreadTest {
    public static void main(String[] args)  {
        final InsertData insertData = new InsertData();

        System.out.println("第一次打印时间："+Convert.toStr(new Date()));
        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();


        System.out.println("第二次打印时间："+ Convert.toStr(new Date()));
        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
    }
}
