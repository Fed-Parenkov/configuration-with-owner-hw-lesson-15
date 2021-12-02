package parenkov.config;

import com.codeborne.selenide.Configuration;

public class HugeWebDriverConfig2 {

//    public String getRemoteWebDriver() {
//        return Configuration.remote = "selenoid.autotests.cloud/wd/hub/";
//    }

    public String getBrowser() {
        return Configuration.browser = "firefox";
    }

//    public String getBrowserVersion() {
//        return Configuration.browserVersion = "96";
//    }

    public String getBaseUrl() {
        return "https://github.com";
    }
}
