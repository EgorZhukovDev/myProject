package framework.driver;

import framework.enuns.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static WebDriver driver = null;

    public BrowserManager(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver initialize() {
        //singleton pattern
        if (driver == null) {
            if (Constants.browserName == Browser.CHROME) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(Constants.url);
        }
        return driver;
    }

    public static void quit() {
        System.out.println("Quiting");
        driver.quit();
        driver = null;
    }

    public static void close() {
        System.out.println("Closing...");
        driver.close();
        driver = null;
    }

    public static void reloadPage() {
        driver.navigate().refresh();
    }
}