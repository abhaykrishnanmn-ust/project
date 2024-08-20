package com.automation.steps;

import com.automation.pages.ExperiencePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExperienceSteps {
    ExperiencePage experiencePage=new ExperiencePage();
    @Then("verify experience page is displayed")
    public void verifyExperiencePageIsDisplayed() {
        Assert.assertTrue(experiencePage.isExperiencePageDisplayed());
    }

    @When("user selects first card on experience page")
    public void userSelectsFirstCardOnExperiencePage() {
        experiencePage.selectFirstCardOnExperiencePage();
    }

    @Then("verify displayed details on experience page with the input details")
    public void verifyDisplayedDetailsOnExperiencePageWithTheInputDetails() {
        experiencePage.verifyDetailsOnExperience();
        Assert.assertTrue(experiencePage.verifyDatesOnExperience());
        Assert.assertTrue(experiencePage.verifyNoOfPeople());
    }
}
