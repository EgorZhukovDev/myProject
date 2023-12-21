package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            WebElement element1 = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(element1, element2);
//            actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform(); - the same but much longer

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }

}
