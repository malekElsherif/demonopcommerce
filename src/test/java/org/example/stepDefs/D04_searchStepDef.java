package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage search=new P03_homePage();
    @When("user click on search field")
    public void userClickOnSearchField() {
        search.SearchField.click();

    }

    @And("user could search using {string}")
    public void userCouldSearchUsing(String arg0) {
        search.SearchField.sendKeys(arg0);
        search.SearchField.sendKeys(Keys.ENTER);

        
    }

    @Then("user could found {string} relative result")
    public void userCouldFoundRelativeResult(String arg0) {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
      int size=  search.products.size();
      System.out.println("size = "+size);

        for (int i=0;i<size;i++)
        {
            String value= search.products.get(i).getText().toLowerCase();
            System.out.println(value);

            soft.assertTrue(value.contains(arg0));
            soft.assertAll();

        }

        
    }

    @Then("user could found {string} inside product details page")
    public void userCouldFoundInsideProductDetailsPage(String arg0) {
        search.sku.click();

//System.out.println(search.skuKey.getText());
Assert.assertTrue(search.skuKey.getText().contains(arg0));
    }
}
