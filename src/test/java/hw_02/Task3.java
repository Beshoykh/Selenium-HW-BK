package hw_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Advanced xpath
public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement profileID = driver.findElement(By.cssSelector("input#profileID"));
        profileID.sendKeys("ABC123");

        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("BeshoyCss");

        WebElement feedbackJenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackJenny.sendKeys("Your Feedback doesn't matter LOL");

        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Your Feedback doesn't matter too");

        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("Your Feedback doesn't matter too");

        WebElement topic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        topic.sendKeys("Topic");

        WebElement intro = driver.findElement(By.cssSelector("input[name^='Intro']"));
        intro.sendKeys("Intro Advanced");

        WebElement conclusion = driver.findElement(By.cssSelector("input[data-ends$='sion']"));
        conclusion.sendKeys("Coco");

        driver.quit();


    }
}
