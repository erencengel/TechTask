package com.TechCrunch.stepDefs;

import com.TechCrunch.pages.HomePage;
import com.TechCrunch.utilities.BrowserUtils;
import com.TechCrunch.utilities.ConfigurationReader;
import com.TechCrunch.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class NewsDefs {


    HomePage homePage = new HomePage();
    @Given("Navigate to homepage")
    public void navigate_to_homepage() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickability(homePage.latestNewsStatement.get(0),10);
    }



    @Then("Verify that each news has an image")
    public void verifyThatEachNewsHasAnImage() {
        Boolean bool;
        for (int i=0;i<homePage.images.size();i++){
        bool = BrowserUtils.isImageDisplayed(Driver.get(),homePage.images.get(i));
        Assert.assertTrue(bool);
    }
    }


    @Then("Verify that each news has an author")
    public void verifyThatEachNewsHasAnAuthor() {
        for (int i=0;i<homePage.latestAuthors.size();i++){
            WebElement authorName = homePage.latestAuthors.get(i);
            Assert.assertTrue(authorName.isDisplayed());
        }
    }


}
