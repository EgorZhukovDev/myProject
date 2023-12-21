package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleMultipleChild {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {
            driver.get("https://demoqa.com/browser-windows");
            // Opening all the child window
            driver.findElement(By.id("windowButton")).click();
            driver.findElement(By.id("messageWindowButton")).click();

            String MainWindow = driver.getWindowHandle();
            System.out.println("Main window handle is " + MainWindow);

            // To handle all new opened window
            Set<String> s1 = driver.getWindowHandles();
            System.out.println("Child window handle is" + s1);
            Iterator<String> iterator = s1.iterator();

            // Here we will check if child window has other child windows and when child window
            //is the main window it will come out of loop.
            while (iterator.hasNext()) {
                String ChildWindow = iterator.next();
                if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    driver.close();
                    System.out.println("Child window closed");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bad things just happened sometimes");
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
