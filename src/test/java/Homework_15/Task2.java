package Homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2 {

    @Test
    public void Task_2() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(5000);

        By managerLoginLocator = By.cssSelector("button[ng-click='manager()']");
        WebElement managerLogin = webDriver.findElement(managerLoginLocator);
        managerLogin.click();
        Thread.sleep(5000);

        //AddCustomerButton

        By addCustomerLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass1']");
        WebElement addCustomer = webDriver.findElement(addCustomerLocator);
        addCustomer.click();
        Thread.sleep(5000);

        //AddNewCustomerForm

        By firstNameLocator = By.cssSelector("input[placeholder='First Name']");
        WebElement firstName = webDriver.findElement(firstNameLocator);
        firstName.sendKeys("Draco");

        By lastNameLocator = By.cssSelector("input[placeholder='Last Name']");
        WebElement lastName = webDriver.findElement(lastNameLocator);
        lastName.sendKeys("Malfoy");

        By postCodeLocator = By.cssSelector("input[placeholder='Post Code']");
        WebElement postCode = webDriver.findElement(postCodeLocator);
        postCode.sendKeys("6129");

        By addCustomerButtonLocator = By.cssSelector("button[type='submit']");
        WebElement addCustomerButton = webDriver.findElement(addCustomerButtonLocator);
        addCustomerButton.click();
        Thread.sleep(5000);

        webDriver.switchTo().alert().accept();
        webDriver.switchTo().defaultContent();
        Thread.sleep(5000);


        //OpenAccount
        By openAccountLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");
        WebElement openAccount = webDriver.findElement(openAccountLocator);
        openAccount.click();
        Thread.sleep(5000);


        webDriver.manage().deleteAllCookies();
        webDriver.quit();

    }
}
