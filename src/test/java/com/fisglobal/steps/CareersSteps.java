package com.fisglobal.steps;

import com.fisglobal.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CareersSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOnAcceptCookiesLink();
    }
    @Then("^I click on contact us link$")
    public void iClickOnContactUsLink() throws InterruptedException {
        new HomePage().clickOnContactUsLinkOnHomePage();

    }

    @Then("^I verify text om contact us page$")
    public void iVerifyTextOmContactUsPage() throws InterruptedException {
        String expectedMessage = "Contact Us";
        String actualMessage = new HomePage().getMessage();
        Assert.assertEquals("displayed", expectedMessage, actualMessage);


    }
}
