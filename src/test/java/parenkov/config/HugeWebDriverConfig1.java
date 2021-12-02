package parenkov.config;

public class HugeWebDriverConfig1 {

    public Browser getBrowser() {
        return Browser.CHROME;
    }

//    public String getBaseUrl() {
//        return System.getProperty("baseUrl");
//    }

    public String getBaseUrl() {
        return "https://github.com";
    }
}
