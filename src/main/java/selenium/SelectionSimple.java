package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SelectionSimple {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {
            driver.get("https://uk-ua.facebook.com/");
            Thread.sleep(1000);

            // Open registration form button
            driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

            String newWindowHandle = driver.getWindowHandle();
            driver.switchTo().window(newWindowHandle);

            Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
            select.selectByIndex(3);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bad things just happened sometimes");
        } finally {
                Thread.sleep(2000);
                driver.quit();
            }
        }
    }

