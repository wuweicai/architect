package com.ysx.architect.test.thread.shareVariable;

import jdk.nashorn.internal.runtime.NumberToString;

public class TestSynchronized {
    public synchronized void minus() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " minus- " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public void minus2() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public void minus3() {
        int count = 5;
        for (int i = 0; i < 5; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    public void minus4(StringBuffer result) {
        int count = 10;
        synchronized(result) {
            result.append(String.valueOf(count));
            System.out.println(Thread.currentThread().getName() + " -result- " + result);
            for (int i = 0; i < 5; i++) {
                count--;
                System.out.println(Thread.currentThread().getName() + " - " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            result.append(String.valueOf(count));
        }
    }
    public void minus5(StringBuffer result) {
        int count = 20;
        result.append(String.valueOf(count));
        System.out.println(Thread.currentThread().getName() + " -result- " +result);
        for (int i = 0; i < 10; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        result.append(String.valueOf(count));
    }
}