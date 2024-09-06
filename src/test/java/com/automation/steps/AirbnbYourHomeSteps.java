package com.automation.steps;

import com.automation.pages.AirbnbYourHomePage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AirbnbYourHomeSteps {
    AirbnbYourHomePage airbnbYourHomePage = new AirbnbYourHomePage();

    @Then("verify Airbnb your home is displayed with text")
    public void verify_airbnb_your_home_is_displayed_with_text(String message) {
        Assert.assertTrue(airbnbYourHomePage.verifyAirbnbYourHomeMessage(message));
        ReportManager.attachScreenShot();
    }

    @When("user uses slider")
    public void userUsesSlider() {
        airbnbYourHomePage.slideSlider();
    }

    @Then("verify the price is changing")
    public void verifyThePriceIsChanging() {
        Assert.assertFalse(airbnbYourHomePage.verifyPriceChange());
        ReportManager.attachScreenShot();
    }
}
