package parenkov;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parenkov.config.Browser;
import parenkov.config.WebDriverConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTestSP2 {

    private final WebDriverConfig config =
            ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @Test
    @Tag("web4")
    public void testTitle() {
        Configuration.browser = config.getBrowser();
        open(config.getBaseUrl());
        assertEquals("Selenide · GitHub", title());
    }
}
