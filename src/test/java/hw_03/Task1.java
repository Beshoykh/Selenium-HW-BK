package hw_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement clickEnable = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        clickEnable.click();
        Thread.sleep(500);
        List<WebElement> listOfButtons = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement l : listOfButtons){
            String value = l.getAttribute("value");
            if (value.equals("Checkbox-4")){
                l.click();
            }
        }
    }
}
