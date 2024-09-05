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

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    @FindBy(xpath = "//button[@data-testid='map/markers/BaseCircleMarker']")
    WebElement clickOnMapIcon;

    @FindBy(xpath = "//div[@data-testid=\"card-container\"]//div[@data-testid='listing-card-title']")
    WebElement mapCardDetailsOnExperiences;

    @FindBy(xpath = "//button[@aria-label=\"Art and culture\"]")
    WebElement artAndCultureOnExperienceCard;

    @FindBy(xpath = "//div[@data-testid='card-container']")
    WebElement clickOnCard;

    @FindBy(xpath = "//h1")
    WebElement mapCardPageContent;

    @FindBy(xpath = "//h2")
    WebElement showMapCardPageContent;

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
        switchToNewWindow();
        closeTranslate.click();
    }

    public boolean verifyMapCardDetails() {
        System.out.println("=====>"+showMapCardPageContent.getText());
        return showMapCardPageContent.getText().contains(ConfigReader.getValue("map.card.details"));
    }

    public void clickOnMapOption() {
        switchToNewWindow();
        artAndCultureOnExperienceCard.click();
        clickOnMapIcon.isDisplayed();
        clickOnMapIcon.click();
        ConfigReader.setValue("map.card.details.on.experiences",mapCardDetailsOnExperiences.getText());
        clickOnCard.click();
    }

    public boolean verifyMapContent() {
        return mapCardPageContent.getText().contains(ConfigReader.getValue("map.card.details.on.experiences"));
    }
}
