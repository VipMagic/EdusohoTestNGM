package com.testng.demo.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @liaojinjun NewTest
 * @Description TODO
 * @Date 2020-07-22 23:50
 * @Created by liaojinjun
 */

public class NewTest {
    @Test(dataProvider = "dp")
    public void f1(Integer n, String s) {
        System.out.println(n + s);

    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][]{
                new Object[]{1, "a"},
                new Object[]{2, "b"},

        };
    }


}
