package Homework_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task3 {
    @Test
    public void task3() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/");

        WebElement joinNow = webDriver.findElement(By.cssSelector("a[href='https://www.toolsqa.com/selenium-training/']"));
        joinNow.click();
        //webDriver.navigate().back();
        //webDriver.navigate().forward();
//        webDriver.navigate().to("https://demoqa.com/");

        webDriver.navigate().refresh();
        webDriver.close();

    }
}
