package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register=new P01_register();


    @When("user select gender type")
    public void select_gender()
    {
        register.gender.click();

    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enter_FName_And_LName(String FirstName,String LastName)
    {
        register.registerName(FirstName,LastName);
    }
    @And("^user enter email \"(.*)\" field$")
    public void registerEmail(String Email)
    {
        register.registerEmail(Email);
    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth()
    {
        Select select=new Select(register.day);
        select.selectByVisibleText("20");

         select=new Select(register.month);
        select.selectByVisibleText("June");

         select=new Select(register.year);
        select.selectByVisibleText("2002");

    }

    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void registerPassword(String Password,String CPassword)
    {
        register.registerPassword(Password,CPassword);
    }
    @And("user clicks on register button")
       public void register_button()
    {
        register.register_button.click();
    }
    @Then("success message is displayed")
    public void successMessage()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.successMsg.isDisplayed());
       String color= register.successMsg.getCssValue("color");
        System.out.println(color);


     String msgColor ="rgba(76, 177, 124, 1)";
    soft.assertEquals(color,msgColor);
       // System.out.println(msgColor);

        soft.assertAll();

    }


}
