package flipkartTestCases;

import constant.SearchItem;
import testBase.BaseTest;
import annotation.Author;
import annotation.TestCaseNotes;
import annotation.Tester;
import org.testng.annotations.Test;
import utilities.Properties;
import utils.Categories;

public class FilterProductTest extends BaseTest {

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "Navigate to Flipkart site || close the login pop-up || Search for the shoes|| apply low to high Filter ", expecatedResult = "shoes should be display according to apply filter")
    @Test(groups = {Categories.FilterProduct})
    public void filterProductByPriceLowToHigh() {
        //navigateTo(Properties.baseUrl);
        navigateTo("https://www.flipkart.com/");
        loginPage.loginAsGuestUser();
        homePage.userSearchProduct(SearchItem.product);
        productSearchPage.verifyAllFilterIsDisplay();
        productSearchPage.clickAndVerifyLowToHighFilter();

    }

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "Navigate to Flipkart site || close the login pop-up || Search for the shoes|| filter the shoes by brand name|| click on first search product", expecatedResult = "product detail page should be display")
    @Test(groups = {Categories.FilterProduct})
    public void filterProductByBrand() {
        //navigateTo(Properties.baseUrl);
        navigateTo("https://www.flipkart.com/");
        loginPage.loginAsGuestUser();
        homePage.userSearchProduct(SearchItem.product);
        productSearchPage.verifyAllFilterIsDisplay();
        productDetailPage.searchProductBrand(SearchItem.brand);
        productDetailPage.clickOnFirstSearchProduct();


    }


    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "Navigate to Flipkart site || close the login pop-up || Search for the shoes||  select first searched product", expecatedResult = "product detail page should be display")
    @Test(groups = {Categories.FilterProduct})
    public void selectFirstSearchProduct() {
        //navigateTo(Properties.baseUrl);
        navigateTo("https://www.flipkart.com/");
        loginPage.loginAsGuestUser();
        homePage.userSearchProduct(SearchItem.product);
        productSearchPage.verifyAllFilterIsDisplay();
        productDetailPage.clickOnFirstSearchProduct();
        productDetailPage.selectSizeOfProduct("9");
        productDetailPage.clickOnBuyButton();
        guestUserSignUpPage.isUserLandOnGuestUserLoginSignUpPage();

    }
}
