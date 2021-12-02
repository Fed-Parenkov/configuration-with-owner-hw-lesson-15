package parenkov;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import parenkov.config.HugeWebDriverConfig2;
import parenkov.config.HugeWebDriverConfigSP;
import parenkov.config.WebDriverProvider2;
import parenkov.config.WebDriverProviderSP;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTestSP {

    private final HugeWebDriverConfigSP config = new HugeWebDriverConfigSP();
//    private final WebDriverProviderSP provider = new WebDriverProviderSP(config);

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
    @Tag("web3")
    public void testTitle() {
        config.getBrowser();
        open(config.getBaseUrl());
        assertEquals("GitHub: Where the world builds software · GitHub", title());
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
