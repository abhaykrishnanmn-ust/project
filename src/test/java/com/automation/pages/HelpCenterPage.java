package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpCenterPage extends BasePage{
    @FindBy(xpath = "//div[@class='hoakkap dir dir-ltr']")
    WebElement helpCenterText;
    public boolean verifyDisplayedMessage(String message) {
        return helpCenterText.getText().contains(message);
    }
}
