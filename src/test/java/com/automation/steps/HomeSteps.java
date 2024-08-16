package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomeSteps {
    HomePage homePage= new HomePage();
    @Given("user opens website")
    public void userOpensWebsite() {
        homePage.openWebsite();
    }
}
