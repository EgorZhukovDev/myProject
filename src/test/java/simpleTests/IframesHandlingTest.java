package simpleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IframesHandlingTest {

    @Test
    public void searchIframeElementsTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            driver.get("https://demoqa.com/frames");

            //By executing a java script
            JavascriptExecutor exe = (JavascriptExecutor) driver;
            Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
            System.out.println("Number of iframes on the page are " + numberOfFrames);

            //By finding all the web elements using iframe tag
            List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
            System.out.println("The total number of iframes are " + iframeElements.size());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }

    @Test
    public void switchIframeElementsTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {

            //By executing a java script
            driver.get("https://demoqa.com/frames");
            //First find the element using any of locator stratedgy
            WebElement iframeElement = driver.findElement(By.id("frame1"));

            //now use the switch command
            String elementAfterSwitch = driver.switchTo().frame(0).getTitle();

            //Do all the required tasks in the frame 0
            //Switch back to the main window
            driver.switchTo().defaultContent();
            System.out.println("iframeElement - " + iframeElement);
            System.out.println("elementAfterSwitch - " + elementAfterSwitch);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
