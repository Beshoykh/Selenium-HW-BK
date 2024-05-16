package hw_04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.Common_Methods;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");//select class
        WebElement selectDropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Common_Methods.selectFromDropDown(selectDropDown,"Tuesday");
        driver.quit();

    }
}
