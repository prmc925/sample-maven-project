package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.LoginPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("primexyz123@gmail.com");
        loginPage.enterPassword("Prime12345");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message not displayed");
    }
}
