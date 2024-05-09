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
        switch (DropDownReader.dropDownRead("browser")){
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
        driver.get(DropDownReader.dropDownRead("url"));
        WebElement multiSelectLists =driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(multiSelectLists);
        select.selectByValue("Tuesday");
        Thread.sleep(1000);
        select.selectByIndex(1);
        Thread.sleep(1000);
        select.selectByIndex(6);
        driver.quit();

    }
}
