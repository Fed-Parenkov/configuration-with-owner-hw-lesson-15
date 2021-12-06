package parenkov;

import com.codeborne.selenide.Configuration;
import parenkov.config.AllConfig;

public class TestBase {

    public String expectedResult = "Selenide · GitHub";

    public AllConfig config;

    public void setWebdriver() {
        if (config.getWebdriver().equals("local")) {
            Configuration.browser = config.getBrowser();
            return;
        }
        Configuration.remote = config.getRemoteUrl();
    }

    public void setBrowserVersion() {
        Configuration.browserVersion = config.getBrowserVersion();
    }
}
