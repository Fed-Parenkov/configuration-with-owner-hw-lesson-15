package parenkov;

import com.codeborne.selenide.Configuration;
import parenkov.config.SimpleTestsConfig;

public class TestBase {

    public String expectedResult = "Selenide · GitHub";

    public SimpleTestsConfig config;

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
