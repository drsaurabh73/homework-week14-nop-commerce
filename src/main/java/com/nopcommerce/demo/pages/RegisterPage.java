package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    // verify register
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement register;
    public String verifyTextRegister() {
        Reporter.log("getting register text from "+register.toString()+"<br>");
        return getTextFromElement(register);
    }
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleraido;
    public void clickOnRadioButton() {

        Reporter.log("Clicking on Radio Button"+ maleraido.toString()+ "<br>");
        clickOnElement(maleraido);
    }


    //    By firstname = By.xpath("//input[@id='FirstName']");
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;
    public void getFirstName(String text) {
        Reporter.log("Enter email"+text+ " to email field "+firstname.toString() + "<br>");

        sendTextToElement(firstname,text);
    }
    // first name is required
    @FindBy (xpath =  "//span[@id='FirstName-error']")
    WebElement namerequired;
    public String verifyFirstNamerequired() {

        Reporter.log("getting Firstname text from "+namerequired.toString()+"<br>");
        return getTextFromElement(namerequired);
    }
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastnamerequired;
    public String verifyLastNamerequired() {

        Reporter.log("getting Lastname  text from "+lastnamerequired.toString()+"<br>");
        return getTextFromElement(lastnamerequired);
    }
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailrequired;
    public String verifyEmailfieldRequired() {

        Reporter.log("getting signout text from "+emailrequired.toString()+"<br>");
        return getTextFromElement(emailrequired);
    }
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;
    public String verifyPasswordRequired() {

        Reporter.log("getting signout text from "+passwordrequired.toString()+"<br>");
        return getTextFromElement(passwordrequired);
    }
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement reconifrmpasswordrequired;
    public String verifyreconfirmpasswordrequired() {

        Reporter.log("getting signout text from "+reconifrmpasswordrequired.toString()+"<br>");
        return getTextFromElement(reconifrmpasswordrequired);
    }


    //    By lastname = By.xpath("//input[@id='LastName']");
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;
    public void getLastName (String text){
        sendTextToElement(lastname,text);
    }
    //date of Birth
    @FindBy (xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dateofbirth;
    public void setDateofbirth(String text) {
        selectByVisibleTextFromDropDown(dateofbirth,text);
    }
    // birth of month
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthofBirth;
    public void setMonthofBirth(String text) {
        selectByVisibleTextFromDropDown(monthofBirth,text);
    }
    // year of birth
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearofbirth;
    public void setYearofbirth(String text) {
        selectByVisibleTextFromDropDown(yearofbirth,text);
    }






    //    By email = By.xpath("//input[@type='email' and @name='Email']");

    @FindBy(xpath = "//input[@type='email' and @name='Email']")
    WebElement email;
    public void getemailaddress(String text) {
        sendTextToElement(email,text);
    }

    //    By password = By.xpath("//input[@id='Password']");
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    public void getPassword(String text) {
        sendTextToElement(password,text);
    }
    //    By confirmpassword = By.xpath("//input[@name='ConfirmPassword']");
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmpassword;
    public void getConfirmPassword(String text) {
        sendTextToElement(confirmpassword,text);
    }
    //    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickregister;
    public void getClickOnRegister() {
        clickOnElement(clickregister);
    }

    //    By actualMessage1 = By.xpath("//div[contains(text(),'Your registration completed')]");// registration completed
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement actualMessage1;
    public String verifyRegistrationComplete() {
        return getTextFromElement(actualMessage1);
    }
    //    By clickcontinue = By.xpath("//a[text()='Continue']");
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement clickcontinue;
    public void setClickContinue() {
        clickOnElement(clickcontinue);
    }

}
