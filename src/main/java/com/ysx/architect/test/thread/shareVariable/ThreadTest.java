package com.ysx.architect.test.thread.shareVariable;

public class ThreadTest {
    public static void main(String[] args)  {
        final InsertData insertData = new InsertData();

        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();


        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
    }
}
