package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Scanner;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        // 1. this is js alerts (don't run all together)
//        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        if(driver.getPageSource().contains("sucessfully clicked an alert"))
//            System.out.println("sucessfully clicked an alert");

//        // 2. this is js confirm/dismiss
//        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//        Alert alert2 = driver.switchTo().alert();
//        System.out.println(alert2.getText());
//        alert2.dismiss();
//        if (driver.findElement(By.id("result")).getText().contains("You clicked: Ok")) {
//            System.out.println("You clicked: Ok");
//        } else System.out.println("You clicked: Cancel");
//        if(driver.getPageSource().contains("I am a JS Confirm"))
//            System.out.println("you clicked: JS Confirm");


//        // 3. js Prompt with scanner and reporter
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());

        Scanner in = new Scanner(System.in);
        System.out.print("Input a text for sendKeys: ");
        String num = in.next();
        in.close();

        alert3.sendKeys(num);
        alert3.accept();

        if (driver.findElement(By.id("result")).getText().contains("You entered: " + num)) {
            System.out.println("You entered: " + num);
        } else System.out.println("You clicked: Cancel");

        Thread.sleep(2000);
        driver.quit();
    }
}
