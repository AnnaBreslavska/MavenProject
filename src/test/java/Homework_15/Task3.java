package Homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3 {

    @Test
    public void Task_3() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(5000);

        By managerLoginLocator = By.cssSelector("button[ng-click='manager()']");
        WebElement managerLogin = webDriver.findElement(managerLoginLocator);
        managerLogin.click();
        Thread.sleep(5000);

        //OpenAccount
        By openAccountLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");
        WebElement openAccount = webDriver.findElement(openAccountLocator);
        openAccount.click();
        Thread.sleep(5000);

        //Create Account

        By selectCustomerLocator = By.cssSelector("#userSelect");
        WebElement selectCustomer=webDriver.findElement(selectCustomerLocator);
        selectCustomer.click();

        By selectHermoineLocator = By.cssSelector("option[value='1']");
        WebElement selectHermoineCustomer=webDriver.findElement(selectHermoineLocator);
        selectHermoineCustomer.click();


        By selectCurrencyLocator = By.cssSelector("#currency");
        WebElement selectCurrency=webDriver.findElement(selectCurrencyLocator);
        selectCurrency.click();

        By selectRupeeLocator = By.cssSelector("option[value='Rupee']");
        WebElement selectRupee=webDriver.findElement(selectRupeeLocator);
        selectRupee.click();

        Thread.sleep(5000);

        By processButtonLocator = By.cssSelector("button[type='submit']");
        WebElement processButton=webDriver.findElement(processButtonLocator);
        processButton.click();
        Thread.sleep(5000);

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();
        Thread.sleep(5000);

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
