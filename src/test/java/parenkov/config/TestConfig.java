package parenkov.config;

import com.codeborne.selenide.Configuration;

public class TestConfig {

    public String getBrowser() {
        return Configuration.browser = "edge";
    }

//        public Browser getBrowser() {
//        return Browser.FIREFOX;
//    }

    public String getBaseUrl() {
        return "https://ru.selenide.org/777";
    }

//    public String browser = Configuration.browser = "edge";
//    public String browserVersion = Configuration.browserVersion = "91";
//    public String baseUrl = Configuration.baseUrl = "https://ru.selenide.org/";
//    public String remoteWebDriver = Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
}
