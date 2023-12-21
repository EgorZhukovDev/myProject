package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ElementPresented {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("http://github.com");

            if (driver.findElements(By.xpath("//a[text()='Log in']")).size() > 0) System.out.println("Such element is presented");
            else System.out.println("Cannot find such element");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
