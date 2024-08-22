package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirbnbYourHomePage extends BasePage{

    @FindBy(xpath = "//h1[@id='host-estimate-header']")
    WebElement airbnbYourHomeMessage;

    @FindBy(xpath = "//input[@type='range']")
    WebElement slider;

    public boolean verifyAirbnbYourHomeMessage(String message) {
        return airbnbYourHomeMessage.getText().contains(message);
    }

    public void slideSlider() {
        actions.clickAndHold(slider)
                .moveByOffset(50, 0)
                .release()
                .perform();
    }
}
