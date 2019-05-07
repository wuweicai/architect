package com.ysx.architect.test.thread.shareVariable;

public class Run {
    public static void main(String[] args) {

        final TestSynchronized test = new TestSynchronized();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                //test.minus();
                test.minus2();
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                 //test.minus();
                test.minus2();
                //test.minus3();
            }
        });

        thread1.start();
        thread2.start();

    }

}