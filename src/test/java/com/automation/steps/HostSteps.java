package com.automation.steps;

import com.automation.pages.HostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HostSteps {
    HostPage hostPage=new HostPage();
    @When("user selects a card with host preview")
    public void userSelectsACardWithHostPreview() {
        hostPage.clicksOnHostPreview();
    }

    @Then("host details are taken")
    public void hostDetailsAreTaken() {
        hostPage.getsHostDetails();
    }

    @When("user close the preview")
    public void userCloseThePreview() {
        hostPage.closeHostDetails();
    }

    @And("user open the same card")
    public void userOpenTheSameCard() {
        hostPage.openCardWithPreview();
    }
}
