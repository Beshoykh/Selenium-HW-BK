package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Common_Methods {
    public static WebDriver driver;
    public static void closeBrowser_LaunchApplication() throws IOException {
        switch (ConfigReader.read("browser")){
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
        driver.get(ConfigReader.read("url"));
        driver.quit();

    }
}
