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

            WebElement addItemToCart = webDriver.findElement(By.xpath("(//button[contains(text(), 'Add to Cart')])"));
            javascriptExecutor.executeScript("arguments[0].click()", addItemToCart);

            WebElement goTOCart = webDriver.findElement(By.xpath("//a[@id='nav-cart']"));
            javascriptExecutor.executeScript("arguments[0].click()", goTOCart);

            WebElement proceed = webDriver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
            javascriptExecutor.executeScript("arguments[0].click()", proceed);

            webDriver.manage().deleteAllCookies();
            webDriver.quit();
        }
    }
