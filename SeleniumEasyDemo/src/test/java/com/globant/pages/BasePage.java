package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(driver, this);
        this.driver = pDriver;
    }

    public WebDriverWait getWait() {
        wait = new WebDriverWait(driver, 5);
        return wait;
    }

    public void dispose() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
