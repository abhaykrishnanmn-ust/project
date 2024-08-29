package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HostPage extends BasePage{

    @FindBy(xpath = "//button[@aria-label='Host preview']")
    WebElement hostPreview;

    public void clicksOnHostPreview() {
        hostPreview.click();
    }
}
