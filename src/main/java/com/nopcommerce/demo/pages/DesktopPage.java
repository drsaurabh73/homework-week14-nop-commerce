package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopPage extends Utility {

      public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    //desktop text
    @FindBy (xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktoptext;
      public String verifyTextDesktop() {
          Reporter.log("getting DeskTop text from "+desktoptext.toString()+"<br>");
          return getTextFromElement(desktoptext);
      }
      // bulit your own computer  =
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement builtyourcomputer;
      public void setBuiltyourcomputer() {
          Reporter.log("Clicking on Built your computer"+ builtyourcomputer.toString()+ "<br>");
          clickOnElement(builtyourcomputer);
      }
      // sort by
    @FindBy (xpath = "//span[contains(text(),'Sort by')]")
    WebElement sortby;
      public void clickOnSortBy() {
          Reporter.log("Clicking on Sort By"+ sortby.toString()+ "<br>");
          clickOnElement(sortby);
      }
      // display
    @FindBy(xpath = "//span[contains(text(),'Display')]")
    WebElement display;
      public void clickOnDisplay() {
          Reporter.log("Clicking on Display"+ display.toString()+ "<br>");
          clickOnElement(display);
      }
      //list product
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listproduct;
    public void clickOnListProduct() {
        Reporter.log("Clicking on List product"+ listproduct.toString()+ "<br>");
        clickOnElement(listproduct);
    }
}
