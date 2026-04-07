package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;
import java.util.HashMap;

public class BrowserStackConfig {

    public static WebDriver getDriver() throws Exception {

        String USERNAME = System.getenv("BROWSERSTACK_USERNAME");
        String ACCESS_KEY = System.getenv("BROWSERSTACK_ACCESS_KEY");

        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "Chrome");
        options.setCapability("browserVersion", "latest");

        HashMap<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("os", "Windows");
        bstackOptions.put("osVersion", "11");
        bstackOptions.put("sessionName", "Cucumber BrowserStack Test");

        options.setCapability("bstack:options", bstackOptions);

        return new RemoteWebDriver(
                new URL("https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub"),
                options
        );
    }
}