package Homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void Task_1() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(5000);

        By customerLoginLocator = By.cssSelector("button[ng-click='customer()']");
        WebElement customerLogin = webDriver.findElement(customerLoginLocator);
        customerLogin.click();
        Thread.sleep(5000);

        By customerSelectLocator = By.cssSelector("#userSelect");
        WebElement customer = webDriver.findElement(customerSelectLocator);
        customer.click();
        Thread.sleep(5000);

        By harryPotterLocator = By.cssSelector("option[value='2']");
        WebElement harryPotter = webDriver.findElement(harryPotterLocator);
        harryPotter.click();
        Thread.sleep(5000);

        By loginLocator = By.cssSelector("button[type='submit']");
        WebElement login = webDriver.findElement(loginLocator);
        login.click();
        Thread.sleep(5000);

        //deposit

        By depositLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");
        WebElement deposit = webDriver.findElement(depositLocator);
        deposit.click();
        Thread.sleep(5000);

        By amountDepositLocator = By.cssSelector("input[placeholder='amount']");
        WebElement amountDeposit = webDriver.findElement(amountDepositLocator);
        amountDeposit.sendKeys("1000");
        Thread.sleep(5000);

        By submitDepositLocator = By.cssSelector("button[type='submit']");
        WebElement submitDeposit = webDriver.findElement(submitDepositLocator);
        submitDeposit.click();
        Thread.sleep(5000);

        //withdraw

        By withdrawLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass3']");
        WebElement withdraw = webDriver.findElement(withdrawLocator);
        withdraw.click();
        Thread.sleep(5000);

        By amountWithdrawLocator = By.cssSelector("input[placeholder='amount']");
        WebElement amountWithdraw = webDriver.findElement(amountWithdrawLocator);
        amountWithdraw.sendKeys("900");
        Thread.sleep(5000);

        By withdrawSubmitLocator = By.cssSelector("button[type='submit']");
        WebElement withdrawSubmit = webDriver.findElement(withdrawSubmitLocator);
        withdrawSubmit.click();
        Thread.sleep(5000);

        //transactions
        By transactionLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass1']");
        WebElement transaction = webDriver.findElement(transactionLocator);
        transaction.click();
        Thread.sleep(5000);

        By transactionResetLocator = By.cssSelector(".btn[ng-show='showDate']");
        WebElement transactionReset = webDriver.findElement(transactionResetLocator);
        transactionReset.click();
        Thread.sleep(5000);



        webDriver.manage().deleteAllCookies();
        webDriver.quit();

    }
}
