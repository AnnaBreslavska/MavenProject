package Homework_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task2 {
    @Test
    public void task2() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/browser-windows");

        WebElement newWindow = webDriver.findElement(By.cssSelector("#windowButton"));
        newWindow.click();
        webDriver.close();
        webDriver.quit();
    }
}
