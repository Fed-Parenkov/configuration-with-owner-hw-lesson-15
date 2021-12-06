package parenkov.config;

import org.aeonbits.owner.Config;

public interface LocalConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com/selenide")
    String getBaseUrl();
}
