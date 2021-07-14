package Homework_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskA {

    @Test
    public void taskA() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://demoqa.com/login");

        WebElement userName = webDriver.findElement(By.cssSelector("#userName"));
        userName.sendKeys("AnnaTest");

        WebElement password = webDriver.findElement(By.cssSelector("#password"));
        password.sendKeys("Qwerty1!");

        WebElement loginButton = webDriver.findElement(By.cssSelector("#login"));
        loginButton.click();

        WebElement bookStore = webDriver.findElement(By.cssSelector("#gotoStore"));
        javascriptExecutor.executeScript("arguments[0].click()", bookStore);

        WebElement selectFirstBook = webDriver.findElement(By.cssSelector("a[href='/books?book=9781449325862']"));
        selectFirstBook.click();

        WebElement addToYourCollectionButton = webDriver.findElement(By.xpath("//button[normalize-space()='Add To Your Collection']"));
        javascriptExecutor.executeScript("arguments[0].click()", addToYourCollectionButton);
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        WebElement backToStore = webDriver.findElement(By.xpath("//button[normalize-space()='Back To Book Store']"));
        javascriptExecutor.executeScript("arguments[0].click()", backToStore);

        WebElement selectSecondBook = webDriver.findElement(By.cssSelector("a[href='/books?book=9781491904244']"));
        javascriptExecutor.executeScript("arguments[0].click()", selectSecondBook);

        WebElement addToCollectionButton = webDriver.findElement(By.xpath("//button[normalize-space()='Add To Your Collection']"));
        javascriptExecutor.executeScript("arguments[0].click()", addToCollectionButton);
        Thread.sleep(3000);
        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();

        WebElement profile = webDriver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-3']"));
        javascriptExecutor.executeScript("arguments[0].click()", profile);

        WebElement deleteAllBooks = webDriver.findElement(By.cssSelector("div[class='text-right button di'] button[id='submit']"));
        javascriptExecutor.executeScript("arguments[0].click()", deleteAllBooks);

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
