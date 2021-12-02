package parenkov;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import parenkov.config.HugeWebDriverConfig1;
import parenkov.config.WebDriverProvider1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest1 {

    private final HugeWebDriverConfig1 config = new HugeWebDriverConfig1();
    private final WebDriverProvider1 provider = new WebDriverProvider1(config);

//    @Test
////    @Tag("web")
//    public void testTitle() {
//        WebDriver driver = provider.get();
//        driver.get(config.getBaseUrl());
//        assertEquals(
//                "GitHub: Where the world builds software · GitHub",
//                driver.getTitle()
//        );
//        driver.quit();
//    }


    @Test
    @Tag("web")
    public void testTitle() {
        WebDriver driver = provider.get();
        driver.get(config.getBaseUrl());
        assertEquals(
                "GitHub: Where the world builds software · GitHub",
                driver.getTitle()
        );
        driver.quit();
    }

//    @Test
//    @Tag("web")
//    public void testTitle() {
//        WebDriver driver = provider.get();
//        driver.get(config.getBaseUrl());
//        assertEquals(
//                "GitHub: Where the world builds software · GitHub",
//                driver.getTitle()
//        );
//        driver.quit();
//    }




//    private WebDriver getDriver() {
//        return new FirefoxDriver();
//    }
//
//    private String getUrl() {
//        return "https://github.com";
//    }

}
