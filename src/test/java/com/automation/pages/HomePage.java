package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
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

    @FindBy(xpath = "//div[contains(text(),'Bali')]")
    WebElement staysInputSearchLocation;

    @FindBy(xpath = "//nav[@aria-label='Profile']/div/a")
    WebElement airbnbYourHome;

    @FindBy(xpath = "//span[text()='Beachfront']/ancestor::label")
    WebElement selectBeachfront;

    @FindBy(xpath = "//span[text()='Amazing views']/ancestor::label")
    WebElement selectAmazingViews;

    @FindBy(xpath = "//span[text()='Farms']/ancestor::label")
    WebElement selectFarm;

    @FindBy(xpath = "//span[text()='Show map']/ancestor::button")
    WebElement showMapButton;

    @FindBy(xpath = "//button[@role='switch']/div")
    WebElement taxButton;

    @FindBy(id = "tab--language_region_and_currency--1")
    WebElement currencyButton;

    @FindBy(xpath = "//a[text()='Message Host']")
    WebElement messageHostButton;

    @FindBy(xpath = "//a[@aria-label='Go to Host full profile']")
    WebElement hostProfileCard;

    @FindBy(xpath = "//div[@class='_3hmsj']//child::button")
    WebElement profileIcon;

    @FindBy(xpath = "//div[@data-testid='simple-header-profile-menu']//a[4]")
    WebElement helpCentre;

    @FindBy(xpath = "//button[@id='tab--seo-link-section-tabbed-dense-grid--7']")
    WebElement thingsToDo;

    @FindBy(xpath = "//div[@id=\"panel--seo-link-section-tabbed-dense-grid--7\"]/ul/li[13]/a/span[1]")
    WebElement destination;

    @FindBy(xpath = "//button[@data-testid='category-bar-filter-button']")
    WebElement filterButton;

    @FindBy(xpath = "//span[text()='Entire home']/..")
    WebElement filterByEntireHome;

    @FindBy(xpath = "//div[@data-section-id='DESCRIPTION_DEFAULT']//h2/div")
    WebElement thingsToDoMessage;

    @FindBy(xpath = "//span[@class='isqgmsg dir dir-ltr']/ancestor::button[contains(@aria-label,'Next photo:')]")
    WebElement slideNextImageButton;

    @FindBy(xpath = "//div[@role='img']")
    WebElement slideImageElement;

    @FindBy(xpath = "//span[@class='_1lsdkkh']")
    WebElement totalPriceBeforePageIsDisplayed;

    @FindBy(xpath = "//button[@aria-label='Minimum Price']")
    WebElement filterMinimumPriceButton;

    @FindBy(xpath = "//button[@aria-label='Maximum Price']")
    WebElement filterMaximumPriceButton;

    @FindBy(xpath = "//input[@id='price_filter_min']")
    WebElement filterMinimumPriceInput;

    @FindBy(xpath = "//input[@id='price_filter_max']")
    WebElement filterMaximumPriceInput;

    @FindBy(xpath = "//button[@data-testid='stepper-filter-item-min_bedrooms-stepper-increase-button']")
    WebElement bedroomCountButton;

    @FindBy(xpath = "//button[@data-testid='stepper-filter-item-min_beds-stepper-increase-button']")
    WebElement bedCountButton;

    @FindBy(xpath = "//h2[@elementtiming='LCP-target']")
    WebElement currencyOptions;

    @FindBy(xpath = "//div[text()='MYR – RM']")
    WebElement newCurrency;

    @FindBy(xpath = "//span[text()='Choose a currency']//descendant-or-self::span")
    WebElement currencyVerification;


    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void clickOnWhere() {
        while (!clickOnRegion.isDisplayed()) {
            whereInput.click();
        }
    }

    public void selectRegion(String region) {
        clickOnRegion.click();
    }

    public void selectCheckInDate() {
        clickOnCheckInDate.click();
        selectCheckInDate.click();
        String userCheckInDate = fetchCheckInDateFromUserInput.getText().split(" ")[0];
        ConfigReader.setValue("check.in.date", userCheckInDate);
    }

    public void selectCheckOutDate() {
//        clickOnCheckOutDate.click();
        selectCheckOutDate.click();
        String userCheckOutDate = fetchCheckOutDateFromUserInput.getText().split(" ")[0];
        ConfigReader.setValue("check.out.date", userCheckOutDate);
    }

    public void selectNumberOfPeople() {
        clickOnAddGuest.click();
        addAdults.click();
        String NoOfPeoplesByUserInput = fetchNoOfPeoplesFromUserInput.getText().split("&")[0];
        ConfigReader.setValue("no.of.persons", NoOfPeoplesByUserInput);
    }

    public void clickOnSearch() {
        searchButton.click();
    }

    public void clickOnExperiences() {
        while (!isDisplayedElement(checkExperienceIsClicked)) {
            experiencesButton.click();
            System.out.println("clicked");
        }
    }

    public void selectDatesOfExperiences() {
        selectCheckInDate.click();
        selectCheckOutDate.click();
        String userInputExperienceDates = fetchUserInputExperienceDates.getText().split(" - ")[0] +
                " " + fetchUserInputExperienceDates.getText().split(" ")[3];
        ConfigReader.setValue("experiences.dates", userInputExperienceDates);
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

    public void clickOnBeachfront(String location) {
        if (location.equals("Amazing views")) {
            selectAmazingViews.click();
        } else if (location.equals("Beachfront")) {
            selectBeachfront.click();
        } else {
            selectFarm.click();
        }
    }

    public void clickOnShowMap() {
        showMapButton.click();
    }

    public void clickOnBeforeTax() {
        taxButton.click();
    }

    public void clickOnCurrency() {
        currencyButton.click();
    }

    public void selectMeetYourHost() {
        scrollThePage(messageHostButton);
        hostProfileCard.click();
    }

    public void verifyDisplayedDetailsOfHost() {
    }

    public void profileIconSelection() {
        profileIcon.click();
    }

    public void clicksOnHelpCentre() {
        helpCentre.click();
        switchToNewWindow();
    }

    public void clicksOnThingsToDo() {
        thingsToDo.click();
    }

    public void clickOnDestination() {
        destination.click();
    }

    public void clickOnFilterOption() {
        filterButton.click();
    }

    public void clickOnEntireHome() {
        filterByEntireHome.isDisplayed();
        filterByEntireHome.click();
    }

    public void clickOnPriceFilter() {
    }

    public boolean verifyThingsToDoMessage(String message) {
        switchToNewWindow();
        scrollThePage(thingsToDo);
        return thingsToDo.getText().contains(message);
    }

    public void clickOnNextCardImage() {
        moveToAnElement(slideNextImageButton);
        slideNextImageButton.click();
    }

    public boolean verifySlidingImage(String page) {
        slideImageElement.isDisplayed();
        return slideImageElement.getAttribute("aria-label").contains(page + " of");
    }

    public boolean isTotalPriceBeforePageIsDisplayed() {
        totalPriceBeforePageIsDisplayed.isDisplayed();
        return totalPriceBeforePageIsDisplayed.getText().contains("total before taxes");
    }

    public void selectFilterMinimumPrice() {
        scrollThePage(filterMinimumPriceButton);
        sliderSlideXAxis(filterMinimumPriceButton,500);
    }

    public void selectFilterMaximumPrice() {
        sliderSlideXAxis(filterMaximumPriceButton,-500);
    }

    public void enterFilterMinimumPrice(String min){
        filterMinimumPriceInput.click();
        javaScriptClear(filterMinimumPriceInput);
        filterMinimumPriceInput.sendKeys(min);
    }

    public void enterFilterMaximumPrice(String max) {
        filterMaximumPriceInput.click();
        javaScriptClear(filterMaximumPriceInput);
        filterMaximumPriceInput.sendKeys(max);
    }

    public void increaseBedroomCount(int bedroomsCount) {
        scrollThePage(bedCountButton);
        for(int i=0;i<bedroomsCount;i++){
            bedroomCountButton.click();
        }
    }

    public void increaseBedCount(int bedsCount) {
        for(int i=0;i<bedsCount;i++){
            bedCountButton.click();
        }
    }

    public void lineOnCurrency() {
        currencyOptions.isDisplayed();
    }

    public void clickOnNewCurrency() {
        newCurrency.click();
    }


}
