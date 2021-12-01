package parenkov;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import parenkov.config.TestConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests extends TestConfig {

    private final TestConfig config = new TestConfig();

    @Test
    void titleTest() {
        Selenide.open(config.getBaseUrl());
        assertEquals(Selenide.title(), "Selenide: лаконичные " +
                "и стабильные UI тесты на Java");
    }
}
