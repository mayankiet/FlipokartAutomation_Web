package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import drivers.DriverProvider;

public class HomePage extends BasePage{

    @FindBy(css = ".LM6RPg")
    private WebElement searchBox;

    @FindBy(css = ".vh79eN")
    private WebElement searchButton;

    @FindBy(className = "_2yAnYN")
    WebElement searchResult;

    public HomePage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }


    public void userSearchProduct(String searchKey) {
        waitForElementToBeDisplay(searchBox);
        searchBox.sendKeys(searchKey);
        searchButton.click();
        waitForElementToBeDisplay(searchResult);
        Assert.assertTrue(searchResult.getText().contains(searchKey), "search product is not available , expected " + searchKey + " but found " + searchResult.getText());

    }
}
