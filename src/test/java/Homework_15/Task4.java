package Homework_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task4 {

    @Test
    public void Task_4() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(5000);

        By managerLoginLocator = By.cssSelector("button[ng-click='manager()']");
        WebElement managerLogin = webDriver.findElement(managerLoginLocator);
        managerLogin.click();
        Thread.sleep(5000);

        //OpenCustomers
        By openCustomersLocator = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass3']");
        WebElement openCustomersLogin = webDriver.findElement(openCustomersLocator);
        openCustomersLogin.click();
        Thread.sleep(5000);

        //deleteHermoine

        By deleteHermoineRecordLocator = By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) button:nth-child(1)");
        WebElement deleteHermoineRecord = webDriver.findElement(deleteHermoineRecordLocator);
        deleteHermoineRecord.click();
        Thread.sleep(3000);

        //deleteHarry

        By deleteHarryRecordLocator = By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) button:nth-child(1)");
        WebElement deleteHarryRecord = webDriver.findElement(deleteHarryRecordLocator);
        deleteHarryRecord.click();
        Thread.sleep(3000);

        //deleteRon

        By deleteRonRecordLocator = By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) button:nth-child(1)");
        WebElement deleteRonRecord = webDriver.findElement(deleteRonRecordLocator);
        deleteRonRecord.click();
        Thread.sleep(3000);

        //deleteAlbus

        By deleteAlbusRecordLocator = By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) button:nth-child(1)");
        WebElement deleteAlbusRecord = webDriver.findElement(deleteAlbusRecordLocator);
        deleteAlbusRecord.click();
        Thread.sleep(3000);

        //deleteNeville

        By deleteNevilleRecordLocator = By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) button:nth-child(1)");
        WebElement deleteNevilleRecord = webDriver.findElement(deleteNevilleRecordLocator);
        deleteNevilleRecord.click();
        Thread.sleep(3000);


        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
