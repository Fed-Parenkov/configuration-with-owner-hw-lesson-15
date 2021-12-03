package parenkov.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface LocalConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com/selenide")
    String getBaseUrl();
}
