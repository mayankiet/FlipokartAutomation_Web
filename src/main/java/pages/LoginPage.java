package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import drivers.DriverProvider;

public class LoginPage extends BasePage{

    @FindBy(className = "_29YdH8")
    private WebElement guestUserLogin;
    @FindBy(className = "_114Zhd")
    private WebElement homePageHeader;


    public LoginPage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }


    public void loginAsGuestUser() {
        waitForElementToBeDisplay(guestUserLogin);
        jsClick(guestUserLogin);
        waitForElementToBeDisplay(homePageHeader);
        Assert.assertTrue(homePageHeader.isDisplayed(), "User is not able to login as a guest user");
    }
}

