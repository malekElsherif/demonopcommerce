package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
P03_homePage selector=new P03_homePage();

    @When("user select euro currency from the dropdown list")
    public void user_select_euro()
    {
        Select select=new Select(selector.Parent_select);
        select.selectByVisibleText("Euro");
    }

    @Then("Euro Symbol  is shown on the  products displayed in Home page")
    public void euroSymbolIsShown()
    {
for (int i=0;i<4;i++)
{
   String value= selector.price.get(i).getText();
    System.out.println(value);
    Assert.assertTrue(value.contains("€"));
}
    }



}
