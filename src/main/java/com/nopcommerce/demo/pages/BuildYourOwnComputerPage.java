package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    //By processor = By.xpath("//select[@id='product_attribute_1']");////| 2.2 GHz Intel Pentium Dual-Core E2200 | = //select[@id='product_attribute_1']
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processor;

    public void selectProcessor(String intel) {
        Reporter.log("Enter email"+intel+ " to email field "+processor.toString() + "<br>");
        selectByVisibleTextFromDropDown(processor, intel);
    }

    //    By ram = By.xpath("//select[@name='product_attribute_2']");
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ram;

    public void selectRam(String text) {
        Reporter.log("Selecting RAM "+text+" from dropdown "+ram.toString() + "<br>");
        selectByVisibleTextFromDropDown(ram, text);
    }

    //    By harddrive  = By.xpath("//input[@value='7']");
    @FindBy(xpath = "//input[@value='7']")
    WebElement harddrive;

    public void setHarddrive() {
        Reporter.log("Clicking on Hard drive"+ harddrive.toString()+ "<br>");
        clickOnElement(harddrive);
    }

    //    By operatingsystem   =   By.xpath("//input[@value='9']");
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement operatingsystem;

    public void setOperatingsystem() {
        Reporter.log("Clicking on operating system"+ operatingsystem.toString()+ "<br>");
        clickOnElement(operatingsystem);
    }

    //    By software = By.xpath("//input[@name='product_attribute_5' and @value='12']");
    @FindBy(xpath = "//input[@name='product_attribute_5' and @value='12']")
    WebElement software;

    public void setSoftware() {
        Reporter.log("Clicking on software"+ software.toString()+ "<br>");
        clickOnElement(software);
    }

    //    By actualMessage1 = By.xpath("//h1[text()='Build your own computer']");
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement verifyBulidYourComputer;

    public String verifyTextBuiltYourComputer() {
        Reporter.log("getting Build your own computer text from "+verifyBulidYourComputer.toString()+"<br>");
        return getTextFromElement(verifyBulidYourComputer);
    }

    //    By addtocart = By.xpath("//button[@class='button-1 add-to-cart-button']");
    @FindBy(xpath = "//button[@class='button-1 add-to-cart-button']")
    WebElement addtocart;


    //    By actualMessage3 = By.xpath("//p[@class='content']");
    @FindBy(xpath = "//p[@class='content']")
    WebElement verfytheshoppingtext;

    public String verifyTheShoppingcartText() {
        Reporter.log("verify the text shopping cart"+ verfytheshoppingtext.toString()+ "<br>");
        return getTextFromElement(verfytheshoppingtext);
    }

    //    By closeButton = By.xpath("//span[@title='Close']");
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closebutton;

    public void clickOnCloseButton() {
        Reporter.log("Clicking on Close Button"+ closebutton.toString()+ "<br>");
        clickOnElement(closebutton);
    }

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            Reporter.log("Clicking on VistaHome"+ VistaHome1.toString()+ "<br>");
            clickOnElement(VistaHome1);
        } else {
            Reporter.log("Clicking on VistaPremium"+ VistaPremium.toString()+ "<br>");
            clickOnElement(VistaPremium);

        }

    }

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice1;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            Reporter.log("Clicking on Microsoftoffice"+ MicrosoftOffice1.toString()+ "<br>");
            clickOnElement(MicrosoftOffice1);
        }
        if (software == "TotalCommander") {
            Reporter.log("Clicking on TotalCommander"+ TotalCommander1.toString()+ "<br>");
            clickOnElement(TotalCommander1);
        }
        if (software == "AcrobatReader") {
            Reporter.log("Clicking on AcrobatReader"+ AcrobatReader1.toString()+ "<br>");
            clickOnElement(AcrobatReader1);
        }
    }
    @FindBy (xpath = "//input[@id='product_attribute_3_6']")
    WebElement Harddrive;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement Harddrive1;

    public void clcikOnHardware(String HDD) {
        if(HDD == "320GB") {
            Reporter.log("Clicking on Hardware"+ harddrive.toString()+ "<br>");
            clickOnElement(harddrive);
        } else {
            Reporter.log("Clicking on Harddrive"+ Harddrive1.toString()+ "<br>");
            clickOnElement(Harddrive1);
        }

    }
}
// 2 GB | = //select[@id='product_attribute_2']
// 320 GB | = //input[@id='product_attribute_3_6']
// Vista Home [+$50.00] | = //input[@id='product_attribute_4_8']

//Microsoft Office [+$50.00] | = //input[@id='product_attribute_5_10']


// 4GB [+$20.00] | = //select[@id='product_attribute_2']
// 400 GB [+$100.00] | = //input[@id='product_attribute_3_7']
//Vista Premium [+$60.00] | = //input[@id='product_attribute_4_9']
// Acrobat Reader [+$10.00] | = //input[@id='product_attribute_5_11']

//| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] |
// 8GB [+$60.00] |= //select[@id='product_attribute_2']
// 320 GB | = //input[@id='product_attribute_3_6']
// Vista //Home [+$50.00] | = //input[@id='product_attribute_4_8']
// Total Commander [+$5.00] = //input[@id='product_attribute_5_12']