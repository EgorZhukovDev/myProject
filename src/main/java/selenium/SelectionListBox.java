package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SelectionListBox {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("incognito");
            //        options.addArguments("headless");

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://accounts.google.com/signup/v2/birthdaygender?service=mail&hl=ru&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-ru&theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp&TL=AIBe4_KJ90CTJOL6Xia67_EvcmzTAQ5rxmflhUguPAqEdnAK_d5IoKVnM-2YX_Ji");
            creationAcc("Tatysa", "Popova");

            selectOption();
            Thread.sleep(1000);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bad things just happened sometimes");
        } finally {
                Thread.sleep(2000);
                driver.quit();
            }
        }

    public static void creationAcc(String firstName, String lastName){
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("collectNameNext")).click();

    }
    public static void selectOption(){
        driver.findElement(By.xpath("//div[@class='CuHakb']//select[@id='gender']")).click();


    }
}

