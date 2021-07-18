package Homework_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class task1 {

    @Test
    public void task1() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://shop.demoqa.com/");

        String title = webDriver.getTitle();
        int length = webDriver.getTitle().length();
        System.out.println("The Title is: '" + title + "' .The length of the title: " + length);

        Assert.assertEquals(webDriver.getCurrentUrl(), "http://shop.demoqa.com/");

        webDriver.getPageSource();
        int pageSourceLength = webDriver.getPageSource().length();
        System.out.println("Page Source Length is: " + pageSourceLength);

        webDriver.close();
    }
}
