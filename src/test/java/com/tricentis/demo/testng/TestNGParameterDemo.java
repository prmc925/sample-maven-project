package com.tricentis.demo.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class TestNGParameterDemo {

    @Test
    @Parameters({"myName", "surname"})
    public void test(String name, String surname){
        System.out.println("My name is " + name);
        System.out.println("My Surname is " + surname);
    }

}
