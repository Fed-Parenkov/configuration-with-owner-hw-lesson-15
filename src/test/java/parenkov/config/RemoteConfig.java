package parenkov.config;

import org.aeonbits.owner.Config;

public interface RemoteConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("91")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com/selenide")
    String getBaseUrl();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    String getRemoteUrl();
}
