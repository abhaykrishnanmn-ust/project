package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookingPage extends BasePage {
    @FindBy(xpath = "//div[@itemprop='itemListElement']")
    WebElement clickOnCard;

    @FindBy(xpath = "//div[@data-testid='change-dates-checkIn']")
    WebElement fetchCheckInDate;

    @FindBy(xpath = "//div[@data-testid='change-dates-checkOut']")
    WebElement fetchCheckOutDate;

    @FindBy(xpath = "//div[text()='Guests']/following-sibling::div//span")
    WebElement fetchNoOfPersons;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    @FindBy(xpath = "//div[@role='presentation']")
    WebElement cardClick;

    @FindBy(xpath = "//span[@class='_1k4xcdh']")
    WebElement price;

    @FindBy(xpath = "//div[text()='Total before taxes']/parent::span/following-sibling::span//span[@class='_j1kt73']")
    WebElement totalPrice;

    @FindBy(xpath = "//div[@data-testid='book-it-default']/following-sibling::div[2]//div[text() and not(contains(text(),'Total'))]/ancestor::div/span/following-sibling::span")
    List<WebElement> priceList;

    @FindBy(xpath = "//div[contains(text(),'Total before taxes')]/parent::span/following-sibling::span//span[text()]")
    WebElement totalPriceInCardPage;

    @FindBy(xpath = "//button[text()='Clear dates']")
    WebElement clearDates;

    public boolean isSearchedPageIsDisplayed() {
        return true;
    }

    public void clickOnFirstCard() {
        javaScriptExecutorClick(clickOnCard);
        switchToNewWindow();
        if(isPresents(closeTranslate)){
            javaScriptExecutorClick(closeTranslate);
        }
    }

    public boolean verifyCheckInDate() {
        isPresent(fetchCheckInDate);
        String checkInDataFetched = fetchCheckInDate.getText();
        System.out.println(checkInDataFetched + "=====" + ConfigReader.getValue("check.in.date"));
        return checkInDataFetched.contains(ConfigReader.getValue("check.in.date"));
    }

    public boolean verifyCheckOutDate() {
        String checkOutDataFetched = fetchCheckOutDate.getText();
        System.out.println(checkOutDataFetched + "=====" + ConfigReader.getValue("check.out.date"));
        return checkOutDataFetched.contains(ConfigReader.getValue("check.out.date"));
    }

    public boolean verifyNoOfPersons() {
        isPresent(fetchCheckInDate);
        String noOfPersonsFetched = fetchNoOfPersons.getText();
        return noOfPersonsFetched.contains(ConfigReader.getValue("no.of.persons"));
    }

    public void clickOnAnyCard() {
        isPresent(cardClick);
        cardClick.click();
        switchToNewWindow();
    }

    public void verifyPrice() {
        String displayPrice= price.getText();
        String displayTotalPrice= totalPrice.getText();
        System.out.println(displayPrice+"==="+displayTotalPrice);
    }

    public Boolean verifyTotalPrice() {
        scrollTillElement(clearDates);
        int totalPrice=0;
        for (WebElement price:priceList){
            totalPrice=totalPrice+Integer.parseInt(price.getText().substring(1).replace(",",""));
        }
        return totalPrice==Integer.parseInt(totalPriceInCardPage.getText().substring(1).replace(",",""));
    }
}
