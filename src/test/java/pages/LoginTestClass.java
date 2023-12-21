package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestClass {

    @Test
    public void registrationTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try {
            driver.get("https://uk-ua.facebook.com/");
            Thread.sleep(2000);

            // Open registration form button
            driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

            String newWindowHandle = driver.getWindowHandle();
            driver.switchTo().window(newWindowHandle);

            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mama Mia");
            Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
            select.selectByIndex(3);
            Thread.sleep(2000);
            driver.navigate().back();


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
