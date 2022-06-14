package StepDefinitions;

import Framework.DriverSetup;
import Pages.HelpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpPageSteps {

    HelpPage helpPage= new HelpPage(DriverSetup.getDriver());

    @When("User clicks Help Page button")
    public void user_clicks_help_page_button() {
        helpPage.clickHelpPage();

    }

    @Then("User should see Help Page opens")
    public void user_should_see_help_page_opens() {
        helpPage.getHelpPageContainer();

    }


}
