package parenkov;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parenkov.config.LocalConfig;
import parenkov.config.RemoteConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void titleTest() {
//        System.setProperty("browser", "firefox");
        LocalConfig local =
                ConfigFactory.create(LocalConfig.class, System.getProperties());
        Configuration.browser = local.getBrowser();
        open(local.getBaseUrl());
        assertEquals("Selenide · GitHub", title());
    }

    @Test
    @Tag("remote")
    public void remoteTitleTest() {
//        System.setProperty("browserVersion", "90");
        RemoteConfig remote =
                ConfigFactory.create(RemoteConfig.class, System.getProperties());
        Configuration.remote = remote.getRemoteUrl();
        Configuration.browserVersion = remote.getBrowserVersion();
        open(remote.getBaseUrl());
        assertEquals("Selenide · GitHub", title());
    }
}
