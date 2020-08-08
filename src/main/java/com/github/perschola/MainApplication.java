package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        //creating thread 1
        Runnable run0 = new MyObject();
        Thread th0 = new Thread(run0);
        //creating thread 2
        Runnable run1 = new MyObject();
        Thread th1 = new Thread(run1);
        //calling thread1
        th0.start();
        //calling thread2
        th1.start();
    }
}
