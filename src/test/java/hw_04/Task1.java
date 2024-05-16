package hw_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Common_Methods;

import java.io.IOException;
import java.time.Duration;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement button1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        button1.click();
        driver.quit();
    }
}
