package parenkov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:api.properties"})
public interface APITestConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("cookie")
    String getCookie();
}
