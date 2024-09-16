package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement searchBtn;

    public void clickOnSearchButton() {
//        switchToNewWindow();
        searchBtn.click();
        switchToNewWindow();
    }
}
