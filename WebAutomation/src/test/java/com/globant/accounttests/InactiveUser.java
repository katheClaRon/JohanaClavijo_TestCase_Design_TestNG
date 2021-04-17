package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InactiveUser {

    private WebDriver driver;

    @BeforeClass
    public void openBrowser(){

        driver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(driver,"https://www.espn.com/?src=com&adblock=true");
    }

    @BeforeMethod
    public void logIn(){

    }

    @Test
    public void deleteAccount(){

        By profileelementlocator = By.id("#global-user-trigger");
        By espnprofilelocator = By.cssSelector("#global-viewport div:nth-child(4) div.global-user-container ul.account-management li:nth-child(5) a");
        By cancelbtlocator = By.id("cancel-account");
        By confirmdetlocator = By.cssSelector("#did-ui-view div.btn-group button.btn-primary");

        By resultnamelocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li.display-user span");

        driver.findElement(profileelementlocator).click();
        driver.findElement(espnprofilelocator).click();
        driver.findElement(cancelbtlocator).click();
        driver.findElement(confirmdetlocator).click();

        //AssertJUnit.assertTrue(driver.findElement(resultnamelocator),isemplty);

    }

    @AfterMethod
    public void close (){

        driver.close();
    }

}
