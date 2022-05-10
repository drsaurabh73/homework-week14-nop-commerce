package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    //computer text
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computertext;

    public String verifyTextcomputer() {
        Reporter.log("getting signout text from "+computertext.toString()+"<br>");
        return getTextFromElement(computertext);
    }

    // Desktop
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement desktop;

    public void clickOnDesktop() {
        Reporter.log("Clicking on Desktop"+ desktop.toString()+ "<br>");
        clickOnElement(desktop);
    }

    //Notebook
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement notebook;

    public void clickOnNoteBook() {
        Reporter.log("Clicking on noteBook"+ notebook.toString()+ "<br>");
        clickOnElement(notebook);
    }
    //software
    @FindBy (xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement software;
    public void clickOnSoftware() {
        Reporter.log("Clicking on Software"+ software.toString()+ "<br>");
        clickOnElement(software);
    }
}