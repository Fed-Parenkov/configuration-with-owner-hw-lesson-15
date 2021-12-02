package parenkov.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProviderSP implements Supplier<WebDriver> {

    private final HugeWebDriverConfigSP config;

    public WebDriverProviderSP(final HugeWebDriverConfigSP config) {
        this.config = config;
    }

    @Override
    public WebDriver get() {
        if(config.getBrowser().equals("chrome")) {
        return new ChromeDriver();
    }
    return new FirefoxDriver();
    }
}
