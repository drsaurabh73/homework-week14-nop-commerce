package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickLoginLink();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickLoginLink();
        loginPage.setEmail("sampatil123@gmail.com");
        loginPage.setPassword("456789");
        loginPage.clickOnLogin();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials()  {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickLoginLink();

        loginPage.setEmail("sampatil123@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickOnLogin();
        softAssert.assertEquals(homePage.verifyLogout(),"Log out","");
        softAssert.assertAll();

    }
    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickLoginLink();

        loginPage.setEmail("sampatil123@gmail.com");
        loginPage.setPassword("123456");
        loginPage.clickOnLogin();

        softAssert.assertEquals(loginPage.verifyLoginText(),"LOG IN","");
        softAssert.assertAll();


    }

}
