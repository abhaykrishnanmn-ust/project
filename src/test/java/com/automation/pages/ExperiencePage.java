package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class ExperiencePage extends BasePage {
    @FindBy(xpath = "//div[@data-testid='listing-card-title']/parent::div/a")
    WebElement firstCardOnExperiencePage;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    @FindBy(xpath = "//div[@class='_fznvsv']")
    WebElement fetchExperienceDates;

    @FindBy(xpath = "//div[text()='Guests']/following-sibling::div")
    WebElement fetchNoOfPersons;

    @FindBy(xpath = "//span[@class='f1w1jwjs atm_cs_1p3l1rs dir dir-ltr']")
    WebElement similarSearchContent;

    @FindBy(xpath = "//div[@data-testid='experience-card']/a")
    WebElement cardOnSimilarExperiences;

    @FindBy(className = "_1athds8")
    WebElement clickOnDateSection;

    @FindBy(xpath = "//h3[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'21')]")
    WebElement selectFirstNewDate;

    @FindBy(xpath = "//h3[text()='September 2024']/ancestor::div/table//tr/td[contains(@aria-label,'22')]")
    WebElement selectSecondNewDate;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveNewDatesButton;

    public boolean isExperiencePageDisplayed() {
        return firstCardOnExperiencePage.isDisplayed();
    }

    public void selectFirstCardOnExperiencePage() {
        javaScriptExecutorClick(firstCardOnExperiencePage);
        switchToNewWindow();
        closeTranslate.click();
    }

    public void verifyDetailsOnExperience() {

    }

    public boolean verifyDatesOnExperience() {
        closeTranslate.click();
        isPresent(fetchExperienceDates);
        String experienceDatesFetched = fetchExperienceDates.getText();
        String a = ConfigReader.getValue("experiences.dates").replace("Sep", "-");
        System.out.println(experienceDatesFetched + "=====" + ConfigReader.getValue("experiences.dates"));
        return experienceDatesFetched.contains(a);
//        Sep 18 - 19=====18 Sep 19
//        return experienceDatesFetched.contains("Sep 18 - 19");
    }

    public boolean verifyNoOfPeople() {
        isPresent(fetchExperienceDates);
        String noOfPersonsFetched = fetchNoOfPersons.getText();
        return noOfPersonsFetched.contains(ConfigReader.getValue("no.of.persons"));
    }

    public void scrollTillSimilarSearches() {
        scrollThePage(similarSearchContent);
    }

    public void clickOnCardOfSimilarSearches() {
        cardOnSimilarExperiences.click();
    }

    public void verifySimilarCardDetails() {
    }

    public void clickOnExperiencePageDate() {
        clickOnDateSection.click();
    }

    public void selectNewDates() {
        selectFirstNewDate.click();
        selectSecondNewDate.click();
    }

    public void clickOnSaveNewDates() {
//        saveNewDatesButton.click();
        javaScriptExecutorClick(saveNewDatesButton);
    }

    public void verifyNewDates() {
    }
}
