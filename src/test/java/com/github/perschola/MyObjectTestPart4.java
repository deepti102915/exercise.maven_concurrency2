package com.github.perschola;
import org.junit.Assert;
import org.junit.Test;

public class MyObjectTestPart4 {
    @Test
    public void testRun() { // TODO
        // Given
        MyObjectPart4 myObject = new MyObjectPart4();

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
