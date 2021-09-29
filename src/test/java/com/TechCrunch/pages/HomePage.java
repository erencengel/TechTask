package com.TechCrunch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(css = ".post-block.post-block--image.post-block--unread")
    public List<WebElement> latestNews;

    @FindBy(css = ".post-block.post-block--image.post-block--unread>header>h2>a")
    public List<WebElement> latestNewsStatement;

    @FindBy(css = ".river-byline__authors")
    public List<WebElement> latestAuthors;

    @FindBy(css = ".river-byline__authors>span>a")
    public List<WebElement> latestAuthorsPost;

    @FindBy(xpath = "//img[@sizes='(min-width: 1024px) 430px, 100vw']")
    public List<WebElement> images;

    @FindBy(css = "#logo-gradient")
    public WebElement logo;

}
