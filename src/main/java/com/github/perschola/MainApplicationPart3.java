package com.github.perschola;

public class MainApplicationPart3 {
    public static void main(String[] args) {
        //creating thread 1
        Runnable run0 = new MyObjectPart3();
        Thread th0 = new Thread(run0, "MyThread1");
        //creating thread 2
        Runnable run1 = new MyObjectPart3();
        Thread th1 = new Thread(run1, "MyThread2");
        //creating thread 3
        Runnable run2 = new MyObjectPart3();
        Thread th2 = new Thread(run2, "MyThread3");
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


