package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElementsLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        try {
            driver.get("http://en.wikipedia.org");
            WebElement link = driver.findElement(By.linkText("Log in"));
            WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
            WebElement searchField = driver.findElement(By.name("search"));
            WebElement searchButton = driver.findElement(By.className("searchButton"));
            WebElement li = driver.findElement(By.id("ca-viewsource"));
            WebElement input = driver.findElement(By.tagName("input"));
            WebElement element = driver.findElement(By.cssSelector("div#simpleSearch input#searchButton"));
            WebElement logo = driver.findElement(By.xpath("//div[@id='mw-panel']/div[@id='p-logo']//a"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
