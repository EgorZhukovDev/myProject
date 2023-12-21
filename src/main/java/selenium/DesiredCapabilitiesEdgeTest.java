package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class DesiredCapabilitiesEdgeTest {
    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
//        options.setBrowserVersion("");
//        options.merge("extraCapabilities");
//        options.useWebView(true);

        WebDriver driver = new EdgeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("http://gmail.com");
            driver.quit();
    }
}
