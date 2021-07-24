package Homework__17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task3 {
    @Test
    public void task3() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/text-box");
        webDriver.findElement(By.cssSelector("#userName")).sendKeys("Anna Bres");
        webDriver.findElement(By.cssSelector("#userEmail")).sendKeys("test@gmail.com");
        webDriver.findElement(By.cssSelector("#currentAddress")).sendKeys("Hawaii, Chill st.");
        webDriver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Miami, Sunset st.");
        webDriver.findElement(By.cssSelector("#submit")).submit();

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
