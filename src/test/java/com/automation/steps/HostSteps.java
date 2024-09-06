package com.automation.steps;

import com.automation.pages.HostPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HostSteps {
    HostPage hostPage = new HostPage();

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

    @Then("verify displayed host details with the details in preview")
    public void verify_displayed_host_details_with_the_details_in_preview() {
        Assert.assertTrue(hostPage.verifyHostNameOnPreview());
        ReportManager.attachScreenShot();
    }
}
