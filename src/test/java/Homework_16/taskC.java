package Homework_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class taskC {
    @Test
    public void taskC() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebElement addNewToDo = webDriver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        addNewToDo.sendKeys("DO HOMEWORK");
        addNewToDo.submit();

        Thread.sleep(3000);



        webDriver.manage().deleteAllCookies();
        webDriver.quit();
    }
}
