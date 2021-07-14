package Homework_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskD {
        @Test
        public void taskC () {
            WebDriverManager.chromedriver().setup();
            WebDriver webDriver = new ChromeDriver();
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            webDriver.get("https://www.amazon.com/");

            WebElement todayDeals = webDriver.findElement(By.xpath("//a[normalize-space()=\"Today's Deals\"]"));
            javascriptExecutor.executeScript("arguments[0].click()", todayDeals);

            WebElement addItem = webDriver.findElement(By.cssSelector("a[id='100 b9195b90-announce']"));
            javascriptExecutor.executeScript("arguments[0].click()", addItem);

            WebElement addToCart = webDriver.findElement(By.cssSelector("#add-to-cart-button"));
            javascriptExecutor.executeScript("arguments[0].click()", addToCart);

            WebElement proceedButton = webDriver.findElement(By.cssSelector("#hlb-ptc-btn-native"));
            javascriptExecutor.executeScript("arguments[0].click()", proceedButton);

            webDriver.manage().deleteAllCookies();
            webDriver.quit();
        }
    }
