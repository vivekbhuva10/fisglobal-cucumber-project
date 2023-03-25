package com.fisglobal.pages;

import com.fisglobal.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CareersPage.class.getName());

    public CareersPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
   // @FindBy(xpath = "//button[@click.delegate='acceptAndClose()']")
     @FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/button[2]/i[1]")
    WebElement allowCookiesTabOnCareersPage;

    public void clickAllowCookiesTabOnCareersPage() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(allowCookiesTabOnCareersPage);
        log.info("Clicking on login link : " + allowCookiesTabOnCareersPage.toString());
    }

}
