package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import drivers.DriverProvider;

public class GuestUserSignUpPage extends BasePage{

    @FindBy(className = "_1fM65H")
    private WebElement guestUserLoginPageTitle;

    public GuestUserSignUpPage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void isUserLandOnGuestUserLoginSignUpPage() {
        waitForElementToBeDisplay(guestUserLoginPageTitle);
        Assert.assertTrue(guestUserLoginPageTitle.isDisplayed(), " after click on buy button user is not land on guestUser login or signUp page or checkout page");
    }
}
