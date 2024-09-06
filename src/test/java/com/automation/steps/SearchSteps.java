package com.automation.steps;

import com.automation.pages.SearchPage;
import io.cucumber.java.en.When;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();

    @When("user search is performed")
    public void verify_map_page_is_displayed() {
        searchPage.clickOnSearchButton();
    }

}
