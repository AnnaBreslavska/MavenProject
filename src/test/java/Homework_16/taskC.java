package Homework_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskC {
    @Test
    public void taskC() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        Actions action = new Actions(webDriver);

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebElement addFirstToDo = webDriver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        addFirstToDo.sendKeys("DO HOMEWORK" + "\n");

        WebElement addSecondToDo = webDriver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        addSecondToDo.sendKeys("Practice Automation" + "\n");

        WebElement markAsResolved = webDriver.findElement(By.cssSelector("li:nth-child(3)"));
        markAsResolved.click();

        WebElement delete = webDriver.findElement(By.xpath("//li[normalize-space()='Buy new robes']"));
        action.moveToElement(delete).perform();

        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
