package lab9.Pages;

import lab9.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StackOverflowHomepage {

    public WebDriver driver;

    private static By LogoXpath = By.xpath("/html/body/header/div/a[2]");
    private static By LogoCss = By.cssSelector("body > header > div > a.s-topbar--logo");
    private static By SearchXpath = By.xpath("//*[@id=\"search\"]/div/input");
    private static By SearchCss = By.cssSelector("#search > div > input");

    public StackOverflowHomepage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isLogoDisplayed(){
        return driver.findElement(LogoXpath).isDisplayed();
    }
    public boolean isSearchDisplayed(){
        return driver.findElement(SearchXpath).isDisplayed();
    }

    public void open(){
        driver.get("https://stackoverflow.com");
    }
}
