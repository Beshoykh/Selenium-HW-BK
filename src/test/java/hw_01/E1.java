package hw_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*goto facebook .com
click on create new account and fill in all the text box only*/
public class E1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement createNewAccount = driver.findElement(By.partialLinkText("new account"));
        createNewAccount.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("BobbyBOB");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Tommy");
        WebElement mobileNumberOREmail = driver.findElement(By.name("reg_email__"));
        mobileNumberOREmail.sendKeys("popTommy@Gmail.com");
        WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__")));
        reEnterEmail.sendKeys("popTommy@Gmail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("123ABC54OIT_2024");
        WebElement month = driver.findElement(By.id("month"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByValue("10");
        WebElement day = driver.findElement(By.id("day"));
        day.click();
        Select selectDay = new Select(day);
        selectDay.selectByValue("25");
        WebElement year = driver.findElement(By.id("year"));
        year.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("1990");
        WebElement gender = driver.findElement(By.xpath("//label[text()='Male']//following-sibling::input"));
        gender.click();
        driver.quit();

    }
}
