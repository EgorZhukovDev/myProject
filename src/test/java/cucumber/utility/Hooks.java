package cucumber.utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver browserDriver;

    public static ChromeOptions chromeOptions;

    @Before
    public void setUp(){
        browserDriver =new BrowserDriver();
    }

    @After
    public void tearDown(){
        browserDriver.close();
    }

}
