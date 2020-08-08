package com.github.perschola;
import org.junit.Assert;
import org.junit.Test;

public class MyObjectTestPart2B {
    @Test
    public void testRun() { // TODO
        // Given
        MyObjectPart2B myObject = new MyObjectPart2B();

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
