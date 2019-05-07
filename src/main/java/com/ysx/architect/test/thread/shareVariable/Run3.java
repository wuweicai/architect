package com.ysx.architect.test.thread.shareVariable;

public class Run3 {
    public static void main(String[] args) {

        TestSynchronized test = new TestSynchronized();
        StringBuffer Result = new StringBuffer("Hello");

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                    test.minus4(Result);
                    System.out.println(Thread.currentThread().getName() + " minus4-result- " + Result);
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                test.minus4(Result);
                System.out.println(Thread.currentThread().getName() + " minus4-result- " + Result);
                /*test.minus5(Result);
                System.out.println(Thread.currentThread().getName() + " minus5-result- " +Result);*/
            }
        });

        thread1.start();
        thread2.start();

    }

}