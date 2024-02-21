package cucumber.stepDefinition;

import cucumber.api.java.en.Given;

import static cucumber.pages.HomePage.*;


public class BasePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_sighIn_link();
    }
}
