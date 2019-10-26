package drivers;

import drivers.driverFactory.ChromeBrowser;
import drivers.driverFactory.FirefoxBrowser;
import org.openqa.selenium.WebDriver;
import utilities.Browsers;

public class DriverInitializer {

    private String browser;

    public DriverInitializer(String browser) {
        this.browser = browser;
    }

    public WebDriver init() throws Exception {

        WebDriver webDriver = null;

        switch (browser) {

            case Browsers.FIREFOX:
                webDriver = new FirefoxBrowser().getDriver();
                break;
            case Browsers.CHROME:

            default:
                webDriver = new ChromeBrowser().getDriver();
        }

        DriverProvider.setDriver(webDriver);
        return webDriver;
    }

}
