package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
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

//    @Then("Verifies that {string} is present")
//    public void verifiesThatIsPresent(String value) {
//        newProductsPage.verifyTheFields(value);
//    }

    @Then("Verifies that Embroidered Apron image is present")
    public void verifiesThatEmbroideredApronImageIsPresent() {
        newProductsPage.verifyEmbroideredApronImage();
        logger.info("Apron image is present");

    }

    @Then("Verifies that UnisexSpongeFleece image is present")
    public void verifiesThatUnisexSpongeFleeceImageIsPresent() {
        newProductsPage.verifyUnisexSpongeFleeceImage();
        logger.info("Unisex Sponge Fleece Image is present");
    }


    @Then("Verifies that Baby Jersey image is present")
    public void verifiesThatBabyJerseyImageIsPresent() {
        newProductsPage.verifyBabyJerseyImage();
        logger.info("Baby Jersey Image is present");
    }

    @Then("Verifies that Unisex V-Neck Tee image is present")
    public void verifiesThatUnisexVNeckTeeImageIsPresent() {
        newProductsPage.verifyUnisexVNeckTeeImage();
        logger.info("Unisex V-NeckTee image is present");
    }


    @Then("Moves to apron part")
    public void movesToApronPart() {
        newProductsPage.moveToApron();
        logger.info("Moves to Apron");
    }

    @And("Clicks on Design and Buy")
    public void clicksOnDesignAndBuy() {
        newProductsPage.clickOnDesignAndBuy();
        logger.info("Clicks on Design and Buy");
    }


//    @Then("Clicks on More Products button")
//    public void clicksOnMoreProductsButton() {
//        newProductsPage.clickOnMoreProductsButton();
//        logger.info("Clicks on More Products Button");
//    }



}
