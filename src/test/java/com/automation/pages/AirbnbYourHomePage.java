package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirbnbYourHomePage extends BasePage{

    @FindBy(xpath = "//h1[@id='host-estimate-header']")
    WebElement airbnbYourHomeMessage;

    @FindBy(xpath = "//input[@type='range']")
    WebElement slider;

    @FindBy(xpath = "//div[@data-testid='odometer-text']/following-sibling::span")
    WebElement priceOnYourHome;

    public boolean verifyAirbnbYourHomeMessage(String message) {
        ConfigReader.setValue("price.on.your.home",priceOnYourHome.getText());
        return airbnbYourHomeMessage.getText().contains(message);
    }

    public void slideSlider() {
        sliderSlideXAxis(slider,50);
    }

    public boolean verifyPriceChange() {
        return priceOnYourHome.getText().contains(ConfigReader.getValue("price.on.your.home"));
    }
}
