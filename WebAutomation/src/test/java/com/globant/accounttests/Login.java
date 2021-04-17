package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {

    private WebDriver driver;

    @BeforeClass
    public void openBrowser(){

        driver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(driver,"https://www.espn.com/?src=com&adblock=true");
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

        driver.findElement(profileelementlocator).click();
        driver.findElement(loginbuttonlocator).click();

        if(driver.findElement(loginbuttonlocator).isDisplayed()){
            driver.findElement(usernamelocator).sendKeys("test1@gmail.com");
            driver.findElement(inpupasslocator).sendKeys("Pass123*");

            driver.findElement(loginconfirmedlocator).click();
        }
        else
            System.out.println("The new account was not accesed");

        driver.findElement(codeloginlocator).sendKeys("1111");
        driver.findElement(continuebutton).click();

       // AssertJUnit.assertTrue("Test",driver.findElement(resultnamelocator));

    }

    @AfterMethod
    public void close (){

        driver.close();
    }

}
