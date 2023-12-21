package windowHandleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleTestClass {
    @Test
    public void windowHandleTest() throws InterruptedException {
        // Not nessesary to write path in setProperty!!!
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\student\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try {
            driver.get("https://demoqa.com/browser-windows");

            // Open new window by clicking the button
            driver.findElement(By.id("windowButton")).click();

            // Click on the new window element and read the text displayed on the window
            //Get handles of the windows
            String mainWindowHandle = driver.getWindowHandle();
            Set<String> allWindowHandles = driver.getWindowHandles();
            Iterator<String> iterator = allWindowHandles.iterator();

            // Here we will check if child window has other child windows and will fetch the heading of the child window
            while (iterator.hasNext()) {
                String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                    driver.switchTo().window(ChildWindow);
                    WebElement text = driver.findElement(By.id("sampleHeading"));
                    System.out.println("Heading of child window is " + text.getText());
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

