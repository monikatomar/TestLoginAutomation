package cucumberStepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.BrowserFactory;
import pages.LoginPage;

public class InvalidLoginStepDefinition {

    //BrowserFactory browserObj;

    @Given("^I have launched the browser and entered the apotheke URL$")
    public void i_have_launched_the_browser_and_entered_the_apotheke_URL() throws Throwable {
        //Initiate driver and launch url
        BrowserFactory.startBrowser("chrome");
    }

    @When("^I input valid username and invalid password and click on Login button$")
    public void i_input_valid_username_and_invalid_password_and_click_on_Login_button() throws Throwable {
        //Initiate PO for login page
        LoginPage login_page = new LoginPage();

        //perform login steps
        login_page.loginSteps("monikatomar09@yahoo.com","Monika1992");
    }

    @Then("^I should see error message on same login page$")
    public void i_should_see_error_message_on_same_login_page() throws Throwable {
        //Initiate PO for home page and validate
        LoginPage login_page2 = new LoginPage();
        login_page2.validateLoginPage();

        //quit the instance of driver
        BrowserFactory.driver.quit();
    }
}
