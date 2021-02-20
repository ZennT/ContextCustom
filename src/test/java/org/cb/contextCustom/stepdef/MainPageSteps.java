package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.MainPage;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageSteps extends Base{
    MainPage mainPage = new MainPage();
    Logger logger = LoggerFactory.getLogger(MainPageSteps.class);


    @Given("User is in landing page")
    public void userIsInLandingPage() {
//        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        String expected = "Context Custom";
        String actual = MyDriver.get().getTitle();
        Assert.assertEquals(expected, actual);

        logger.info("contextcustom.com website title is {}", actual);
    }

    @Then("Verify that Context Custom logo is present")
    public void verifyThatContextCustomLogoIsPresent() {
        mainPage.logo.isDisplayed();
        logger.info("ContextCustom logo is displayed.");
    }


}
