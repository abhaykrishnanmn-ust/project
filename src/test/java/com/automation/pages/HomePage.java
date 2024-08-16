package com.automation.pages;

import com.automation.utils.ConfigReader;

public class HomePage extends BasePage {

    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }
}
