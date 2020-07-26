package com.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @liaojinjun TC1
 * @Description TODO
 * @Date 2020-07-19 20:31
 * @Created by liaojinjun
 */
public class TC2 {

    @Test
    public void clas03() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void clas04() {
        Assert.assertEquals("测试3", "测试3");

    }
}
