package cucumber.pages;

import cucumber.utility.BrowserDriver;
import org.openqa.selenium.By;

public class RegistrationPage extends BrowserDriver {
    public static String registration_heading_xpath = "/html/body/center/h1";

    public static String visibility_registration_heading (){
        String getRegistration = driver.findElement(By.xpath(registration_heading_xpath)).getText();
        return getRegistration;
    }
}
