package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.LoginPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTestWithDataProvider extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void verifyErrorMessageWithInvalidCredentials(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message not displayed");
    }
}
