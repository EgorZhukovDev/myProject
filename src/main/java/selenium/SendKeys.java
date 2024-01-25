package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("http://en.wikipedia.org/");

            WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));

            searchInput.sendKeys("test text");

            String selectAll = Keys.chord(Keys.CONTROL, "a");
            String cutAll = Keys.chord(Keys.CONTROL, "x");
            String putAll = Keys.chord(Keys.CONTROL, "v");

            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='cdx-text-input__input cdx-text-input__input--has-value']")))
                    .sendKeys(selectAll);

            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='cdx-text-input__input cdx-text-input__input--has-value']")))
                    .sendKeys(cutAll);

            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='cdx-text-input__input']")))
                    .sendKeys(putAll);

            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='cdx-text-input__input cdx-text-input__input--has-value']")))
                    .sendKeys(Keys.ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
