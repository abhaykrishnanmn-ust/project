package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//button[@data-testid='map/markers/BaseCircleMarker']")
    WebElement clickOnMapIcon;

    @FindBy(xpath = "//div[@data-testid='card-container']")
    WebElement clickOnCard;

    public void verifyMapPageIsDisplayed() {
        priceTagButton.isDisplayed();
    }

    public void clickOnPriceTagDisplayed() {
        priceTagButton.click();
    }

    public void verifyDetailsCardIsDisplayed() {
        fetchNameFromCard.isDisplayed();
        System.out.println(javaExecutorGetText(fetchNameFromCard));
        ConfigReader.setValue("map.card.details",javaExecutorGetText(fetchNameFromCard));
        switchToNewWindow();
    }

    public void clickDetailsCard() {
        clickOnMapCard.click();
    }

    public void verifyMapCardDetails() {
    }

    public void clickOnMapOption() {
        switchToNewWindow();
        clickOnMapIcon.click();
        clickOnCard.click();
    }
}
