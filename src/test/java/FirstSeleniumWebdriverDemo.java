import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstSeleniumWebdriverDemo {
    WebDriver driver = null;

    public WebDriver getChromeDriverInstance(){
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getFirefoxDriverInstance(){
        System.setProperty("webdriver.gecko.driver","/usr/local/bin/gekodriver");
        //DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        driver = new FirefoxDriver();
        return driver;
    }

    public void getWebsite(String browser) throws InterruptedException {
        if(browser.equalsIgnoreCase("chrome")) {
            driver = getChromeDriverInstance();
        }
        else {
            driver = getFirefoxDriverInstance();
        }
        driver.get("https://www.wikipedia.org/");
        WebElement inputTextBox = driver.findElement(By.id("searchInput"));
        boolean idPresenter = inputTextBox.isDisplayed();
        System.out.println("************"+idPresenter);
        inputTextBox.sendKeys("Carona virus");
        Thread.sleep(2000);
        /**
         * id = id of webelement,
         * className = class of the webelement
         * xpath = xpath locator
         * css = Cascade style Sheet
         * linkText = the link available to find
         * partialLinkText = the substring in a link
         * tagName = the referencing anchor or
         *
         */
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button"));
        searchBox.click();
        String expectedBrowserTitle = "Carona virus - Search results - Wikipedia";
        String obtainedBrowserTitle = driver.getTitle();
        Assert.assertEquals(expectedBrowserTitle,obtainedBrowserTitle);
        WebElement searchResultsTextBox = driver.findElement(By.id("ooui-php-1"));
        String obtainedText = searchResultsTextBox.getText();
    }

    public void closeBrowserInstance(){
        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {

        FirstSeleniumWebdriverDemo classObj = new FirstSeleniumWebdriverDemo();
        classObj.getWebsite("chrome");
        classObj.closeBrowserInstance();
    }
}
