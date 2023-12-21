package simpleTests;

import pages.retry.Retry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SimpleTest {

    private static final List<String> SUPPORTED_COUNTRIES =
            List.of("Ukraine, France, England, USA");

    @DataProvider
    protected static Iterator<String> getAllSupportCountries() {
        return SUPPORTED_COUNTRIES.iterator();
    }

    @DataProvider
    public static Object[][] getAllSupportCountriesObjects() {
        return new Object[][]{
                {"Ukraine", "Kiev"},
                {"France", "Paris"},
                {"England", "London"},
                {"USA", "NY"}};
    }

    @Test
    public void simpleTest() {
        String message = "I am simple test";

        try {
            System.out.println(message);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Assert.assertEquals(message, message);
        }
    }

    @Test (dataProvider = "getAllSupportCountriesObjects")
    public void simpleSetOfTest(String allCountries, String allCapitals) {
        String message = "Simple test with countries - " + allCountries +
                " and the capital - " + allCapitals;

        try {
            System.out.println(message);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
//            Assert.assertEquals(message, message);
        }
    }

    @Test (retryAnalyzer = Retry.class)
    public void simpleRetryAnalyzerTest() {
        try {
            String message = "I am retryAnalyzer test";
            System.out.println(message);
            Assert.assertEquals(message, "I am retryAnalyzer test");
            Assert.fail();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        }
    }

    @Test
    public void linkSimpleTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            driver.get("http://en.wikipedia.org");
            Thread.sleep(1000);
            new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='Welcome_to_Wikipedia']/a"))).click();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Sorry but nor this time");
        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
}

    @AfterTest
    public void driverCloser(){
        System.out.println("driverCloser AfterTest works");
    }
}
