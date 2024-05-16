package hw_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class calendar {
    public static void main(String[] args) {
        //http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/leave/viewLeaveList/reset/1
        //click on leave, then, calendar then work on the Calendar

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//b[text()='Leave']")).click();
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        select.selectByValue("9");
        Select select1 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        select1.selectByValue("1987");
        List<WebElement> days = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement day :days){
            if (day.getText().equals("24")){
                day.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='calToDate']")).click();
        Select select3 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        select3.selectByValue("5");
        Select select4 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        select4.selectByValue("1990");
        List<WebElement> daysTo = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for (WebElement dayTo :daysTo){
            if (dayTo.getText().equals("12")){
                dayTo.click();
                break;
            }
        }

        driver.findElement(By.xpath("//label[text()='Pending Approval']")).click();
        driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']")).sendKeys("BOB");
        Select selectPosition = new Select(driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit']")));
        selectPosition.selectByValue("4");
        driver.findElement(By.xpath("//input[@id='btnReset']")).click();
        driver.quit();

    }
}
