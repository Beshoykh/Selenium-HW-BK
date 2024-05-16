package hw_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//goto https://syntaxprojects.com/input-form-locator.php
//and fill in all the text box and click on submit button
public class E2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Beshoy");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Khalil");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("peshoyfouad@gmail.com");
        WebElement clickSubmit = driver.findElement(By.id("submit_button"));
        clickSubmit.click();
        WebElement clickHere = driver.findElement(By.partialLinkText("Click Here"));
        clickHere.click();
        WebElement clickLink = driver.findElement(By.partialLinkText("Link"));
        clickLink.click();
        driver.quit();
    }
}
