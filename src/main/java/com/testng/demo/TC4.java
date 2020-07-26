package com.testng.demo;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @liaojinjun TC1
 * @Description TODO
 * @Date 2020-07-19 20:31
 * @Created by liaojinjun
 */
public class TC4 {

    @Test
    public void clas01() {
        //断言1=1对
        Assert.assertEquals(1, 1);
    }

    @Test
    public void clas02() {
        Assert.assertEquals("测试1", "测试2");

    }
}
