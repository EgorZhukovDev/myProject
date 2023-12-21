package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("http://en.wikipedia.org/");
            WebElement searchInput = driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));

            String select = Keys.chord(Keys.CONTROL, "a");
            String cut = Keys.chord(Keys.CONTROL, "x");
            String paste = Keys.chord(Keys.CONTROL, "v");

            searchInput.sendKeys("test text");
            searchInput.sendKeys(select);
            searchInput.sendKeys(cut);
            searchInput.sendKeys(paste);
            searchInput.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
