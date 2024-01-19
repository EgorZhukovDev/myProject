package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaiterExplicit2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("--disable-arguments");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.google.com.ua");
        WebElement curentElement = driver.findElement(By.name("q"));
        curentElement.sendKeys("Testing");
        curentElement.submit();
        WebDriverWait waitWD = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Тестирование программного обеспечения")));
        secondElement.click();
        driver.quit();
    }
}
