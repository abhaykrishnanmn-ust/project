package com.automation.steps;

import com.automation.pages.MapPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MapSteps {
    MapPage mapPage=new MapPage();
    @Then("verify map page is displayed")
    public void verify_map_page_is_displayed() {
        mapPage.verifyMapPageIsDisplayed();
    }

    @When("user click on one of the price tag displayed")
    public void user_click_on_one_of_the_price_tag_displayed() {
        mapPage.clickOnPriceTagDisplayed();
    }

    @Then("verify details card is displayed")
    public void verify_details_card_is_displayed() {
        mapPage.verifyDetailsCardIsDisplayed();
    }

    @When("user clicks on the details card")
    public void user_clicks_on_the_details_card() {
        mapPage.clickDetailsCard();
    }

    @Then("verify map card detail with page detail")
    public void verify_map_card_detail_with_page_detail() {
        mapPage.verifyMapCardDetails();
    }
}
