package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login=new P02_login();
    @When("user go to login page")
    public void loginPage()
    {
        login.loginBtn.click();

    }

    @And("^user login with \"valid\" \"(.*)\" and \"(.*)\"$")
    public void loginDataS(String e,String p)
    {
        login.loginEmail(e, p);
    }
    @And("user press on login button")
    public void loginBtn()
    {
        login.loginPassword.sendKeys(Keys.ENTER);
    }
    @And("user login to the system successfully")
    public void successLogin()
    {
        SoftAssert soft=new SoftAssert();


        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

       soft.assertTrue(login.MyAccount.isDisplayed());
       soft.assertAll();

    }
    @And("^user login with \"invalid\" \"(.*)\" and \"(.*)\"$")
    public void loginDataF(String e,String p)
    {
        login.loginEmail(e, p);
    }
    @And("user could not login to the system")
    public void UnSuccessLogin()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(login.UnSuccessMsg.getText().contains("Login was unsuccessful"));


        String color= login.UnSuccessMsg.getCssValue("color");


        String hex = Color.fromString(color).asHex();
        System.out.println(hex);

        soft.assertEquals(hex,"#e4434b" );
        soft.assertAll();

    }

}
