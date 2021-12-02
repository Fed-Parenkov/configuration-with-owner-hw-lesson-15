package parenkov.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome") // сделать с Enum !!!
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("94")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com/selenide")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();
}
