package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
    }

    @Then("verify user is on homepage")
    public void verify_user_is_on_homepage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user clicks on where")
    public void user_clicks_on_where() {
        homePage.clickOnWhere();
    }

    @Then("user selects destination by {string}")
    public void user_selects_destination_by(String region) {

        homePage.selectRegion(ConfigReader.getValue(region));
    }

    @Then("select check in and check out date")
    public void select_check_in_and_check_out_date() {
        homePage.selectCheckInDate();
        homePage.selectCheckOutDate();
    }

    @Then("select number of people")
    public void select_number_of_people() {
        homePage.selectNumberOfPeople();
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        homePage.clickOnSearch();
    }

    @When("user clicks on experiences")
    public void userClicksOnExperiences() {
        homePage.clickOnExperiences();
    }

    @And("select dates")
    public void selectDates() {
        homePage.selectDatesOfExperiences();
    }
    @When("user clicks on global icon")
    public void user_clicks_on_global_icon() {
        homePage.clickOnGlobalIcon();
    }

    @Then("verify language options are displayed")
    public void verify_language_options_are_displayed() {
        Assert.assertTrue(homePage.verifyLanguageIsDisplayed());
    }

    @When("user clicks on language")
    public void user_clicks_on_language() {
        homePage.selectLanguage();
    }

    @Then("verify language is changed to the selected language")
    public void verify_language_is_changed_to_the_selected_language() {
        Assert.assertTrue(homePage.verifyLanguageIsChanged());
    }

    @Then("user types location {string} in the search destination field")
    public void userTypesLocationInTheSearchDestinationField(String destination) {
        homePage.searchDestinationInStays(destination);
    }

    @When("user clicks on destination")
    public void userClicksOnDestination() {
        homePage.clickOnLocationInStaysSearch();
    }

    @When("user clicks on Airbnb your home")
    public void userClicksOnAirbnbYourHome() {
        homePage.clickOnAirbnbYourHome();
    }
}
