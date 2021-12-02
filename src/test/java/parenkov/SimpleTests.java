package parenkov;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

//    @Test
//    public void testTitle1() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://github.com");
//        assertEquals(
//                "GitHub: Where the world builds software · GitHub",
//                driver.getTitle()
//        );
//        driver.quit();
//    }
}
