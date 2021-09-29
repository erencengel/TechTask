package com.TechCrunch.stepDefs;

import com.TechCrunch.pages.HomePage;
import com.TechCrunch.pages.NewsPage;
import com.TechCrunch.utilities.BrowserUtils;
import com.TechCrunch.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class AnyNewsPageDefs {

        HomePage homePage = new HomePage();
        Random random = new Random();
        NewsPage newsPage = new NewsPage();


    @When("Click any news from The Latest News")
        public void click_any_news_from_The_Latest_News(){
        int numberOfNews = homePage.latestNewsStatement.size();
        int randomNumber = random.nextInt(numberOfNews);
        //click any latest news randomly
        homePage.latestNewsStatement.get(randomNumber).click();
        BrowserUtils.waitForVisibility(newsPage.newsTitle,10);
    }



    @Then("The browser title is the same with the news title")
    public void the_browser_title_is_the_same_with_the_news_title() {
        String newsTitle  = newsPage.newsTitle.getText();
        String browserTitle = Driver.get().getTitle();
        Assert.assertTrue(browserTitle.contains(newsTitle));
    }


    @Then("The links within the news content")
    public void theLinksWithinTheNewsContent() {
        List<WebElement> links = newsPage.links;
        for (WebElement link : links) {
            System.out.println("link = " + link.getAttribute("href"));
        }
    }



}
