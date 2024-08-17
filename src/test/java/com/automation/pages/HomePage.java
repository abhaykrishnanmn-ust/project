package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//label[@for='bigsearch-query-location-input']")
    WebElement whereInput;

    @FindBy(xpath = "//span[text()='Europe']/preceding-sibling::img")
    WebElement clickOnRegion;

    @FindBy(xpath = "//div[text()='Check in']")
    WebElement clickOnCheckInDate;

    @FindBy(xpath = "//h2[text()='August 2024']/ancestor::div/table//tr/td[contains(@aria-label,'18')]")
    WebElement selectCheckInDate;

    @FindBy(xpath = "//h2[text()='August 2024']/ancestor::div/table//tr/td[contains(@aria-label,'19')]")
    WebElement selectCheckOutDate;

    @FindBy(xpath = "//div[text()='Check out']")
    WebElement clickOnCheckOutDate;

    @FindBy(xpath = "//div[text()='Add guests']/parent::div")
    WebElement clickOnAddGuest;

    @FindBy(xpath = "//h1[@id='searchFlow-title-label-adults']/ancestor::section/following-sibling::div/button[2]")
    WebElement addAdults;

    @FindBy(xpath = "//button[@data-testid='structured-search-input-search-button']")
    WebElement searchButton;


    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void clickOnWhere() {
        whereInput.click();
    }

    public void selectRegion(String region) {
        whereInput.click();
        clickOnRegion.click();
    }

    public void selectCheckInDate() {
        clickOnCheckInDate.click();
        selectCheckInDate.click();
    }

    public void selectCheckOutDate() {
//        clickOnCheckOutDate.click();
        selectCheckOutDate.click();
    }

    public void selectNumberOfPeople() {
        clickOnAddGuest.click();
        addAdults.click();
    }

    public void clickOnSearch() {
        searchButton.click();
    }
}
