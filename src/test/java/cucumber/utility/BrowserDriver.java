package cucumber.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public static String driverPath = "e:\\Java\\Study\\myProject\\src\\test\\resources\\drivers\\chromedriver.exe";
    public static ChromeOptions chromeOptions;

    public BrowserDriver() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remove-alloe-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", driverPath);
        this.driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");

    }

    public void close(){
        this.driver.close();

    }
}
