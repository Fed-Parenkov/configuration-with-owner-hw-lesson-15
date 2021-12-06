package parenkov;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import parenkov.config.AllConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallTests extends TestBase {

    @Test
    public void titleTest() {
        System.setProperty("webdriver", "local");

        config = ConfigFactory.create(AllConfig.class, System.getProperties());
        setWebdriver();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }

    @Test
    public void remoteTitleTest() {
        System.setProperty("webdriver", "remote");

        config = ConfigFactory.create(AllConfig.class, System.getProperties());
        setWebdriver();
        setBrowserVersion();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }
}
