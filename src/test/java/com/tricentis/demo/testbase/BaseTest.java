package com.tricentis.demo.testbase;

import com.tricentis.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {

    String browser = "chrome";

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
