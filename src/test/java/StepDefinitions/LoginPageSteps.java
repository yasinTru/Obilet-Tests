package StepDefinitions;

import Framework.DriverSetup;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    LoginPage loginPage= new LoginPage(DriverSetup.getDriver());



    @When("User click Uye Girisi button")
    public void user_click_uye_girisi_button() {

        loginPage.goToLoginPage();

    }

    @Then("User see Login Page opens")
    public void user_see_login_page_opens() {
        loginPage.getLoginPageContainer();

    }

    @When("User enters {string} email")
    public void user_enters_email(String email) {
        loginPage.setLoginEmail(email);

    }

    @When("User enters {string} password")
    public void user_enters_password(String password) {
        loginPage.setLoginPassword(password);

    }

    @Then("Should see {string} email error message")
    public void should_see_email_error_message(String actualEmailError) {

        loginPage.getEmailErrorMessage(actualEmailError);

    }

    @Then("Should see {string} password error message")
    public void should_see_password_error_message(String actualPasswordError) {
        loginPage.getPasswordEmailErrorMessage(actualPasswordError);


    }

    @When("User clicks Giris Yap button")
    public void user_clicks_giris_yap_button() {
         loginPage.clickLoginButton();

    }

    @Then("User should see {string} empty mail error message")
    public void user_should_see_empty_mail_error_message(String emptyEmail) {
        loginPage.getEmptyEmail(emptyEmail);
    }

    @Then("User should see {string} empty pasword error message")
    public void user_should_see_empty_pasword_error_message(String emptyPassword) {
        loginPage.getEmptyPassword(emptyPassword);
    }

}
