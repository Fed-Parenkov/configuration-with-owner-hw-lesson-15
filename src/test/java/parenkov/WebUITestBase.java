package parenkov;

import com.codeborne.selenide.Configuration;
import parenkov.config.WebUITestConfig;

public class WebUITestBase {

    public String expectedResult = "Selenide · GitHub";

    public WebUITestConfig config;

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
