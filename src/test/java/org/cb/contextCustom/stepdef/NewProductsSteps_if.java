package org.cb.contextCustom.stepdef;

import io.cucumber.java.en.And;
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
            textIsDisplayedAndEnabled(value,newProducts_if.embroideredApronName);
           // System.out.println(newProducts_if.unisexSpongeFleeceName.getText());
        }
        else if(value.equals(newProducts_if.unisexSpongeFleeceName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexSpongeFleeceName);
            //System.out.println(newProducts_if.babyJerseyName.getText());
        }
        else if(value.equals(newProducts_if.babyJerseyName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.babyJerseyName);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeeName.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexVNeckTeeName);
        }
        else logger.warn("Error");
    }


    @Then("Verifies that {string} is present")
    public void verifiesThatIsPresent(String value) {
        if(value.equals(newProducts_if.embroideredApronPrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.embroideredApronPrice);
        }
        else if(value.equals(newProducts_if.unisexSpongeFleecePrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexSpongeFleecePrice);
        }
        else if(value.equals(newProducts_if.babyJerseyPrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.babyJerseyPrice);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeePrice.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexVNeckTeePrice);
        }
        else logger.warn("Error");
    }

    @Then("Verifies that {string} brand name is present")
    public void verifiesThatBrandIsPresent(String value) {
        if(value.equals(newProducts_if.embroideredApronBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.embroideredApronBrand);
        }
        else if(value.equals(newProducts_if.unisexSpongeFleeceBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexSpongeFleeceBrand);
        }
        else if(value.equals(newProducts_if.babyJerseyBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.babyJerseyBrand);
        }
        else if(value.equals(newProducts_if.unisexVNeckTeeBrand.getText())){
            textIsDisplayedAndEnabled(value,newProducts_if.unisexVNeckTeeBrand);
        }
        else logger.warn("Error");
    }


    @And("Clicks on More Products button")
    public void clicksOnMoreProductsButton() {
        newProducts_if.moreProductsButton.click();
        logger.info("Clicks on More Products Button");
        newProducts_if.productCatalog.isDisplayed();
        logger.info("Product Catalog is present");
    }


//    @Then("Verifies that {string} button is present")
//    public void verifiesThatButtonIsPresent(String value) {
//        if(value.equals(newProducts_if.embroideredApronDesignButton.getText())){
//            verifyTheText("Design & Buy","Design & Buy");
//            System.out.println("bbbb");
//        }
//    }
//
//
//    @Then("Moves to {string}")
//    public void movesTo(String value) {
//        moveToElement(newProducts_if.embroideredApronDesignButton);
//
//    }
}


