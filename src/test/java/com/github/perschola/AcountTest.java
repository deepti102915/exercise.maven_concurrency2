package com.github.perschola;

import org.junit.Assert;
import org.junit.Test;

public class AcountTest {

        @Test
        public void testAccountRun() {
        // Given
        Runnable task = new Account();
        Thread thread0 = new Thread(task, "Reema");
        Thread thread1 = new Thread(task, "Ranjeet");

        // when
        thread0.start();

        try {
            thread0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //then
        Assert.assertNotNull(thread0.toString());
        Assert.assertNotNull(thread1.toString());
    }
}
