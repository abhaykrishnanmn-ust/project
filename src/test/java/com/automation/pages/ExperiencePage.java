package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class ExperiencePage extends BasePage{
    @FindBy(xpath = "//div[@data-testid='listing-card-title']/parent::div/a")
    WebElement firstCardOnExperiencePage;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    @FindBy(xpath = "//div[@class='_fznvsv']")
    WebElement fetchExperienceDates;

    @FindBy(xpath = "//div[text()='Guests']/following-sibling::div")
    WebElement fetchNoOfPersons;

    public boolean isExperiencePageDisplayed() {
       return firstCardOnExperiencePage.isDisplayed();
    }

    public void selectFirstCardOnExperiencePage() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", firstCardOnExperiencePage);
        String window = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windows : windowHandles) {
            if (!windows.equals(window)) {
                driver.switchTo().window(windows);
            }
        }
    }

    public void verifyDetailsOnExperience() {

    }

    public boolean verifyDatesOnExperience() {
        closeTranslate.click();
        isPresent(fetchExperienceDates);
        String experienceDatesFetched = fetchExperienceDates.getText();
        String a=ConfigReader.getValue("experiences.dates").replace("Sep","-");
        System.out.println(experienceDatesFetched+"====="+ConfigReader.getValue("experiences.dates"));
        return experienceDatesFetched.contains(a);
//        Sep 18 - 19=====18 Sep 19
//        return experienceDatesFetched.contains("Sep 18 - 19");
    }

    public boolean verifyNoOfPeople() {
        isPresent(fetchExperienceDates);
        String noOfPersonsFetched = fetchNoOfPersons.getText();
        return noOfPersonsFetched.contains(ConfigReader.getValue("no.of.persons"));
    }
}
