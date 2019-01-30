package com;

import com.Hello;
import org.junit.Assert;
import org.junit.Test;

public class HelloTets {
    @Test
    public void testHello(){
        Assert.assertEquals ("com.Hello EPAM !",Hello.hello() );
    }
}
