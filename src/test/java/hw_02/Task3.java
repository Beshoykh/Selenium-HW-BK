package hw_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Advanced xpath
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement profileID = driver.findElement(By.cssSelector("input#profileID"));
        profileID.sendKeys("ABC123");
        Thread.sleep(500);
        WebElement profile = driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("BeshoyCss");
        Thread.sleep(500);
        WebElement feedbackJenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackJenny.sendKeys("Your Feedback doesn't matter LOL");
        Thread.sleep(500);
        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Your Feedback doesn't matter too");
        Thread.sleep(500);
        WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("Your Feedback doesn't matter too");
        Thread.sleep(500);
        WebElement topic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        topic.sendKeys("Topic");
        Thread.sleep(500);
        WebElement intro = driver.findElement(By.cssSelector("input[name^='Intro']"));
        intro.sendKeys("Intro Advanced");
        Thread.sleep(500);
        WebElement conclusion = driver.findElement(By.cssSelector("input[data-ends$='sion']"));
        conclusion.sendKeys("Coco");
        Thread.sleep(500);
        driver.quit();


    }
}
