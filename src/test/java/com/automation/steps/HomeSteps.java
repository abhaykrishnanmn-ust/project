package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
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
}
