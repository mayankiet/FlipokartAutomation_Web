package drivers.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {

    public WebDriver getDriver() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("allow-running-insecure-content");
        options.addArguments("--start-fullscreen");
        setDriverBinaryPath();
                return new ChromeDriver(options);
        }


    public void setDriverBinaryPath() {
        WebDriverManager.chromedriver().setup();

    }

}