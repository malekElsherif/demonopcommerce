package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class P02_login {
    public P02_login()
    {

       PageFactory.initElements(Hooks.driver,this);

    }
    @FindBy(className = "ico-login")
    public WebElement loginBtn;

    @FindBy(className = "email")
    public WebElement loginEmail;

    @FindBy(className = "password")
    public WebElement loginPassword;


    @FindBy(xpath = "//div[@class=\"header\"]//a[@href=\"/customer/info\"]")
    public WebElement MyAccount;

    @FindBy(className = "message-error")
  public WebElement UnSuccessMsg;
    public void loginEmail(String Email,String Password)
    {
        loginEmail.sendKeys(Email);
        loginPassword.sendKeys(Password);
    }


}
