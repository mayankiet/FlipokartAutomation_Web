package flipkartTestCases;

import testBase.BaseTest;
import annotation.Author;
import annotation.TestCaseNotes;
import annotation.Tester;
import org.testng.annotations.Test;
import utilities.Properties;
import utils.Categories;

public class FilterProductTest extends BaseTest {

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "go  to Flipkart.com || close the login pop-up || Search the shoes|| apply low to high Filter ", expecatedResult = "shoes should be display according to apply filter")
    @Test(groups = {Categories.FilterProduct})
    public void filterProductByPriceLowToHigh() {
        navigateTo(Properties.baseUrl);
        loginPage.guestUserLogin();
        homePage.userSearchProduct("shoes");
        productSearchPage.isAllFilterIsDisplay();
        productSearchPage.selectLowToHighFilter();

    }

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "go  to Flipkart.com || close the login pop-up || Search the shoes|| filter the shoes by brand name|| click on first search product", expecatedResult = "product detail page should be display")
    @Test(groups = {Categories.FilterProduct})
    public void filterProductByBrand() {
        navigateTo(Properties.baseUrl);
        loginPage.guestUserLogin();
        homePage.userSearchProduct("shoes");
        productSearchPage.isAllFilterIsDisplay();
        productDetailPage.searchProductBrand("adidas");
        productDetailPage.clickOnFirstSearchProduct();


    }


    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "go  to Flipkart.com || close the login pop-up || Search the shoes|| select first searched product", expecatedResult = "product detail page should be display")
    @Test(groups = {Categories.FilterProduct})
    public void selectFirstSearchProduct() {
        navigateTo(Properties.baseUrl);
        loginPage.guestUserLogin();
        homePage.userSearchProduct("shoes");
        productSearchPage.isAllFilterIsDisplay();
        productDetailPage.clickOnFirstSearchProduct();
        productDetailPage.selectSizeOfProduct("7");
        productDetailPage.clickOnBuyButton();
        guestUserSignUpPage.isUserLandOnGuestUserLoginSignUpPage();

    }
}
