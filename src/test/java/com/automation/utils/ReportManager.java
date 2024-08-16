package com.automation.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ReportManager {

    static Scenario scenario;

    public static void initScenario(Scenario scenario) {
        ReportManager.scenario = scenario;
    }

    public static void attachScreenShot() {
        scenario.attach(takeScreenShot(), "image/png", "Failed test snap");
    }

    public static byte[] takeScreenShot() {
        TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }
}
