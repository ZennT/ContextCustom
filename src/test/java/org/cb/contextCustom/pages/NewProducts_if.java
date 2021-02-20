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

    @FindBy(xpath = "(//h3[@class='product-title font-size-sm'])[3]")
    public WebElement babyJerseyName;

    @FindBy(xpath = "//a[normalize-space()='Unisex V-Neck Tee | Bella + Canvas 3005']")
    public WebElement unisexVNeckTeeName;

    @FindBy(xpath = "//span[contains(text(),'$16.50')]")
    public WebElement embroideredApronPrice;

    @FindBy(xpath = "//span[contains(text(),'$18.73')]")
    public WebElement unisexSpongeFleecePrice;

    @FindBy(xpath = "//span[contains(text(),'$9.95')]")
    public WebElement babyJerseyPrice;

    @FindBy(xpath = "//span[contains(text(),'$14.99')]")
    public WebElement unisexVNeckTeePrice;

    @FindBy(xpath = "(//a[@class='product-meta d-block font-size-xs pb-1'])[1]")
    public WebElement embroideredApronBrand;

    @FindBy(xpath = "(//a[@class='product-meta d-block font-size-xs pb-1'])[2]")
    public WebElement unisexSpongeFleeceBrand;

    @FindBy(xpath = "(//a[@class='product-meta d-block font-size-xs pb-1'])[3]")
    public WebElement babyJerseyBrand;

    @FindBy(xpath = "(//a[@class='product-meta d-block font-size-xs pb-1'])[4]")
    public WebElement unisexVNeckTeeBrand;

    @FindBy(xpath = "//a[normalize-space()='More products']")
    public WebElement moreProductsButton;

    @FindBy(xpath="//li[@class='breadcrumb-item text-nowrap active']//a[normalize-space()='Product Catalog']")
    public WebElement productCatalog;

//    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2'])[1]")
//    public WebElement embroideredApronDesignButton;
//
//    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2'])[2]")
//    public WebElement unisexSpongeFleeceDesignButton;
//
//    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2'])[3]")
//    public WebElement babyJerseyDesignButton;
//
//    @FindBy(xpath = "(//input[@class='btn btn-primary btn-sm btn-block mb-2'])[4]")
//    public WebElement unisexVNeckTeeDesignButton;









}
