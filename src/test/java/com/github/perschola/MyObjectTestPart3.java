package com.github.perschola;
import org.junit.Assert;
import org.junit.Test;

public class MyObjectTestPart3 {
    @Test
    public void testRun() { // TODO
        // Given
        MyObjectPart3 myObject = new MyObjectPart3();

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
