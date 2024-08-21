package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends BasePage{
    @FindBy(xpath = " dir dir-ltr")
    WebElement airbnbYourHome;

//    @FindBy(xpath = "//nav[@aria-label='Profile']/div/a")
//    WebElement airbnbYourHome;

    @FindBy(xpath = "//button[@data-testid='map/markers/BasePillMarker']")
    WebElement priceTagButton;

    @FindBy(xpath = "//div[@data-testid='listing-card-title']")
    WebElement fetchNameFromCard;

    @FindBy(xpath = "//div[@data-testid='card-container']")
    WebElement clickOnMapCard;

    public void verifyMapPageIsDisplayed() {
        priceTagButton.isDisplayed();
    }

    public void clickOnPriceTagDisplayed() {
        priceTagButton.click();
    }

    public void verifyDetailsCardIsDisplayed() {
//        isPresent(fetchNameFromCard);
        isTextPresent(fetchNameFromCard);
        fetchNameFromCard.isDisplayed();
        System.out.println(fetchNameFromCard.getText());
        ConfigReader.setValue("map.card.details",fetchNameFromCard.getText());
    }

    public void clickDetailsCard() {
        System.out.println(ConfigReader.getValue("map.card.details"+"====="));
        clickOnMapCard.click();

    }

    public void verifyMapCardDetails() {
    }
}
