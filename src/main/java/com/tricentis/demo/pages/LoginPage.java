package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//input[@value = 'Log in']");
    By errorMessage = By.xpath("//div[@class = 'validation-summary-errors']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }


}
