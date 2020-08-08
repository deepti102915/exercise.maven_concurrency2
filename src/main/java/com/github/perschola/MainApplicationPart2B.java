package com.github.perschola;

public class MainApplicationPart2B {
    public static void main(String[] args) {
        //creating thread 1
        Runnable run0 = new MyObjectPart2B();
        Thread th0 = new Thread(run0);
        //creating thread 2
        Runnable run1 = new MyObjectPart2B();
        Thread th1 = new Thread(run1);
        //creating thread 3
        Runnable run2 = new MyObjectPart2B();
        Thread th2 = new Thread(run2);
        //calling thread1
        th0.start();

        try {
            th0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //calling thread2
        th1.start();
        //calling thread3
        th2.start();
    }
}
