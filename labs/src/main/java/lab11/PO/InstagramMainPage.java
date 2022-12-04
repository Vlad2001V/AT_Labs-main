package lab11.PO;

import lab12.decorator.FieldDecorator;
import lab9.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InstagramMainPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"react-root\"]/section/nav")
    WebElement header;

    public InstagramMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new FieldDecorator(driver), this);
    }
    public void verifyLogin() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/section/nav")));
        }
        catch (TimeoutException e) {
            Assert.fail("Login failed");
        }
        Assert.assertTrue(header.isDisplayed(), "Login failed");
    }
}
