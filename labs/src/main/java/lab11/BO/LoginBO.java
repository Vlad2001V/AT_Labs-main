package lab11.BO;

import lab11.PO.InstagramLoginPage;
import lab11.PO.InstagramMainPage;
import lab9.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class LoginBO {
    WebDriver driver = BrowserFactory.createDriver();
    private final InstagramLoginPage instagramLoginPage = new InstagramLoginPage(driver);
    private final InstagramMainPage instagramMainPage = new InstagramMainPage(driver);



    public LoginBO openLoginPage() {
        instagramLoginPage.openLoginPage();
        return this;
    }

    public LoginBO login(String login, String password) {
        instagramLoginPage.login(login, password);
        return this;
    }

    public LoginBO verifyLogin() {
        instagramMainPage.verifyLogin();
        return this;
    }
}
