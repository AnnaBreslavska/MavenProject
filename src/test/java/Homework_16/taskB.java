package Homework_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskB {

    @Test
    public void taskA() {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.saucedemo.com/");

        WebElement userName = webDriver.findElement(By.cssSelector("#user-name"));
        userName.sendKeys("standard_user");

        WebElement password = webDriver.findElement(By.cssSelector("#password"));
        password.sendKeys("secret_sauce");

        WebElement login = webDriver.findElement(By.cssSelector("#login-button"));
        login.click();

        WebElement addFirstProduct = webDriver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        addFirstProduct.click();

        WebElement addSecondProduct = webDriver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        addSecondProduct.click();

        WebElement addThirdProduct = webDriver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
        addThirdProduct.click();

        WebElement addForthProduct = webDriver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        addForthProduct.click();

        WebElement cart = webDriver.findElement(By.cssSelector(".shopping_cart_link"));
        cart.click();

        WebElement checkoutButton = webDriver.findElement(By.cssSelector("#checkout"));
        javascriptExecutor.executeScript("arguments[0].click()", checkoutButton);

        WebElement firstName = webDriver.findElement(By.cssSelector("#first-name"));
        firstName.sendKeys("Test");

        WebElement lastName = webDriver.findElement(By.cssSelector("#last-name"));
        lastName.sendKeys("Testovich");

        WebElement postalCode = webDriver.findElement(By.cssSelector("#postal-code"));
        postalCode.sendKeys("61129");

        WebElement continueButton = webDriver.findElement(By.cssSelector("#continue"));
        continueButton.click();

        WebElement finishButton = webDriver.findElement(By.cssSelector("#finish"));
        finishButton.click();

        WebElement backHomeButton = webDriver.findElement(By.cssSelector("#back-to-products"));
        backHomeButton.click();

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
