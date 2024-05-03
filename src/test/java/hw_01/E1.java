package hw_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*goto facebook .com
click on create new account and fill in all the text box only*/
public class E1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement createNewAccount = driver.findElement(By.partialLinkText("new account"));
        createNewAccount.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("BobbyBOB");
        Thread.sleep(500);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Tommy");
        Thread.sleep(500);
        WebElement mobileNumberOREmail = driver.findElement(By.name("reg_email__"));
        mobileNumberOREmail.sendKeys("popTommy@Gmail.com");
        Thread.sleep(500);
        WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("popTommy@Gmail.com");
        Thread.sleep(500);
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123ABC54OIT_2024");
        Thread.sleep(500);
        WebElement month = driver.findElement(By.id("month"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("10");
        Thread.sleep(500);
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        Select selectDay = new Select(day);
        selectDay.selectByValue("25");
        Thread.sleep(500);
        WebElement year = driver.findElement(By.id("year"));
        year.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("1990");
        Thread.sleep(500);

    }
}
