package parenkov;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import parenkov.config.forNoWebDriverSwitchingTests.LocalConfig;
import parenkov.config.forNoWebDriverSwitchingTests.RemoteConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoWebDriverSwitchingTests {

    String expectedResult = "Selenide · GitHub";

    @Test
    public void titleTest() {
        System.setProperty("browser", "edge");
        LocalConfig local =
                ConfigFactory.create(LocalConfig.class, System.getProperties());
        Configuration.browser = local.getBrowser();
        open(local.getBaseUrl());
        assertEquals(expectedResult, title());
    }

    @Test
    public void remoteTitleTest() {
        System.setProperty("browserVersion", "90");
        RemoteConfig remote =
                ConfigFactory.create(RemoteConfig.class, System.getProperties());
        Configuration.remote = remote.getRemoteUrl();
        Configuration.browser = remote.getBrowser();
        Configuration.browserVersion = remote.getBrowserVersion();
        open(remote.getBaseUrl());
        assertEquals(expectedResult, title());
    }
}
