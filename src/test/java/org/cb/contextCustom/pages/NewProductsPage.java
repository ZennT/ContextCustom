package org.cb.contextCustom.pages;

import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewProductsPage extends Base {

    public NewProductsPage() {
        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement embroideredApronImage;

    public void verifyEmbroideredApronImage(){
        embroideredApronImage.isDisplayed();

    }
}
