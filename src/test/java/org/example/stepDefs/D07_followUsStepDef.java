package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage network=new P03_homePage();
    @When("user opens facebook link")
    public void opens_facebook() throws InterruptedException {
    network.networks().get(0).click();
    Thread.sleep(3000);


    }

    @Then("facebook is opened in new tab")
    public void facebookPageIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String>tabs=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualUrl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.facebook.com/nopCommerce");



    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        network.networks().get(1).click();
        Thread.sleep(3000);

        
    }



    @Then("twitter is opened in new tab")
    public void twitterIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String>tabs=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualUrl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://twitter.com/nopCommerce");


    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        network.networks().get(2).click();
        Thread.sleep(3000);


    }

    @Then("new-online-store is open is opened in new tab")
    public void newOnlineStoreIsOpenIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String>tabs=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualUrl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://demo.nopcommerce.com/new-online-store-is-open");


    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        network.networks().get(3).click();
        Thread.sleep(3000);

    }

    @Then("youtube is opened in new tab")
    public void youtubeIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String>tabs=new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualUrl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.youtube.com/user/nopCommerce");

    }
}
