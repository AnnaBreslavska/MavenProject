package Homework__17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class task4 {
    @Test
    public void task3() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://way2automation.com/way2auto_jquery/dropdown.php#load_box");
        webDriver.switchTo().frame(webDriver.findElement(By.className("demo-frame")));

        WebElement dropdown = webDriver.findElement(By.cssSelector("body select"));
        Select selectAustralia = new Select(dropdown);
        selectAustralia.selectByVisibleText("Australia");
        Select selectTwentyFifthCountry = new Select(dropdown);
        selectTwentyFifthCountry.selectByIndex(25);
        Select selectByValue = new Select(dropdown);
        selectByValue.selectByValue("SriLanka");

        webDriver.quit();
    }
}
