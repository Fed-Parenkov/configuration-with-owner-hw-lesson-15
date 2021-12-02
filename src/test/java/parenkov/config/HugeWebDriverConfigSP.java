package parenkov.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class HugeWebDriverConfigSP {

//    public String getRemoteWebDriver() {
//        return Configuration.remote = "selenoid.autotests.cloud/wd/hub/";
//    }

    public String getBrowser() {
        browser = "firefox";
        return browser;
    }

//    public String getBrowserVersion() {
//        return Configuration.browserVersion = "96";
//    }

    public String getBaseUrl() {
        baseUrl = "http://github.com";
        return baseUrl;
    }
}
