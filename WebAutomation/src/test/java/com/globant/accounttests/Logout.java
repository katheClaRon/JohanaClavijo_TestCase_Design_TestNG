package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logout {

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
    public void closeSession(){

        By profileelementlocator = By.id("#global-user-trigger");
        By logoutbuttonlocator = By.cssSelector("#global-viewport div:nth-child(4) ul.account-management  li:nth-child(9) a");
        By resultnamelocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li.display-user span");

        driver.findElement(profileelementlocator).click();
        driver.findElement(logoutbuttonlocator).click();

        //AssertJUnit.assertTrue(driver.findElement(resultnamelocator),isemplty);

    }

    @AfterMethod
    public void close (){

        driver.close();
    }

}
