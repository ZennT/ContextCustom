package org.cb.contextCustom.pages;

import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.MyDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProductsPage extends Base {
    Logger logger = LoggerFactory.getLogger(NewProductsPage.class);

//    public NewProductsPage() {
//        PageFactory.initElements(MyDriver.get(), this);
//    }

    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement embroideredApronImage;

    @FindBy(xpath = "//img[contains(@alt,'3945 Bella Canvas')]")
    public WebElement unisexSpongeFleeceImage;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement babyJerseyImage;


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


    public void verifyEmbroideredApronImage(){
        embroideredApronImage.isDisplayed();
    }

    public void verifyUnisexSpongeFleeceImage(){
        unisexSpongeFleeceImage.isDisplayed();
    }

    public void verifyBabyJerseyImage(){
        babyJerseyImage.isDisplayed();
    }


}
