package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccessionOfElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
            Thread.sleep(2000);
//            WebElement button1 = driver.findElement(By.xpath("//button[@id ='myBtn']"));
//            WebElement button2 = driver.findElement(By.xpath("//button[text()='Try it']"));

            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Try it']")))
                    .click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
