package com.automation.steps;

import com.automation.pages.HelpCenterPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HelpCenterSteps {
    HelpCenterPage helpCenterPage=new HelpCenterPage();

    @Then("verify help centre page is displayed with text")
    public void verify_help_centre_page_is_displayed_with_text(String message) {
        Assert.assertTrue(helpCenterPage.verifyDisplayedMessage(message));
    }
}
