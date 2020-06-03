package com.test.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDownDemo {

    private static WebDriver driver;

    public SeleniumDropDownDemo(WebDriver driver){
         this.driver=driver;
    }

    public  WebDriver getChromeInstance(){
        driver = new ChromeDriver();
        return driver;
    }

    public void getWebsiteToDemo() throws InterruptedException {//camel case
        driver=getChromeInstance();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        Select dropDown = new Select(driver.findElement(By.id("testingDropdown")));
        dropDown.selectByVisibleText("Performance Testing");
        Thread.sleep(5000);

        WebElement textBoxToEnter = driver.findElement(By.xpath("//*[@name='firstName']"));
        textBoxToEnter.isDisplayed();
        textBoxToEnter.sendKeys("Hello World");
        WebElement buttonToClick = driver.findElement(By.cssSelector("#idOfButton"));
        buttonToClick.isDisplayed();
        buttonToClick.click();

        //WebElement linkText = driver.findElement(By.linkText("This is a link"));
        WebElement linkText = driver.findElement(By.partialLinkText("is a link"));
        linkText.isDisplayed();
        linkText.click();
        String pageUrlAfterClick = driver.getCurrentUrl();
        String expectedUrl = "https://www.javatpoint.com/";
        Assert.assertEquals(expectedUrl,pageUrlAfterClick);
    }

    public void killBrowserInstance(){
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        SeleniumDropDownDemo sd = new SeleniumDropDownDemo(driver);
        sd.getWebsiteToDemo();
        sd.killBrowserInstance();
    }





}
