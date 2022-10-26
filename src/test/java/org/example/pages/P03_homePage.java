package org.example.pages;

import io.netty.util.Constant;
import org.example.stepDefs.D05_hoverCategoriesStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {


    public P03_homePage ( )
    {
        PageFactory.initElements(Hooks.driver,this);




    }
    @FindBy(id = "customerCurrency")
    public
    WebElement Parent_select;

    @FindBy(xpath = "//span[@class=\"price actual-price\"]")
    public List<WebElement> price;
@FindBy(xpath = "//form[@method=\"get\"]//input[@id=\"small-searchterms\"]")
    public WebElement SearchField;

@FindBy(className = "product-title")
    public List<WebElement>products;
@FindBy(className = "picture")
    public WebElement sku;
@FindBy(className = "additional-details")
    public WebElement skuKey;

@FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]/li/a[@href]")
    public List <WebElement>hoverList;



 public List<WebElement>subHover(int hoverNum)
 {
    // hoverNum++;//ul[@class=\"top-menu notmobile\"]/li["+hoverNum+"]/ul[@class=\"sublist first-level\"]
     return  Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+(hoverNum+1)+"]/ul[@class=\"sublist first-level\"]//a[@href]"));
 }
@FindBy( className="page-title")
   public WebElement page_title;

 @FindBy(xpath = "//div[@class=\"nivoSlider\"]/a")
    public List <WebElement>homeSlider;



    public List<WebElement>networks()
    {

        return  Hooks.driver.findElements(By.xpath("//ul[@class=\"networks\"]//li/a"));
    }
    @FindBy(xpath = "//button[@class=\"button-2 add-to-wishlist-button\"]")
    public List<WebElement>wishlist_button;
    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div[@class=\"bar-notification success\"]")
    public WebElement successMsg;
    @FindBy(xpath="//a[@class=\"ico-wishlist\"]")
            public WebElement ico_wishlist;

    @FindBy(xpath = "//td[@class=\"quantity\"]/input")
    public WebElement quantity;

}
