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

    @FindBy(xpath = "//button[@data-testid=\"stepper-adults-increase-button\"]")
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

    @FindBy(xpath = "//div[@data-testid='simple-header-profile-menu']//a[5]")
    WebElement helpCentre;

    @FindBy(xpath = "//button[@id='tab--seo-link-section-tabbed-dense-grid--7']")
    WebElement thingsToDo;

    @FindBy(xpath = "//div[@id='panel--seo-link-section-tabbed-dense-grid--7']//span[contains(text(),'London')]")
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

    @FindBy(xpath = "//span[@class='_1w7bwz8']")
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

    @FindBy(xpath = "//div[text()='SAR – SR']")
    WebElement newCurrency;

    @FindBy(xpath = "//span[text()='Choose a currency']//descendant-or-self::span")
    WebElement currencyVerification;

    @FindBy(xpath = "//button[@id='filter-item-amenities-4']")
    WebElement wifi;

    @FindBy(xpath = "//button[@id='filter-item-ib']")
    WebElement instantBook;

    @FindBy(xpath = "//button[@aria-pressed=\"false\"]//descendant::span//descendant::span")
    WebElement favourite;

    @FindBy(xpath = "//span[text()='Hotel']")
    WebElement hotel;

    @FindBy(xpath = "//h2[text()='Property type']")
    WebElement propertyType;

    @FindBy(xpath = "//h2[text()='Accessibility features']")
    WebElement accessibility;

    @FindBy(xpath = "//input[@name='Step-free guest entrance']")
    WebElement stepFreeGuestOption;

    @FindBy(xpath = "//div[text()='Accessible parking spot']")
    WebElement parking;

    @FindBy(xpath = "//div[text()='Toilet grab bar']")
    WebElement grabBar;

    @FindBy(xpath = "//h2[@id='filter-section-heading-id-FILTER_SECTION_CONTAINER:HOST_LANGUAGE']")
    WebElement hostLanguage;

    @FindBy(xpath = "//div[text()='English']")
    WebElement hostLanguageSelect;

    @FindBy(xpath = "//div[@class='ptiimno atm_7l_1p8m8iw dir dir-ltr']")
    WebElement show;

    @FindBy(xpath = "//div[@class='_3qymq']/preceding-sibling::div//span[2]/button/span[3]")
    WebElement currencyDisplayedOnFooter;

    @FindBy(xpath = "//div[@data-section-id=\"MEET_YOUR_HOST\"]//h3//span")
    WebElement meetYourHostName;

    @FindBy(xpath = "//div[@data-testid=\"user-profile-content\"]//span")
    WebElement aboutMeetYourHost;

    @FindBy(xpath = "//div[@data-section-id='GUEST_FAVORITE_BANNER']")
    WebElement cardPageGuestFavourite;

    @FindBy(xpath = "//li[contains(text(),'bedrooms')]")
    WebElement bedroomCount;

    @FindBy(xpath = "//div[@data-section-id='BOOK_IT_SIDEBAR']//span/div/following-sibling::span")
    WebElement cardPageFilterPrice;

    @FindBy(xpath = "//li[contains(text(),'beds')]")
    WebElement bedCount;

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
        ConfigReader.setValue("meet.your.host.name",meetYourHostName.getText());
        hostProfileCard.click();
    }

    public boolean verifyDisplayedDetailsOfHost() {
        return aboutMeetYourHost.getText().contains(ConfigReader.getValue("meet.your.host.name"));
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
//        switchToNewWindow();
        scrollThePage(thingsToDoMessage);
        return thingsToDoMessage.getText().contains(message);
    }

    public void clickOnNextCardImage() {
        moveToAnElement(slideNextImageButton);
        slideNextImageButton.click();
    }

    public boolean verifySlidingImage(String page) {
        slideImageElement.isDisplayed();
        for (int i=0;i<5;i++){
            if(slideImageElement.getAttribute("aria-label").contains(page + " of")) {
            }
        }
        return slideImageElement.getAttribute("aria-label").contains(page + " of");
    }

    public boolean isTotalPriceBeforePageIsDisplayed() {
        totalPriceBeforePageIsDisplayed.isDisplayed();
        System.out.println(totalPriceBeforePageIsDisplayed.getText());
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
        filterMaximumPriceInput.isDisplayed();
        filterMinimumPriceInput.click();
        javaScriptClear(filterMinimumPriceInput);
        filterMinimumPriceInput.sendKeys(min);
    }

    public void enterFilterMaximumPrice(String max) {
//        filterMaximumPriceInput.isDisplayed();
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
        ConfigReader.setValue("new.currency",newCurrency.getText());
        newCurrency.click();
    }


    public void clickOnWifi() {
        wifi.click();
    }

    public void clickOnInstantBook() {
        instantBook.click();
    }

    public void clickOnFavourite() {
        favourite.click();
    }

    public void clickOnHotel() {
        propertyType.click();
        hotel.click();
    }

    public void clickOnAccessibility() {
        accessibility.click();
//        stepFreeGuestOption.click();
//        grabBar.click();
        parking.click();
    }

    public void clickOnLanguage() {
        hostLanguage.click();
        hostLanguageSelect.click();
    }

    public void clickOnShow() {
        show.click();
    }

    public boolean verifyCurrency() {
        scrollThePage(currencyDisplayedOnFooter);
//        System.out.println(ConfigReader.getValue("new.currency"));
//        System.out.println(currencyDisplayedOnFooter.getText());
        return ConfigReader.getValue("new.currency").contains(currencyDisplayedOnFooter.getText());
    }

    public boolean verifyGuestFavourite() {
        return cardPageGuestFavourite.isDisplayed();
    }

    public boolean verifyFilterBedroomCount() {
        int pageBedroomCount=Integer.parseInt(bedroomCount.getText().substring(3,4));
        int passedBedroomCount=Integer.parseInt(ConfigReader.getValue("filter.bedroom.count"));
        return pageBedroomCount>passedBedroomCount;
    }

    public boolean verifyFilterBedCount() {
        int pageBedCount=Integer.parseInt(bedCount.getText().substring(3,4));
        int passedBedCount=Integer.parseInt(ConfigReader.getValue("filter.bed.count"));
        return pageBedCount>passedBedCount;
    }

    public boolean verifyFilterPrice() {
        return Integer.parseInt(cardPageFilterPrice.getText().split(" ")[0].substring(1).
                replace(",",""))<=
                Integer.parseInt(ConfigReader.getValue("filter.maximum.price"));
    }
}
