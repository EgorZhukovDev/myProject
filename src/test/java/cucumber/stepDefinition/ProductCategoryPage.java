package cucumber.stepDefinition;

import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;

import static cucumber.pages.ProductCategoryPage.visibility_product_category;


public class ProductCategoryPage {

    @Then("^User should be able to view product category page$")
    public void product_category_validation() {
        String actual_product_category = visibility_product_category();
        Assertions.assertEquals("Formal Shoes", actual_product_category);
    }
}
