package com.automation.pages;

import com.automation.utils.ConfigReader;
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

    @FindBy(xpath = "//button[@aria-label='Host preview']/ancestor::div[@data-testid=\"card-container\"]")
    WebElement openCardWithPreview;

    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement closeTranslate;

    @FindBy(xpath = "//div[@data-section-id=\"HOST_OVERVIEW_DEFAULT\"]/div/div/div/div[2]/div")
    WebElement hostDetailsOnCardPage;

    @FindBy(xpath = "//a[@aria-label=\"Next\"]")
    WebElement nextPageButton;


    public void clicksOnHostPreview() {
        if(!isPresents(hostPreview)){
            scrollThePage(nextPageButton);
            javaScriptExecutorClick(nextPageButton);
//            nextPageButton.click();
        }
        hostPreview.click();
    }

    public void getsHostDetails() {
        hostDetails.click();
        switchToNewWindow();
        ConfigReader.setValue("host.name.on.preview",javaExecutorGetText(hostName));
        driver.close();
        switchToCurrentWindow();
    }

    public void closeHostDetails() {
        switchToNewWindow();
        closeHostDetailsButton.click();
    }

    public void openCardWithPreview() {
        scrollThePage(openCardWithPreview);
        openCardWithPreview.click();
        switchToNewWindow();
        if(isPresents(closeTranslate)){
            javaScriptExecutorClick(closeTranslate);
        }
    }

    public boolean verifyHostNameOnPreview() {
        scrollThePage(hostDetailsOnCardPage);
        System.out.println("==="+javaExecutorGetText(hostDetailsOnCardPage));
        System.out.println("==="+ConfigReader.getValue("host.name.on.preview"));
        return javaExecutorGetText(hostDetailsOnCardPage).contains(ConfigReader.getValue("host.name.on.preview"));
    }
}
