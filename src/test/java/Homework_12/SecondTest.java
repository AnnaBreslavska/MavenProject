package Homework_12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void secondTest() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("https://www.i.ua/");

        By loginLocator = By.cssSelector("input[name='login']");
        By passwordLocator = By.cssSelector("input[name='pass']");
        WebElement loginInput = webDriver.findElement(loginLocator);
        WebElement passwordInput = webDriver.findElement(passwordLocator);
        loginInput.sendKeys("AnnaBres");
        passwordInput.sendKeys("Tarasevich46");

        By submitLocator = By.xpath("//input[@title='Вход на почту']");
        WebElement submitButton = webDriver.findElement(submitLocator);
        submitButton.click();

        webDriver.manage().deleteAllCookies();
        webDriver.quit();

    }
}
