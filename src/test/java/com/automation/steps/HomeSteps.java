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

    @When("user click on {string}")
    public void userClickOn(String location) {
        homePage.clickOnBeachfront(location);
    }

    @And("user clicks on the Show map")
    public void userClicksOnTheShowMap() {
        homePage.clickOnShowMap();
    }

    @When("user clicks on the Display total before taxes")
    public void userClicksOnTheDisplayTotalBeforeTaxes() {
        homePage.clickOnBeforeTax();
    }

    @And("user selects currency")
    public void userSelectsCurrency() {
        homePage.clickOnCurrency();
    }

    @When("user selects Meet your Host option")
    public void user_selects_meet_your_host_option() {
        homePage.selectMeetYourHost();
    }

    @Then("verify displayed details with the host details")
    public void verify_displayed_details_with_the_host_details() {
        homePage.verifyDisplayedDetailsOfHost();
    }

    @And("user clicks on profile icon")
    public void userClicksOnProfileIcon() {
        homePage.profileIconSelection();
    }

    @When("user clicks on the help centre option")
    public void userClicksOnTheHelpCentreOption() {
        homePage.clicksOnHelpCentre();
    }

    @When("user clicks on things to do")
    public void userClicksOnThingsToDo() {
        homePage.clicksOnThingsToDo();
    }

    @Then("user selects destination")
    public void userSelectsDestination() {
        homePage.clickOnDestination();
    }

    @When("user clicks on filter")
    public void userClicksOnFilter() {
        homePage.clickOnFilterOption();
    }

    @Then("user selects filter by Entire home")
    public void userSelectsFilterByEntireHome() {
        homePage.clickOnEntireHome();
    }

    @And("user selects filter by Price Range")
    public void userSelectsFilterByPriceRange() {
        homePage.clickOnPriceFilter();
    }


    @Then("verify displayed details with the text")
    public void verifyDisplayedDetailsWithTheText(String message) {
        Assert.assertTrue(homePage.verifyThingsToDoMessage(message));
    }

    @When("user clicks on the next in card image")
    public void userClicksOnTheNextInCardImage() {
        homePage.clickOnNextCardImage();
    }

    @Then("verify image displayed is second-{string}")
    public void verifyImageDisplayedIsSecond(String page) {
        Assert.assertTrue(homePage.verifySlidingImage(page));
    }
}
