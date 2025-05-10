package com.tricentis.demo.testsuite;

import com.tricentis.demo.excelutility.ExcelUtility;
import com.tricentis.demo.pages.HomePage;
import com.tricentis.demo.pages.LoginPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginPageTestWithExcelData extends BaseTest {

    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass
    public void setExcel(){
        // Tell the code about the location of the Excel file
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "LoginTests");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider(name = "dataFromExcel")
    public Object[][] getData(){
       return ExcelUtility.getTestData("Invalid_Login");
    }


    @Test(dataProvider = "dataFromExcel")
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
