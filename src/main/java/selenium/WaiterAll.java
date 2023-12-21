package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaiterAll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();


        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://pagination.js.org");
            Thread.sleep(2000);

            List <WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            List <WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));

            String text = elements.get(5).getText();
            System.out.println(text);

            pages.get(2).click();
            wait.until(ExpectedConditions.stalenessOf(elements.get(5)));

            elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            text = elements.get(5).getText();
            System.out.println(text);

            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
