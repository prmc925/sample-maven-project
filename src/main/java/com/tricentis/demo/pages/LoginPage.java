package com.tricentis.demo.pages;

import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

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
        Reporter.log("Getting welcome text <br>");
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + " to email field " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + loginButton.toString() + "<br> ");
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }


}
