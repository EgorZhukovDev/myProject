package allPages.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("https://zero.webappsecurity.com/login.html");
            Thread.sleep(2000);

            // Find user name and set username
            WebElement loginInput = driver.findElement(By.id("user_login"));
            loginInput.sendKeys("username");

            // Password is set
            driver.findElement(By.name("user_password")).sendKeys("password");
            driver.findElement(By.name("submit")).click();

            String expected_title = "Main Title";
            String actual_title = driver.getTitle();





        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
