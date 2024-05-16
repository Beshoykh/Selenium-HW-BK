package hw_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Advanced xpath
public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement userName = driver.findElement(By.xpath("//label[text()='UserName:']//following-sibling::input[1]"));
        userName.sendKeys("BeshoyKhalil");

        WebElement clickHereButton = driver.findElement(By.xpath("//*[@class='form-group']/child::button"));
        clickHereButton.click();

        WebElement question = driver.findElement(By.xpath("//label[contains(text(),'Security')]/following-sibling::input"));
        question.sendKeys("Where do you From?");

        WebElement printText = driver.findElement(By.xpath("//label[contains(text(),'aliquam')]"));
        System.out.println(printText.getText());

        WebElement API = driver.findElement(By.xpath("//label[starts-with(text(),'Api')]//following-sibling::input"));
        API.sendKeys("145A254C");

        WebElement email1 = driver.findElement(By.xpath("//label[text()='Email 1:']//following-sibling::input"));
        email1.sendKeys("email1@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("//label[contains(text(),'Email 2')]//following-sibling::input"));
        email2.sendKeys("email2@gmail.com");

        WebElement email3 = driver.findElement(By.xpath("//label[contains(text(),'Email 3')]//following-sibling::input"));
        email3.sendKeys("email3@gmail.com");

         WebElement field1 = driver.findElement(By.xpath("//input[@data-detail=\"one\"][@name='customField']"));
        field1.sendKeys("Field 1 with two attributes");

        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail=\"two\"][@name='customField']"));
        field2.sendKeys("Field 2 with two attributes");

        WebElement choiceField1 = driver.findElement(By.xpath("//input[@data-detail=\"one\"][@name='customField1']"));
        choiceField1.sendKeys("Choice Field 1 with two attributes");

        WebElement choiceField2 = driver.findElement(By.xpath("//input[@data-detail=\"two\"][@name='customField1']"));
        choiceField2.sendKeys("Choice Field 2 with two attributes");

        driver.quit();

    }
}
