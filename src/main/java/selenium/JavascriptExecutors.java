package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class JavascriptExecutors {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.get("http://en.wikipedia.org");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open()");

        // To handle all new opened window
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        System.out.println("Child window handle is" + allWindowHandles);

//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                WebElement text = driver.findElement(By.id("sampleHeading"));
//                System.out.println("Heading of child window is " + text.getText());
//            }
//        }

        driver.quit();

    }
}
