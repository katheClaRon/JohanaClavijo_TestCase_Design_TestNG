package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class CreateAccount {

    private WebDriver webdriver;

    @BeforeClass
    public void openBrowser(){

        webdriver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(webdriver,"https://www.espn.com/?src=com&adblock=true");
    }

    @Test
    public void newUser(){

        By profileelementlocator = By.id("#global-user-trigger");
        By loginbuttonlocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li:nth-child(7) a");
        By singupbuttonlocator = By.cssSelector("#did-ui-view section div .btn");

        By firstnamelocator = By.cssSelector("input[name=\"firstName\"]");
        By lastnamelocator = By.cssSelector("input[name=\"lastName\"]");
        By emaillocator = By.cssSelector("input[name=\"email\"]");
        By newpasslocator = By.cssSelector("input[name=\"newPassword\"]");

        By submitbuttonlocator = By.className("btn btn-primary ng-scope ng-isolate-scope");

        By resultnamelocator = By.cssSelector("#global-viewport div.global-user div ul.account-management li.display-user span");

        //WebElement profileelementlocator = webdriver.findElement(By.id("#global-user-trigger"));
        //WebElement loginbuttonlocator = webdriver.findElement(By.cssSelector("global-user ul.account-management li:nth-child(7) a"));

        webdriver.findElement(profileelementlocator).click();
        webdriver.findElement(loginbuttonlocator).click();
        webdriver.findElement(singupbuttonlocator).click();

        if(webdriver.findElement(singupbuttonlocator).isDisplayed()){
            webdriver.findElement(firstnamelocator).sendKeys("Test");
            webdriver.findElement(lastnamelocator).sendKeys("Lastname");
            webdriver.findElement(emaillocator).sendKeys("test1@gmail.com");
            webdriver.findElement(newpasslocator).sendKeys("Pass123*");

            webdriver.findElement(submitbuttonlocator).click();
        }
        else
            System.out.println("The new account was not created");

        AssertJUnit.assertTrue("Test",webdriver.findElement(resultnamelocator));

    }

    @AfterMethod
    public void close (){

        webdriver.close();
    }

}
