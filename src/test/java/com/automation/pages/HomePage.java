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

    @FindBy(xpath = "//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'18')]")
    WebElement selectCheckInDate;

    @FindBy(xpath = "//div[text()='Check in']/following-sibling::div")
    WebElement fetchCheckInDateFromUserInput;

    @FindBy(xpath = "//h2[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'19')]")
    WebElement selectCheckOutDate;

    @FindBy(xpath = "//div[text()='Check out']/following-sibling::div")
    WebElement fetchCheckOutDateFromUserInput;

    @FindBy(xpath = "//div[text()='Check out']")
    WebElement clickOnCheckOutDate;

    @FindBy(xpath = "//div[text()='Add guests']/parent::div")
    WebElement clickOnAddGuest;

    @FindBy(xpath = "//h1[@id='searchFlow-title-label-adults']/ancestor::section/following-sibling::div/button[2]")
    WebElement addAdults;

    @FindBy(xpath = "//div[text()='Who']/following-sibling::div")
    WebElement fetchNoOfPeoplesFromUserInput;

    @FindBy(xpath = "//button[@data-testid='structured-search-input-search-button']")
    WebElement searchButton;


    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void clickOnWhere() {
        while(!clickOnRegion.isDisplayed()){
            whereInput.click();
        }
    }

    public void selectRegion(String region) {
        clickOnRegion.click();
    }

    public void selectCheckInDate() {
        clickOnCheckInDate.click();
        selectCheckInDate.click();
        String userCheckInDate=fetchCheckInDateFromUserInput.getText().split(" ")[0];
        ConfigReader.setValue("check.in.date",userCheckInDate);

    }

    public void selectCheckOutDate() {
//        clickOnCheckOutDate.click();
        selectCheckOutDate.click();
        String userCheckOutDate=fetchCheckOutDateFromUserInput.getText().split(" ")[0];
        ConfigReader.setValue("check.out.date",userCheckOutDate);
    }

    public void selectNumberOfPeople() {
        clickOnAddGuest.click();
        addAdults.click();
        String NoOfPeoplesByUserInput=fetchNoOfPeoplesFromUserInput.getText().split("&")[0];
        ConfigReader.setValue("no.of.persons",NoOfPeoplesByUserInput);
    }

    public void clickOnSearch() {
        searchButton.click();
    }
}
