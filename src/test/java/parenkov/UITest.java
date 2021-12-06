package parenkov;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parenkov.config.UITestConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UITest extends UITestBase {

    @Test
    @Tag("web")
    public void titleTest() {
        System.setProperty("driver", "local"); // для запуска теста задаем "local" или "remote" WebDriver
        // либо передаем системную переменную через терминал: gradle clean web -Ddriver=local (или remote)

        config = ConfigFactory.create(UITestConfig.class, System.getProperties());
        setWebDriver();
        setBrowserVersion();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }
}
