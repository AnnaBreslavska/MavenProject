package Homework_18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task1 {
    @Test
    public void task1() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demoqa.com/frames");

        webDriver.switchTo().frame(webDriver.findElement(By.id("frame1")));
        WebElement frameFirstText = webDriver.findElement(By.cssSelector("#sampleHeading"));
        frameFirstText.getText();
        System.out.println("Text on First Frame: " + frameFirstText.getText());
        webDriver.switchTo().defaultContent();

        webDriver.switchTo().frame(webDriver.findElement(By.id("frame2")));
        WebElement frameSecondText = webDriver.findElement(By.cssSelector("#sampleHeading"));
        frameSecondText.getText();
        System.out.println("Text on Second Frame: " + frameSecondText.getText());
        webDriver.quit();
    }
}
