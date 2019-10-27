package testBase;

import pages.*;
import drivers.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    protected HomePage homePage;
    protected ProductSearchPage productSearchPage;
    protected ProductDetailPage productDetailPage;
    protected LoginPage loginPage;
    protected GuestUserSignUpPage guestUserSignUpPage;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws Exception {
        //driver = new DriverInitializer(System.getProperty("driver")).init();
        driver = new DriverInitializer("chrome").init();
        homePage = new HomePage();
        productSearchPage = new ProductSearchPage();
        productDetailPage = new ProductDetailPage();
        loginPage  = new LoginPage();
        guestUserSignUpPage = new GuestUserSignUpPage();
    }

    protected void navigateTo(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result) {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }
}
