package com.automation.pages;

import com.automation.utils.ConfigReader;

public class HomePage extends BasePage {

    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void clickOnWhere() {
    }

    public void selectRegion(String region) {
    }

    public void selectCheckInDate() {
    }

    public void selectCheckOutDate() {
    }

    public void selectNumberOfPeople() {
    }

    public void clickOnSearch() {
    }
}
