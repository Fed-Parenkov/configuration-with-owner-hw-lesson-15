package parenkov;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parenkov.config.UITestConfig;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UITest extends TestBase {

    @Test
    @Tag("ui_test")
    public void titleTest() {
        System.setProperty("driver", "local");
        // для запуска теста через System.setProperty задаем значения WebDriver: "local" или "remote"
        // либо передаем системную переменную через терминал: gradle clean ui_test -Ddriver=local (или remote)

        config = ConfigFactory.create(UITestConfig.class, System.getProperties());
        setWebDriver();
        setBrowserVersion();
        open(config.getBaseUrl());
        assertEquals(expectedResult, title());
    }
}
