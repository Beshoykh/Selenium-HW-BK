package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class Common_Methods_SelectDropDown {
    public static WebDriver driver;
    public static void dropDownMethod() throws IOException, InterruptedException {
        switch (ConfigReader.read("browser2")){
            case "Chrome" :
               driver= new ChromeDriver();
               break;
            case "FireFox" :
                driver= new FirefoxDriver();
                break;
            case "Edge" :
                driver= new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url2"));
        WebElement listDemo =driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(listDemo);
        select.selectByValue("Tuesday");
        Thread.sleep(1000);
        select.selectByValue("Wednesday");
        Thread.sleep(1000);
        select.selectByVisibleText("Friday");
        Thread.sleep(1000);
        WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select2 = new Select(multiSelect);
        select2.selectByValue("New Jersey");
        select2.selectByValue("New York");
        select2.selectByValue("Texas");
        select2.selectByValue("Washington");
        driver.quit();

    }
}
