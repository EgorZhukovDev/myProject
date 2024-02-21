package cucumber.stepDefinition;

import cucumber.api.java.en.When;

import static cucumber.pages.SignInPage.*;

public class SignInPage {

    @When("^User successfully enters the log in details$")
    public void user_logs_to_the_login_page() {
        sendkeys_username();
        sendkeys_password();
        click_login_btn();
    }
}
