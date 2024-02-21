package cucumber.pages;

import cucumber.utility.BrowserDriver;
import org.openqa.selenium.By;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String sighIn_link_xpath = "//*[@id=\"menu\"]/a[2]/li";

    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_sighIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sighIn_link_xpath)).click();
    }
}
