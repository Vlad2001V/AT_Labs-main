package lab9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    public static WebDriver createDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
