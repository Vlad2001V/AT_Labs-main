package lab11.PO;

import lab12.decorator.Button;
import lab12.decorator.FieldDecorator;
import lab12.decorator.Input;
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

import java.time.Duration;

public class InstagramLoginPage {
    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[1]/div/label/input")
    private Input loginInput;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[2]/div/label/input")
    private Input passwordInput;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/div/div[3]/button")
    private Button submitButton;


    public InstagramLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new FieldDecorator(driver), this);
    }
    public void openLoginPage() {
        driver.get("https://www.instagram.com/?hl=ru");
    }

    public void login(String login, String password) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button")));
        }
        catch (TimeoutException e) {
            Assert.fail("Login to load login page");
        }
        loginInput.fillWith(login);
        passwordInput.fillWith(password);
        if (submitButton.isActive()) {
            submitButton.press();
        }
        else {
            Assert.fail("Incorrect login data");
        }
    }


}
