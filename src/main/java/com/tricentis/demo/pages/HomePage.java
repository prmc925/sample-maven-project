package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        Reporter.log("Clicking on Login Link " + loginLink.toString() + "<br>");
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        Reporter.log("Clicking on register Link " + registerLink.toString() + "<br>");
    }
}
