package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // email = //input[@id='Email']
    @FindBy (xpath = "//input[@id='Email']")
    WebElement email;
    public void setEmail(String text){
        Reporter.log("Enter email"+text+ " to email field "+email.toString() + "<br>");
        sendTextToElement(email,text);
    }
    //password
    @FindBy (xpath = "//input[@id='Password']")
    WebElement password;
    public void setPassword(String text) {
        Reporter.log("Enter email"+text+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,text);
    }
    // login
    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    WebElement login;
    public void clickOnLogin() {
        Reporter.log("Clicking on login"+ login.toString()+ "<br>");
        clickOnElement(login);
    }

    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    WebElement loginverify;

    public String verifyLoginText() {
        Reporter.log("getting Login text from "+loginverify.toString()+"<br>");

        return getTextFromElement(loginverify);
    }
    // verify Welcome, Please Sign In!
    @FindBy (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    public String verifyWelcomeTextMessage() {
        Reporter.log("getting Welcome text from "+verifyWelcome.toString()+"<br>");

        return getTextFromElement(verifyWelcome);
    }
}
