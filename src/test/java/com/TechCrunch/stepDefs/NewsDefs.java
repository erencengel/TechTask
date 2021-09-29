package com.TechCrunch.stepDefs;

import com.TechCrunch.pages.HomePage;
import com.TechCrunch.utilities.ConfigurationReader;
import com.TechCrunch.utilities.Driver;
import io.cucumber.java.en.Given;

public class NewsDefs {

    HomePage homePage = new HomePage();
    @Given("Navigate to homepage")
    public void navigate_to_homepage() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println("homePage.latestAuthors.get(0).getText() = " + homePage.latestAuthors.get(0).getText());
        Thread.sleep(5000);
    }

}
