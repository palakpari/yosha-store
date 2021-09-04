package com.yoshallc.store;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YoshLLC {

    @Test
    public void login(){
            Assert.assertEquals("I love you Stuti", "I love you Stuti");
            Assert.assertNotEquals("I love you Swina", "I love you Stuti");
    }
}
