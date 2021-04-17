package com.globant.test;

import com.globant.pages.EasyDemo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTests {

    WhatDriver whatDriver;

    private EasyDemo Home;

    @BeforeSuite(alwaysRun = true)
    @Parameters ({"browser","url"})
    public void beforeSuite(@Optional("chrome") String browser, @Optional("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html") String url) {
        whatDriver = new WhatDriver(browser);
        WebDriver driver = whatDriver.getDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Home = new EasyDemo(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        Home.dispose();
    }

    public EasyDemo getEasyDemo(){
        return Home;
    }
}
