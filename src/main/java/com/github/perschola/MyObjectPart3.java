package com.github.perschola;

public class MyObjectPart3 implements Runnable {
    public void run() {
        // TODO
        System.out.println(Thread.currentThread().getName());
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Sleep interrupted");
            }
            System.out.println(i);
        }
    }
}

