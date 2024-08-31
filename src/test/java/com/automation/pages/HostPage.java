package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HostPage extends BasePage{

    @FindBy(xpath = "//button[@aria-label='Host preview']")
    WebElement hostPreview;

    @FindBy(xpath = "//a[@aria-label='Go to Host full profile']")
    WebElement hostDetails;

    @FindBy(xpath = "//h2[@elementtiming='LCP-target']")
    WebElement hostName;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeHostDetailsButton;

    @FindBy(xpath = "//img[@fetchpriority='high']")
    WebElement openCardWithPreview;


    public void clicksOnHostPreview() {
        hostPreview.click();
    }

    public void getsHostDetails() {
        hostDetails.click();
        switchToNewWindow();
        javaExecutorGetText(hostName);

    }

    public void closeHostDetails() {
        switchToNewWindow();
        closeHostDetailsButton.click();
    }

    public void openCardWithPreview() {
        openCardWithPreview.click();

    }
}
