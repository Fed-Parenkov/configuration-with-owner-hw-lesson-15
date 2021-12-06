package parenkov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${webdriver}.properties"})
public interface SimpleTestsConfig extends Config {

    @Key("driver")
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
