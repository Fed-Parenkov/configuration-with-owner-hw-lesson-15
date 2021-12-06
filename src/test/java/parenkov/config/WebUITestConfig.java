package parenkov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${driver}.properties"})
public interface WebUITestConfig extends Config {

    @Key("webdriver")
    String getWebDriver();

    @Key("browser")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    String getBaseUrl();

    @Key("remoteUrl")
    String getRemoteUrl();
}
