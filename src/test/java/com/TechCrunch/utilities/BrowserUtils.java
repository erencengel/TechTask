package com.TechCrunch.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static WebElement waitForClickability(WebElement element, int time){
        WebDriverWait webDriverWait = new WebDriverWait(Driver.get(),time);
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForVisibility(WebElement element,int time){
        WebDriverWait webDriverWait = new WebDriverWait(Driver.get(),time);
        return webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isImageDisplayed(WebDriver driver, WebElement imageElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        return (boolean) javascriptExecutor.executeScript("return arguments[0].complete "
                + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                + "&& arguments[0].naturalWidth > 0", imageElement);
    }

}
