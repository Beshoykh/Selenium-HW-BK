package hw_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement clickButton1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        clickButton1.click();
        WebElement clickButtonAll = driver.findElement(By.xpath("//input[@value='Check All']"));
        clickButtonAll.click();
        WebElement clickEnable = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        clickEnable.click();
        WebElement enableButton =driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableButton.click();
        List<WebElement> enableButtons = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement buttons:enableButtons){
            String value = buttons.getAttribute("value");
            if (value.equals("Checkbox-2")){
                buttons.click();
            }
        }driver.quit();
    }
}
