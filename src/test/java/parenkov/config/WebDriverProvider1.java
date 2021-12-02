package parenkov.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider1 implements Supplier<WebDriver> {

    private final parenkov.config.HugeWebDriverConfig1 config;

    public WebDriverProvider1(final HugeWebDriverConfig1 config) {
        this.config = config;
    }

    @Override
    public WebDriver get() {
        if(config.getBrowser().equals(Browser.CHROME)) {
        return new ChromeDriver();
    }
    return new FirefoxDriver();
    }
}
