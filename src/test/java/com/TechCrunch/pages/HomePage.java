package com.TechCrunch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(css = "post-block post-block--image post-block--unread")
    public List<WebElement> latestNews;

    @FindBy(css = ".river-byline__authors")
    public List<WebElement> latestAuthors;

}
