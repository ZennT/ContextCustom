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
        else if(value.equals(newProducts_if.unisexSpongeFleeceImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts_if.unisexSpongeFleeceImage);
        }
        else if(value.equals(newProducts_if.babyJerseyImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts_if.babyJerseyImage);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeeImage.getAttribute("alt"))){
            imageIsDisplayedAndEnabled(newProducts_if.unisexVNeckTeeImage);
        }

        else logger.warn("Error");
    }

    @Then("Verifies that {string} item name is present")
    public void verifiesThatItemNameIsPresent(String value) {

        if(value.equals(newProducts_if.embroideredApronName.getText())){
            textIsDisplayedAndEnabled("Embroidered Apron",newProducts_if.embroideredApronName);
        }
        else if(value.equals(newProducts_if.unisexSpongeFleeceName.getText())){
            textIsDisplayedAndEnabled("Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas", newProducts_if.unisexSpongeFleeceName);
        }
        else if(value.equals(newProducts_if.babyJerseyName.getText())){
            textIsDisplayedAndEnabled("Baby Jersey Short Sleeve One Piece | 100B Bella Canvas",newProducts_if.babyJerseyName);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeeName.getText())){
            textIsDisplayedAndEnabled("Unisex V-Neck Tee | Bella + Canvas 3005",newProducts_if.unisexVNeckTeeName);
        }
        else logger.warn("Error");
    }


}


