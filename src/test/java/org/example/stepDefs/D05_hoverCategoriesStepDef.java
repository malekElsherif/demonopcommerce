package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage hover=new P03_homePage();
    public int randomCategory=new Random().nextInt(3);
    @When("user could  hover on the selected category")
    public void select_random_categories()  {

        Actions action=new Actions(Hooks.driver);
        action.moveToElement(hover.hoverList.get(randomCategory)).perform();
    }


    public int random=new Random().nextInt(3);
 @And("user could select random one of the three sub cateogries")
    public void Select_Random_SubCateogries() {

     hover.subHover(randomCategory).get(randomCategory).click();
    }

    @Then("user need to get text of the page title")
    public void PageTitle() {
        String x=hover.subHover(random).get(random).getText().toLowerCase().trim();
        String title=hover.page_title.getText().toLowerCase().trim();
        //System.out.println(title);
        Assert.assertTrue(title.contains(x));
    }
}
