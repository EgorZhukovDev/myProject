package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaiterExplicit {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
//            options.setAcceptInsecureCerts(true);
//            options.setAndroidActivity("");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            driver.get("http://en.wikipedia.org");

            new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='Welcome_to_Wikipedia']/a"))).click();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}
