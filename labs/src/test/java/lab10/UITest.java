package lab10;

import lab9.BrowserFactory;
import lab9.Pages.StackOverflowHomepage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

    protected WebDriver driver = BrowserFactory.createDriver();
    protected StackOverflowHomepage stackOverflowHomepage = new StackOverflowHomepage(driver);

    @Test
    public void checkIsLogoDisplayed(){
        stackOverflowHomepage.open();
        Assert.assertTrue(stackOverflowHomepage.isLogoDisplayed());
    }

    @Test
    public void checkIsSearchDisplayed(){
        stackOverflowHomepage.open();
        Assert.assertTrue(stackOverflowHomepage.isSearchDisplayed());
    }
}
