package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SelectionCheckbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("https://demo.guru99.com/test/radio.html");

            WebElement radio1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
            WebElement radio2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));

            //Radio Button1 is selected
            radio1.click();
            System.out.println("Radio Button Option 1 Selected");

            //Radio Button1 is de-selected and Radio Button2 is selected
            radio2.click();
            System.out.println("Radio Button Option 2 Selected");

            // Selecting CheckBox
            WebElement option1 = driver.findElement(By.id("vfb-6-0"));
            WebElement option2 = driver.findElement(By.id("vfb-6-1"));
            WebElement option3 = driver.findElement(By.id("vfb-6-2"));

            // This will Toggle the Check box
            option1.click();
            option2.click();
            option3.click();

            // Check whether the Check box is toggled on
            if (option1.isSelected()) {
                System.out.println("Checkbox is Toggled On");

            } else {
                System.out.println("Checkbox is Toggled Off");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
