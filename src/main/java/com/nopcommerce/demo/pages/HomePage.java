package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // loginLink =
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    public void clickLoginLink() {
        Reporter.log("Clicking on login"+ loginLink.toString()+ "<br>");
        clickOnElement(loginLink);
    }

    //    By registerLink = By.linkText("Register");
    @FindBy(linkText = "Register")
    WebElement registerLink;

    public void setRegisterLink() {
        Reporter.log("Clicking on RegisterLink"+ registerLink.toString()+ "<br>");
        clickOnElement(registerLink);
    }

    //    By computerLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;
    public void clickOnComputer() {
        Reporter.log("Clicking on Computer"+ computerLink.toString()+ "<br>");
        clickOnElement(computerLink);
    }


    //    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;
    //    By apparelLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelLink;
    //    By digitaldownloadsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement digitaldownloadsLink;
    //    By booksLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;
    //    By jewelrtLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewelrtLink;
    //    By giftcardsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement giftcardsLink;
    // logo
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logo;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;
    public String verifyLogout() {
        Reporter.log("getting Logout text from "+logout.toString()+"<br>");

        return getTextFromElement(logout);
    }


    //
//    // click on Element from Top Menu
    public void selectMenu(String menu) {
        if (menu.equalsIgnoreCase("Computers")) clickOnElement(computerLink);
        if (menu.equalsIgnoreCase("Electronics")) clickOnElement(electronicsLink);
        if (menu.equalsIgnoreCase("Apparel")) clickOnElement(apparelLink);
        if (menu.equalsIgnoreCase("Digital downloads")) clickOnElement(digitaldownloadsLink);
        if (menu.equalsIgnoreCase("Books")) clickOnElement(booksLink);
        if (menu.equalsIgnoreCase("Jewelry")) clickOnElement(jewelrtLink);
        if (menu.equalsIgnoreCase("Gift Cards")) clickOnElement(giftcardsLink);

    }
}
