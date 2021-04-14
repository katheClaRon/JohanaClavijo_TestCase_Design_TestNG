package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class Login {

    private WebDriver webdriver;

    @BeforeClass
    public void openBrowser(){

        webdriver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(webdriver,"https://www.espn.com/?src=com&adblock=true");
    }

    @Test
    public void accessUser(){

        By profileelementlocator = By.id("#global-user-trigger");
        By loginbuttonlocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li:nth-child(7) a");

        By usernamelocator = By.cssSelector(".main .input-wrapper input[type=email]");
        By inpupasslocator = By.cssSelector(".main .input-wrapper input[type=password]");

        By loginconfirmedlocator = By.className("#did-ui-view div section section form section div.btn-group.touch-print-btn-group-wrapper button");
        By codeloginlocator = By.id(".main .input-wrapper input[name=code]");
        By continuebutton = By.id("#did-ui-view div section section form section div.btn-group button");

        By resultnamelocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li.display-user span");

        webdriver.findElement(profileelementlocator).click();
        webdriver.findElement(loginbuttonlocator).click();

        if(webdriver.findElement(loginbuttonlocator).isDisplayed()){
            webdriver.findElement(usernamelocator).sendKeys("test1@gmail.com");
            webdriver.findElement(inpupasslocator).sendKeys("Pass123*");

            webdriver.findElement(loginconfirmedlocator).click();
        }
        else
            System.out.println("The new account was not accesed");

        webdriver.findElement(codeloginlocator).sendKeys("1111");
        webdriver.findElement(continuebutton).click();

        AssertJUnit.assertTrue("Test",webdriver.findElement(resultnamelocator));

    }

    @AfterMethod
    public void close (){

        webdriver.close();
    }

}
