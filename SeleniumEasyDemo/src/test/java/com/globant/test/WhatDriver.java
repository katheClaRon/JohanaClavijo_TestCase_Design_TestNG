package com.globant.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class WhatDriver {

    private WebDriver driver;

    public WhatDriver (String browser){

        switch (browser){
            case "remoteFirefox":
                try {
                    driver = new RemoteWebDriver(new URL("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html"), DesiredCapabilities.firefox());
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
            case "firefox":
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.gecko.driver", "./src/test/resources/chromedriver/geckodriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                break;
        }
    }
    public WebDriver getDriver(){
        return this.driver;
    }
}
