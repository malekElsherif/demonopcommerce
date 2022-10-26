package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    SoftAssert soft=new SoftAssert();
P03_homePage slider=new P03_homePage();
    @When("user click on first slide")
    public void first_slide()
    {
        slider.homeSlider.get(0).click();

    }

    @Then("user could direct to nokia-lumia page")
    public void DirectTo_first_slide() {

      String actual_first_url=  Hooks.driver.getCurrentUrl();
      String expected_first_url="https://demo.nopcommerce.com/nokia-lumia-1020";
      soft.assertEquals(actual_first_url,expected_first_url);
      soft.assertAll();



    }
    @When("user click on second slide")
    public void second_slide()
    {
        slider.homeSlider.get(1).click();

    }

    @Then("user could direct to iphone-6 page")
    public void DirectTo_second_slide() {

        String actual_second_url=  Hooks.driver.getCurrentUrl();
        String expected_second_url=" https://demo.nopcommerce.com/iphone-6";
        soft.assertEquals(actual_second_url,expected_second_url);
        soft.assertAll();



    }
}
