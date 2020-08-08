package com.github.perschola;

public class MyObjectPart2B implements Runnable {
    public void run() {
        // TODO

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

