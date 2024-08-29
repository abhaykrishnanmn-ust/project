package com.automation.steps;

import com.automation.pages.HostPage;
import io.cucumber.java.en.When;

public class HostSteps {
    HostPage hostPage=new HostPage();
    @When("user selects a card with host preview")
    public void userSelectsACardWithHostPreview() {
        hostPage.clicksOnHostPreview();
    }
}
