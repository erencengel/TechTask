package com.TechCrunch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewsPage extends BasePage {

    @FindBy(css = ".article__title")
    public WebElement newsTitle;

    @FindBy(xpath = "//div[@class='article-content']/p/a[@href]")
    public List<WebElement> links;

}
