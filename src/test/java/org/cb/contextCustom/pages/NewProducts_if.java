package org.cb.contextCustom.pages;

import org.cb.contextCustom.stepdef.Base;
import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProducts_if  {

    public NewProducts_if() {

        PageFactory.initElements(MyDriver.get(), this);
    }

    @FindBy(xpath = "//img[@alt='Embroidered Apron']")
    public WebElement embroideredApronImage;

    @FindBy(xpath = "//img[contains(@alt,'3945 Bella Canvas')]")
    public WebElement unisexSpongeFleeceImage;

    @FindBy(xpath = "//img[contains(@alt,'100B Bella Canvas')]")
    public WebElement babyJerseyImage;

    @FindBy(xpath = "//img[@alt='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeImage;

    @FindBy(xpath = "//a[normalize-space()='Embroidered Apron']")
    public WebElement embroideredApronName;

    @FindBy(xpath = "//a[contains(text(),'Unisex Sponge Fleece Drop Shoulder Sweatshirt')]")
    public WebElement unisexSpongeFleeceName;

    @FindBy(xpath = "//a[contains(text(),'Baby Jersey Short Sleeve One Piece |')]")
    public WebElement babyJerseyName;

    @FindBy(xpath = "//a[normalize-space()='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeName;




    @FindBy(xpath = "//a[normalize-space()='More products']")
    public WebElement moreProductsButton;










}
