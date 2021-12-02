package parenkov;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import parenkov.config.HugeWebDriverConfig1;
import parenkov.config.HugeWebDriverConfig2;
import parenkov.config.WebDriverProvider1;
import parenkov.config.WebDriverProvider2;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest2 {

    private final HugeWebDriverConfig2 config = new HugeWebDriverConfig2();
    private final WebDriverProvider2 provider = new WebDriverProvider2(config);

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
    @Tag("web2")
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
