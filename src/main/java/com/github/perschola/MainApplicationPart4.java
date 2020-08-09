package com.github.perschola;

public class MainApplicationPart4 {
    public static void main(String[] args) {
        //creating thread 1
        Runnable run0 = new MyObjectPart4();
        Thread th0 = new Thread(run0, "MyThread1");
        //setting priority for first thread
        th0.setPriority(Thread.MIN_PRIORITY);
        //creating thread 2
        Runnable run1 = new MyObjectPart4();
        Thread th1 = new Thread(run1, "MyThread2");
        //setting priority for second thread
        th1.setPriority(Thread.NORM_PRIORITY);
        //creating thread 3
        Runnable run2 = new MyObjectPart4();
        Thread th2 = new Thread(run2, "MyThread3");
        //setting priority for third thread
        th2.setPriority(Thread.MAX_PRIORITY);
        //calling thread1
        th0.start();
        //calling thread2
        th1.start();
        //calling thread3
        th2.start();
    }
}


