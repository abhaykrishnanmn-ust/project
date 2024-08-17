package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends BasePage{
    @FindBy(xpath = "//div[@role='presentation']")
    WebElement clickOnCard;

    @FindBy(xpath = "//div[text()='Check-in']/following-sibling::div")
    WebElement fetchCheckInDate;

    @FindBy(xpath = "//div[text()='Check-out']/following-sibling::div")
    WebElement fetchCheckOutDate;

    @FindBy(xpath = "//div[text()='Guests']/following-sibling::div//span")
    WebElement fetchNoOfPersons;

    public boolean isSearchedPageIsDisplayed() {
        return true;
    }

    public void clickOnFirstCard() {
        clickOnCard.click();
    }

    public boolean verifyCheckInDate() {
        String checkInDataFetched=fetchCheckInDate.getText();
        return checkInDataFetched.contains(ConfigReader.getValue("check.in.date"));
    }

    public boolean verifyCheckOutDate() {
        String checkOutDataFetched=fetchCheckInDate.getText();
        return checkOutDataFetched.contains(ConfigReader.getValue("check.out.date"));
    }

    public boolean verifyNoOfPersons() {
        String noOfPersonsFetched=fetchCheckInDate.getText();
        return noOfPersonsFetched.contains(ConfigReader.getValue("no.of.persons"));
    }
}
