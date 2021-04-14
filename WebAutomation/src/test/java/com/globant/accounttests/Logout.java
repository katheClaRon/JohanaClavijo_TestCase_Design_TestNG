package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class Logout {

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
    public void closeSession(){

        By profileelementlocator = By.id("#global-user-trigger");
        By logoutbuttonlocator = By.cssSelector("#global-viewport div:nth-child(4) ul.account-management  li:nth-child(9) a");
        By resultnamelocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li.display-user span");

        webdriver.findElement(profileelementlocator).click();
        webdriver.findElement(logoutbuttonlocator).click();

        AssertJUnit.assertTrue(webdriver.findElement(resultnamelocator),isemplty);

    }

    @AfterMethod
    public void close (){

        webdriver.close();
    }

}
