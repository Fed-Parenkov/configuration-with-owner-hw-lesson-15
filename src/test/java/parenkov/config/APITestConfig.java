package parenkov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:api.properties"})
public interface APITestConfig {

    @Config.Key("webdriver")
    String getWebDriver();

    @Config.Key("browser")
    String getBrowser();

    @Config.Key("browserVersion")
    String getBrowserVersion();

    @Config.Key("baseUrl")
    String getBaseUrl();

    @Config.Key("remoteUrl")
    String getRemoteUrl();
}
