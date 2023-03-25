package com.fisglobal.pages;

import com.fisglobal.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    WebElement acceptCookiesTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    WebElement contactUsLinkOnHomePage;
@CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Contact Us')]")
    WebElement verifyText;


    public void clickOnAcceptCookiesLink() {

        clickOnElement(acceptCookiesTab);
        log.info("Clicking on accept cookies link : " + acceptCookiesTab.toString());
    }

    public void clickOnContactUsLinkOnHomePage() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(contactUsLinkOnHomePage);
        log.info("Clicking on contact us link : " + contactUsLinkOnHomePage.toString());

    }

    public String getMessage() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyText);

    }


}
