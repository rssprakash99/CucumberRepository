package stepDefinations;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utils.BrowserStackConfig;

public class Hooks {

    public static WebDriver driver;


    @Before
    public void setup() throws Exception {
        System.out.println("===== BROWSERSTACK DRIVER INITIALIZING =====");
        driver = BrowserStackConfig.getDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}