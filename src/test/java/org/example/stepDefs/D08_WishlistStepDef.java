package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;



public class D08_WishlistStepDef {
P03_homePage wishlist=new P03_homePage();
SoftAssert soft=new SoftAssert();

@When("user could click on wishlist button")
    public void wishlist_button()

{
    wishlist.wishlist_button.get(2).click();

}

    @Then("user will see success message")
    public void SuccessMessage() {
 String colorMsg=wishlist.successMsg.getCssValue("background-color");
 String successMsg=wishlist.successMsg.getText();
String expectedColor ="rgba(75, 176, 122, 1)";
String expectedMsg="The product has been added to your wishlist";
// System.out.println(colorMsg);
//System.out.println(successMsg);

soft.assertEquals(expectedColor,colorMsg);
soft.assertEquals(expectedMsg,successMsg);
soft.assertAll();

    }

    @Then("product added to user wishlist")
    public void productAddedToUserWishlist() {
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(wishlist.ico_wishlist));
       wishlist.ico_wishlist.click();
      int num= Integer.parseInt(wishlist.quantity.getAttribute("value"));
        soft.assertTrue(num>0);
        soft.assertAll();



    }
}
