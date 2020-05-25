package com.weborders.tests;

import com.aventstack.extentreports.ExtentTest;
import com.weborders.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginTests extends AbstractBaseTest {

    @Test
    public void login(){
        extentTest=extentReports.createTest("Verify page logo");

        LoginPage loginPage=new LoginPage();
        loginPage.login();
        loginPage.navigateTo("View all products");
        assertEquals(loginPage.getPageSubtitle(),"List of Products");

        extentTest.pass("logo verified");
    }
}
