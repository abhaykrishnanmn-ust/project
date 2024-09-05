package com.automation.steps;

import com.automation.pages.MapPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        Assert.assertTrue(mapPage.verifyMapCardDetails());
    }

    @And("user selects map options")
    public void userSelectsMapOptions() {
        mapPage.clickOnMapOption();
    }

    @Then("verify content as what you will do is present with same price in map")
    public void verify_content_as_what_you_will_do_is_present_with_same_price_in_map() {
        Assert.assertTrue(mapPage.verifyMapContent());
    }


}
