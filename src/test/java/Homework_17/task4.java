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

public class task4 {

    @Test
    public void task4() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
        webDriver.get("https://demoqa.com/progress-bar");

        WebElement start = webDriver.findElement(By.cssSelector("#startStopButton"));
        start.click();
        WebElement reset = webDriver.findElement(By.cssSelector("#resetButton"));
        webDriverWait.until(ExpectedConditions.visibilityOf(reset));
        reset.click();

        WebElement startAgain = webDriver.findElement(By.cssSelector("#startStopButton"));
        webDriverWait.until(ExpectedConditions.visibilityOf(startAgain));

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}