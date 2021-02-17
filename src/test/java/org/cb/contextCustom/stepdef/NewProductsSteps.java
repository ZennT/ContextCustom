package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.NewProductsPage;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProductsSteps {
    Logger logger = LoggerFactory.getLogger(NewProductsSteps.class);
    NewProductsPage newProductsPage = new NewProductsPage();

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on LandingPage");
    }

    @Then("Verifies that Embroidered Apron picture is present")
    public void verifiesThatEmbroideredApronPictureIsPresent() {
        newProductsPage.verifyEmbroideredApronImage();
        logger.info("Apron image is present");

    }
}
