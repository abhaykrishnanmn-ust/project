package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
    public boolean isTextPresent(WebElement element) {
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(element,"")));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isPresent(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isPresents(WebElement element) {
        try {
            resetImplicitWait(0);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            resetImplicitWait(60);
        }
    }
    public boolean isDisplayedElement(WebElement element){
        try {
            resetImplicitWait(0);
            element.isDisplayed();
            return true;
        }
        catch (Exception e){
            return false;
        }
        finally {
        resetImplicitWait(60);
    }
    }

    public void resetImplicitWait(long sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}