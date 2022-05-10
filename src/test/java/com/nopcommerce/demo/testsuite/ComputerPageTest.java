package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
    DesktopPage desktopPage;
    @BeforeMethod(alwaysRun = true)
    public void init() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        computerPage = new ComputerPage();
        desktopPage = new DesktopPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnComputer();
        computerPage.verifyTextcomputer();
        softAssert.assertEquals(computerPage.verifyTextcomputer(),"Computers","");

    }
@Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
    SoftAssert softAssert = new SoftAssert();
    homePage.clickOnComputer();
    computerPage.clickOnDesktop();
    softAssert.assertEquals(desktopPage.verifyTextDesktop(),"Desktops","");

}
@Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.setBuiltyourcomputer();
      buildYourOwnComputerPage.selectProcessor(processor);
      buildYourOwnComputerPage.selectRam(ram);
      buildYourOwnComputerPage.clcikOnHardware(hdd);
      buildYourOwnComputerPage.clickOnSoftwareCheckBox(os);
      buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);

}
}
