package Homework_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task5 {

    @Test
    public void task5() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
        webDriver.get("https://demoqa.com/dynamic-properties");

        //WebElement visible = webDriver.findElement(By.cssSelector("#visibleAfter"));
        //webDriverWait.until(ExpectedConditions.visibilityOf(visible));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibleAfter")));

        webDriver.quit();
    }
}
