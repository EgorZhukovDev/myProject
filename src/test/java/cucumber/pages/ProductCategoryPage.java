package cucumber.pages;

import cucumber.utility.BrowserDriver;
import org.openqa.selenium.By;

public class ProductCategoryPage extends BrowserDriver {
    public static String product_category_heading_path = "//*[@id=\"ShoeType\"]";

    public static String visibility_product_category(){
        String actual_product_category = driver.findElement(By.xpath(product_category_heading_path)).getText();
        return actual_product_category;
    }
}
