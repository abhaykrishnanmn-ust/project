package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//label[@for='bigsearch-query-location-input']")
    WebElement whereInput;

    @FindBy(xpath = "//button[@id='search-block-tab-EXPERIENCES']")
    WebElement experiencesButton;

    @FindBy(xpath = "//div[text()='Date']")
    WebElement checkExperienceIsClicked;

    @FindBy(xpath = "//input[@id='bigsearch-query-location-input']")
    WebElement staysSearchInputField;

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

    @FindBy(xpath = "//div[text()='Date']/following-sibling::div")
    WebElement fetchUserInputExperienceDates;

    @FindBy(xpath = "//span[text()]/ancestor::label")
    WebElement homePageContent;

    @FindBy(xpath = "//div[@class='_pvfq6t']/button")
    WebElement globeButton;

    @FindBy(xpath = "//button[text()='Language and region']")
    WebElement selectLanguageButton;

    @FindBy(xpath = "//div[text()='Dansk']/..")
    WebElement selectLanguage;

    @FindBy(xpath = "//a[@class='_ci5ckgc']/div")
    WebElement languageSelected;

    @FindBy(id = "bigsearch-query-location-suggestion-0")
    WebElement staysInputSearchLocation;

    @FindBy(xpath = "//nav[@aria-label='Profile']/div/a")
    WebElement airbnbYourHome;

    @FindBy(xpath = "//span[text()='Beachfront']/ancestor::label")
    WebElement selectBeachfront;

    @FindBy(xpath = "//span[text()='Show map']/ancestor::button")
    WebElement showMapButton;


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

    public void clickOnExperiences() {
        while(!isDisplayedElement(checkExperienceIsClicked)){
            experiencesButton.click();
            System.out.println("clicked");
        }
    }

    public void selectDatesOfExperiences() {
        selectCheckInDate.click();
        selectCheckOutDate.click();
        String userInputExperienceDates=fetchUserInputExperienceDates.getText().split(" - ")[0]+
                " "+fetchUserInputExperienceDates.getText().split(" ")[3];
        ConfigReader.setValue("experiences.dates",userInputExperienceDates);
    }

    public boolean isHomePageDisplayed() {
        isPresent(homePageContent);
        homePageContent.isDisplayed();
//       return  homePageContent.isSelected();
        return true;
    }

    public void clickOnGlobalIcon() {
        globeButton.click();
    }

    public boolean verifyLanguageIsDisplayed() {
        return selectLanguageButton.isDisplayed();
    }

    public void selectLanguage() {
        selectLanguage.click();
    }

    public boolean verifyLanguageIsChanged() {
//        globeButton.click();
        return languageSelected.getText().contains(ConfigReader.getValue("language"));
    }

    public void searchDestinationInStays(String destination) {
        staysSearchInputField.sendKeys(destination);
    }

    public void clickOnLocationInStaysSearch() {
        isPresent(staysInputSearchLocation);
        staysInputSearchLocation.click();
    }

    public void clickOnAirbnbYourHome() {
        airbnbYourHome.click();
    }

    public void clickOnBeachfront() {
        selectBeachfront.click();
    }

    public void clickOnShowMap() {
        showMapButton.click();
    }
}
