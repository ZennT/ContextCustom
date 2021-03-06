package org.cb.contextCustom.pages;

import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProductsPage extends Base {
    NewProductsPage newProductsPage = new NewProductsPage();

    Logger logger = LoggerFactory.getLogger(NewProductsPage.class);
    //Actions action = new Actions(MyDriver.get());

//    public NewProductsPage() {
//        PageFactory.initElements(MyDriver.get(), this);
//    }

    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement embroideredApronImage;

    @FindBy(xpath = "//img[contains(@alt,'3945 Bella Canvas')]")
    public WebElement unisexSpongeFleeceImage;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement babyJerseyImage;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement unisexVNeckTeeImage;

    @FindBy(xpath = "//a[normalize-space()='Context']")
    public WebElement apron;

    @FindBy(xpath = "//a[normalize-space()='More products']")
    public WebElement moreProductsButton;

    @FindBy(xpath = "//div[@class='row pt-4 mx-n2']//div[1]//div[1]//div[2]//input[1]")
    public WebElement designAndBuyButton;




//    String actual;
//    public void verifyTheFields(String value) {
//        if(value.equals(embroideredApronImage.getText())) {
//            actual = embroideredApronImage.getText();
//            Assert.assertEquals(value, actual);
//            logger.info("{} is displayed", value);
//        }else if(value.equals(unisexSpongeFleeceImage.getText())) {
//            actual = unisexSpongeFleeceImage.getText();
//            Assert.assertEquals(value, actual);
//            logger.info("{} is displayed", value);
//        }
//        else logger.warn("Error");
//    }


    public void verifyEmbroideredApronImage() {
        embroideredApronImage.isDisplayed();
    }

    public void verifyUnisexSpongeFleeceImage() {
        unisexSpongeFleeceImage.isDisplayed();
    }

    public void verifyBabyJerseyImage() {
        babyJerseyImage.isDisplayed();
    }

    public void verifyUnisexVNeckTeeImage() {
        unisexVNeckTeeImage.isDisplayed();
    }

    public void moveToApron() {
        //action.moveToElement(apron).click().perform();
        moveAndClickToElement(newProductsPage.apron);

    }

    public void clickOnDesignAndBuy() {
        designAndBuyButton.click();

    }

//    public void clickOnMoreProductsButton() {
//        moreProductsButton.click();
//    }


}


