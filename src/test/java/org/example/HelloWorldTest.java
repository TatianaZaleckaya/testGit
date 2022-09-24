package org.example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    private static final String EXPECTED_TEXT;

    static {
        EXPECTED_TEXT= "Hello World";
    }


    @Test
    public void getHelloWorldTest(){
        String helloWorld = HelloWorld.getHelloWorld();
        Assert.assertEquals(EXPECTED_TEXT, helloWorld);
    }

}
