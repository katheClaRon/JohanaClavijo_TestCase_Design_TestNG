package com.globant.accounttests;

import com.globant.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccount {

    private WebDriver driver;

    @BeforeClass
    public void openBrowser(){

        driver = BrowserUtils.getChromeWebDriver();
        BrowserUtils.openBrowser(driver,"https://www.espn.com/?src=com&adblock=true");

    }

    @Test
    public void newUser(){

        driver.findElement(By.id("#global-user-trigger")).click();
        driver.findElement(By.cssSelector("#global-viewport > div.global-user > div ul.account-management > li:nth-child(7) > a")).click();
        driver.findElement(By.cssSelector("#did-ui-view > section > div > .btn")).click();

        driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("Lastname");
        driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("test1@gmail.com");
        driver.findElement(By.className("btn > btn-primary > ng-scope > ng-isolate-scope")).sendKeys("Pass123*");

       // driver.findElement(submitbuttonlocator).click();

        System.out.println("The new account was not created");

       // AssertJUnit.assertTrue("Test",driver.findElement(resultnamelocator));

    }

    @AfterMethod
    public void close (){

        driver.close();
    }

}
