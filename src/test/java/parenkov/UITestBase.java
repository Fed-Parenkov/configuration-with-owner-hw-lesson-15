package parenkov;

import com.codeborne.selenide.Configuration;
import parenkov.config.UITestConfig;

public class UITestBase {

    public String expectedResult = "Selenide · GitHub";

    public UITestConfig config;

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
