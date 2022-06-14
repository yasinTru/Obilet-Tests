package StepDefinitions;

import Framework.DriverSetup;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage homePage= new HomePage(DriverSetup.getDriver());

    @Given("User on Home Page")
    public void user_on_home_page() {
        homePage.getHomePageUrl();
    }

    @Then("User should see Home Page container")
    public void user_should_see_home_page_container() {
        homePage.getHomePageContainer();

    }

    @When("User clicks Otobus button")
    public void user_clicks_otobus_button() {
        homePage.clickHomePageBusIcon();

    }

    @When("User enters Kalkis noktasi {string} city")
    public void user_enters_kalkis_noktasi_city(String departurePoint) throws InterruptedException {
        homePage.setDeparturePoint(departurePoint);

    }

    @When("User enters Varis noktasi {string} city")
    public void user_enters_varis_noktasi_city(String arrivePoint) throws InterruptedException {
        homePage.setArrivePoint(arrivePoint);

    }

    @When("User clicks Yarin button")
    public void user_clicks_yarin_button() {
        homePage.clickTomorrowButton();

    }

    @When("User clicks Otobus Bileti Bul button")
    public void user_clicks_otobus_bileti_bul_button() {

        homePage.clickSearchButton();
    }

    @Then("User should see filtered Tickets")
    public void user_should_see_filtered_tickets() {
        homePage.getFilteredResults();

    }

}
