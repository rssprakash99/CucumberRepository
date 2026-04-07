package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;
import java.util.HashMap;

public class BrowserStackConfig {

    public static WebDriver getDriver() throws Exception {

        String USERNAME = "saisuryaprakashr_XgrWHM";
        String ACCESS_KEY = "K4Dfoppz5jqzi8QyCT4G";

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