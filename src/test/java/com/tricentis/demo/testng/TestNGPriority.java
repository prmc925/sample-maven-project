package com.tricentis.demo.testng;

import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGPriority {

    @Test(priority = 1)
    public void test1() {
        System.out.println("I am in test1");
    }

    @Test()
    public void test2() {
        System.out.println("I am in test2");
    }

    @Test(priority = 2)
    public void test() {
        System.out.println("I am in test");
    }
}
