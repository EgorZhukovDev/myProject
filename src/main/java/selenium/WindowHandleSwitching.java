package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandleSwitching {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        try {
            driver.get("https://www.selenium.dev/");
            Thread.sleep(1000);
            String mainTab = driver.getWindowHandle();

            driver.findElement(By.xpath("//div[@id='main_navbar']//a[@href='/documentation']")).click();

            for (String tab : driver.getWindowHandles()){
                driver.switchTo().window(tab);
            }

            driver.findElement(By.id("m-documentationwebdriver-li")).click();

            driver.switchTo().window(mainTab);

            driver.findElement(By.xpath("//button[@aria-label='Search']")).click();

            Scanner in = new Scanner(System.in);
            System.out.print("Input a text for sendKeys: ");
            String num = in.next();
            in.close();
            driver.findElement(By.xpath("//input[@id='docsearch-input']")).sendKeys(num);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bad things just happened sometimes");
        } finally {
                Thread.sleep(2000);
                driver.quit();
            }
        }
    }

