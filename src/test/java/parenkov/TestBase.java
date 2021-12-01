package parenkov;

import com.codeborne.selenide.Configuration;
import parenkov.config.APITestConfig;
import parenkov.config.UITestConfig;

public class TestBase {

    public String expectedResult = "Selenide · GitHub";

    public UITestConfig config;
    public APITestConfig apiconfig;

    public void setWebDriver() {
        if (config.getWebDriver().equals("local")) {
            Configuration.browser = config.getBrowser();
            return;
        }
        Configuration.remote = config.getRemoteUrl();
    }

    public void setBrowserVersion() {
        Configuration.browserVersion = config.getBrowserVersion();
    }
}
