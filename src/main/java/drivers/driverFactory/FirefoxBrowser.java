package drivers.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

    public WebDriver getDriver() throws Exception {
        setDriverBinaryPath();
                return new FirefoxDriver();
        }

    public void setDriverBinaryPath() {
        WebDriverManager.firefoxdriver().setup();
    }
}
