package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class InactiveUser {

    private WebDriver webdriver;

    @BeforeClass
    public void openBrowser(){

        webdriver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(webdriver,"https://www.espn.com/?src=com&adblock=true");
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

        webdriver.findElement(profileelementlocator).click();
        webdriver.findElement(espnprofilelocator).click();
        webdriver.findElement(cancelbtlocator).click();
        webdriver.findElement(confirmdetlocator).click();

        AssertJUnit.assertTrue(webdriver.findElement(resultnamelocator),isemplty);

    }

    @AfterMethod
    public void close (){

        webdriver.close();
    }

}
