package Homework_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task3 {
    @Test
    public void task2() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.get("https://demoqa.com/");

        WebElement forms = webDriver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[2]/div[1]"));
        javascriptExecutor.executeScript("arguments[0].click()", forms);
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().to("https://demoqa.com/");
        webDriver.navigate().refresh();
        webDriver.quit();
    }
}
