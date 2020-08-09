package com.github.perschola;

public class MyObjectPart4 implements Runnable {
    public void run() {
        // TODO
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Sleep interrupted");
        }
        System.out.println("running thread name is: " + Thread.currentThread().getName() +
                "\nrunning thread priority is: " + Thread.currentThread().getPriority());

        System.out.println("==============================");
    }
}

