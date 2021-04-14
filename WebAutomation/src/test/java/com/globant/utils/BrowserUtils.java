package com.globant.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {

    public static WebDriver getChromeWebDriver() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        return webdriver;
    }

    public static void openBrowser(WebDriver webDriver, String url) {

        webDriver.get(url);
    }
}
