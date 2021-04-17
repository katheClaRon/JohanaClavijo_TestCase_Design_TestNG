package com.globant.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtils {

    public static WebDriver getChromeWebDriver() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void openBrowser(WebDriver driver, String url) {

        driver.get(url);
    }

}
