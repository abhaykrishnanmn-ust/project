package com.automation.steps;

import com.automation.pages.BookingPage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class BookingSteps {
    BookingPage bookingPage = new BookingPage();

    @Then("verify searched page is displayed")
    public void verify_searched_page_is_displayed() {
        Assert.assertTrue(bookingPage.isSearchedPageIsDisplayed());
        ReportManager.attachScreenShot();
    }

    @When("user selects first card")
    public void user_selects_first_card() {
        bookingPage.clickOnFirstCard();
    }

    @Then("verify displayed details with the input details")
    public void verify_displayed_details_with_the_input_details() {
        Assert.assertTrue(bookingPage.verifyCheckInDate());
        ReportManager.attachScreenShot();
        Assert.assertTrue(bookingPage.verifyCheckOutDate());
        ReportManager.attachScreenShot();
        Assert.assertTrue(bookingPage.verifyNoOfPersons());
        ReportManager.attachScreenShot();
    }

    @When("user selects any card")
    public void userSelectsAnyCard() {
        bookingPage.clickOnAnyCard();

    }

    @Then("verify the price distribution is equals total price")
    public void verifyThePriceDistributionIsEqualsTotalPrice() {
        bookingPage.verifyPrice();
    }

}
