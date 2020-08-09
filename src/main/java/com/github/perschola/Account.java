package com.github.perschola;

public class Account implements Runnable {
        private double accountBalance = 50.0;
        private final double withdrawalAmount = 10.0;
        private int j = 1;

        @Override
        public void run() {

            if (accountBalance > 0) {
                for(int i = 0; i < j; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Sleep interrupted");
                    }
                    if (accountBalance >= withdrawalAmount) {
                        System.out.println(Thread.currentThread().getName() + " is going to withdraw: " + withdrawalAmount);
                        accountBalance -= withdrawalAmount;
                        System.out.println(Thread.currentThread().getName() + " completes the withdrawal: " + accountBalance);
                    } else {
                        System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw. Account balance = " + accountBalance);
                    }
                }
                j=j+1;
            }

        }
}
