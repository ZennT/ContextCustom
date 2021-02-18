package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.cb.contextCustom.pages.NewProducts_if;
import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProductsSteps_if extends Base {

    NewProducts_if newProducts_if = new NewProducts_if();

    @Given("User is on landing page")
    public void userIsOnLandingPage() {
        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        logger.info("User is on LandingPage");
    }

    @Then("Verifies that {string} is displayed")
    public void verifiesThatIsDisplayed(String value) {


        if(value.equals(newProducts_if.embroideredApronImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts_if.embroideredApronImage);
        }

        else logger.warn("Error");
    }

    @Then("Verifies that {string} item name is present")
    public void verifiesThatItemNameIsPresent(String arg0) {
    }


}


