package flipkartTestCases;

import testBase.BaseTest;
import annotation.Author;
import annotation.TestCaseNotes;
import annotation.Tester;
import org.testng.annotations.Test;
import utilities.Properties;
import utils.Categories;

public class SearchHomePageTest extends BaseTest {

    @Author(name = Tester.Mayank)
    @TestCaseNotes(Steps = "go  to Flipkart.com || close the login pop-up || Search the shoes|| ", expecatedResult = "shoes should be display")
    @Test(groups = {Categories.SearchProduct})
    public void verifyUserShouldAbleToSearchProductAsGuest() {
        navigateTo(Properties.baseUrl);
        loginPage.guestUserLogin();
        homePage.userSearchProduct("shoes");

    }
}
