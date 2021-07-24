package Homework_18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class task2 {

    @Test
    public void task2() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;

        webDriver.get("https://demoqa.com/automation-practice-form");

        webDriver.findElement(By.cssSelector("#firstName")).sendKeys("Anna");
        webDriver.findElement(By.cssSelector("#lastName")).sendKeys("Bres");
        webDriver.findElement(By.cssSelector("#userEmail")).sendKeys("test@gmail.com");
        webDriver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
        webDriver.findElement(By.cssSelector("#userNumber")).sendKeys("123456789");
        WebElement dateOfBirth = webDriver.findElement(By.cssSelector("#dateOfBirthInput"));
        dateOfBirth.click();
        WebElement month = webDriver.findElement(By.cssSelector(".react-datepicker__month-select"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("May");
        WebElement year = webDriver.findElement(By.cssSelector(".react-datepicker__year-select"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("1995");
        webDriver.findElement(By.cssSelector("div[aria-label='Choose Wednesday, May 24th, 1995']")).click();
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']")).click();
        webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
        webDriver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
        webDriver.findElement(By.cssSelector("#currentAddress")).sendKeys("test street, apt. Qwerty1!");
        webDriver.findElement(By.cssSelector("#state")).click();
        webDriver.findElement(By.xpath("//*[contains(text(),'Rajasthan')]")).click();
        webDriver.findElement(By.cssSelector("#city")).click();
        webDriver.findElement(By.xpath("//*[contains(text(),'Jaipur')]")).click();
        webDriver.findElement(By.cssSelector("#submit")).click();

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
