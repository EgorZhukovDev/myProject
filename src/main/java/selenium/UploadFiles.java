package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UploadFiles {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("http://images.google.com");

            driver.findElement(By.xpath("//div[@aria-label=\"Поиск по картинке\"]")).click();
//            driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
            driver.findElement(By.xpath("//div[@class='ZeVBtc']//span[text()='загрузите файл']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\zhuko\\OneDrive\\Рабочий стол\\qa.png");
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}

