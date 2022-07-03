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

    @When("User types {string} to searchbox and press enter")
    public void user_types_to_searchbox(String otobusTxt) {
      helpPage.clickSearchBox(otobusTxt);
    }

    @Then("Clicks  2th result in the list")
    public void clicks_2th_result_in_the_list() {
      //  helpPage.click2thResult();
    }

    @Then("User should see same searched text title")
    public void user_should_see_same_searched_text_title() {
       // helpPage.checkTextTitle();
    }

    @Then("User should see results details page")
    public void user_should_see_results_details_page() {
        //  helpPage.checkDetails();
    }

}
