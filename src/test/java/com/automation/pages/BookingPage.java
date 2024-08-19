package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Set;

public class BookingPage extends BasePage {
    @FindBy(xpath = "//div[@role='presentation']")
    WebElement clickOnCard;

    @FindBy(xpath = "//div[@data-testid='change-dates-checkIn']")
    WebElement fetchCheckInDate;

    @FindBy(xpath = "//div[@data-testid='change-dates-checkOut']")
    WebElement fetchCheckOutDate;

    @FindBy(xpath = "//div[text()='Guests']/following-sibling::div//span")
    WebElement fetchNoOfPersons;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    public boolean isSearchedPageIsDisplayed() {
        return true;
    }

    public void clickOnFirstCard() {
        clickOnCard.click();
        String window = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!windows.equals(window)) {
                driver.switchTo().window(windows);
            }
        }
    }

    public boolean verifyCheckInDate() {
        closeTranslate.click();
        isPresent(fetchCheckInDate);
        String checkInDataFetched = fetchCheckInDate.getText();
        System.out.println(checkInDataFetched + "=====" + ConfigReader.getValue("check.in.date"));
        return checkInDataFetched.contains(ConfigReader.getValue("check.in.date"));
    }

    public boolean verifyCheckOutDate() {
        isPresent(fetchCheckInDate);
        String checkOutDataFetched = fetchCheckOutDate.getText();
        System.out.println(checkOutDataFetched + "=====" + ConfigReader.getValue("check.out.date"));
        return checkOutDataFetched.contains(ConfigReader.getValue("check.out.date"));
    }

    public boolean verifyNoOfPersons() {
        isPresent(fetchCheckInDate);
        String noOfPersonsFetched = fetchNoOfPersons.getText();
        return noOfPersonsFetched.contains(ConfigReader.getValue("no.of.persons"));
    }
}
