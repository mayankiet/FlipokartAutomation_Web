package flipkartTestCases;

import constant.SearchItem;
import testBase.BaseTest;
import annotation.Author;
import annotation.TestCaseNotes;
import annotation.Tester;
import org.testng.annotations.Test;
import utilities.Properties;
import utils.Categories;

public class SearchHomePageTest extends BaseTest {

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "Navigate to Flipkart site || close the login pop-up || Search for the shoes|| ", expecatedResult = "Shoes should be display")
    @Test(groups = {Categories.SearchProduct})
    public void verifyUserShouldAbleToSearchProductAsGuest() {
        //navigateTo(Properties.baseUrl);
        navigateTo("https://www.flipkart.com/");
        loginPage.loginAsGuestUser();
        homePage.userSearchProduct(SearchItem.product);
        homePage.verifySearchNavigation(SearchItem.product);
    }
}
