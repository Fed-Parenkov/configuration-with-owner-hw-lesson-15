package parenkov;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import parenkov.config.SimpleTestsConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests extends TestBase {

    @Test
    public void titleTest() {
        System.setProperty("webdriver", "local");

        config = ConfigFactory.create(SimpleTestsConfig.class, System.getProperties());
        setWebDriver();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }

    @Test
    public void remoteTitleTest() {
        System.setProperty("webdriver", "remote");

        config = ConfigFactory.create(SimpleTestsConfig.class, System.getProperties());
        setWebDriver();
        setBrowserVersion();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }
}
