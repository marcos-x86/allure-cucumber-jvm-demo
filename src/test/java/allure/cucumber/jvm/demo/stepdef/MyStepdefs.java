package allure.cucumber.jvm.demo.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    private static final String MSG_ENTER_LOGIN_PAGE = "I enter to Google Services Login page";
    private static final String MSG_FILL_USERNAME = "I fill the username field with \"%s\"";
    private static final String MSG_FILL_PASSWORD = "I fill the password field with \"%s\"";
    private static final String MSG_CLICK_LOGIN = "I click on login button";
    private static final String MSG_VERIFY_LOGIN = "I am in the login page";

    @Given("^I enter to Google Services Login page$")
    public void iEnterToGoogleServicesLoginPage() {
        System.out.println(MSG_ENTER_LOGIN_PAGE);
    }

    @When("^I fill the username field with \"([^\"]*)\"$")
    public void iFillTheUsernameFieldWith(final String username) {
        System.out.println(String.format(MSG_FILL_USERNAME, username));
    }

    @And("^I fill the password field with \"([^\"]*)\"$")
    public void iFillThePasswordFieldWith(final String password) {
        System.out.println(String.format(MSG_FILL_PASSWORD, password));
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        System.out.println(MSG_CLICK_LOGIN);
    }

    @Then("^I am in the login page$")
    public void iAmInTheLoginPage() {
        System.out.println(MSG_VERIFY_LOGIN);
    }
}
