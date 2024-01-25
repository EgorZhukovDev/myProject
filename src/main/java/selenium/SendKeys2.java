package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SendKeys2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        JavascriptExecutor jscript = (JavascriptExecutor) driver;

        try {

            driver.get("https://www.google.com.ua");

            WebElement qurentElement = driver.findElement(By.name("q"));

            qurentElement.sendKeys("SoftwareTestingHelp", Keys.ENTER);

            jscript.executeScript("window.scrollBy(0,900)");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
