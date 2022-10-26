package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class P01_register {


    public P01_register ()
    {
        PageFactory.initElements(Hooks.driver,this);
        registerLink.click();

    }
    @FindBy(className=("ico-register"))
   public WebElement registerLink;

    @FindBy(className = "male")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement day;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;

    @FindBy(name = "DateOfBirthYear")
    public WebElement year;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    public WebElement register_button;

    @FindBy(className = "result")
    public WebElement successMsg;



    public void registerName(String FName,String LName)
    {

        firstName.sendKeys(FName);
        lastName.sendKeys(LName);


    }
    public void registerEmail(String Email)
    {
        email.sendKeys(Email);

    }
    public void registerPassword(String Password,String CPassword)
    {
        password.sendKeys(Password);
        ConfirmPassword.sendKeys(CPassword);
    }






}
