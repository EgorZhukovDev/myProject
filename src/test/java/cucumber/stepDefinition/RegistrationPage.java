package cucumber.stepDefinition;

import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;

import static cucumber.pages.RegistrationPage.visibility_registration_heading;

public class RegistrationPage {
    @Then("^User should be able to view the Registration page$")
    public void user_shoul_be_able_to_view_the_registration_page() {
        String actual_registration_page = visibility_registration_heading();
        Assertions.assertEquals("User Registration Page", actual_registration_page);
    }
}
