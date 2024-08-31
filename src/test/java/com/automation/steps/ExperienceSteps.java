package com.automation.steps;

import com.automation.pages.ExperiencePage;
import io.cucumber.java.en.And;
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

    @Then("user scrolls through the page till similar experiences")
    public void user_scrolls_through_the_page_till_similar_experiences() {
        experiencePage.scrollTillSimilarSearches();
    }

    @When("user clicks on the card on similar experiences")
    public void user_clicks_on_the_card_on_similar_experiences() {
        experiencePage.clickOnCardOfSimilarSearches();
    }

    @Then("verify displayed details with the details on card")
    public void verify_displayed_details_with_the_details_on_card() {
        experiencePage.verifySimilarCardDetails();
    }

    @And("user click on dates")
    public void userClickOnDates() {
        experiencePage.clickOnExperiencePageDate();
    }

    @When("user changes dates")
    public void userChangesDates() {
        experiencePage.selectNewDates();
    }

    @And("user click on save")
    public void userClickOnSave() {
        experiencePage.clickOnSaveNewDates();
    }

    @Then("verify displayed dates are different from previous dates")
    public void verifyDisplayedDatesAreDifferentFromPreviousDates() {
        experiencePage.verifyNewDates();
    }

    @And("get price and total price")
    public void getPriceAndTotalPrice() {
        experiencePage.verifyPrice();
    }
}
