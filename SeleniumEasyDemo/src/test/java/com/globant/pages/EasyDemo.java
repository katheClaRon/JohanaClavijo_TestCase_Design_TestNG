package com.globant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class EasyDemo extends BasePage {

    WebDriver driver;

    public EasyDemo(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String selectDay() {
        Select selectlist = new Select(driver.findElement(By.cssSelector("div.panel-body #select-demo")));
        selectlist.selectByVisibleText("Wednesday");
        return getText(selectlist.getFirstSelectedOption());

    }

    public String getResult() {
        By result = By.cssSelector("p.selected-value");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(result));

        return getText(driver.findElement(result));

    }

    public String selectMultiStates() {
        Select selectsMultiList = new Select(driver.findElement(By.cssSelector(".panel-body #multi-select")));
        selectsMultiList.selectByValue("New York");
        driver.findElement(By.cssSelector(".panel-body #printMe")).click();

        return getText(selectsMultiList.getFirstSelectedOption());
    }

    public List webElement() {

        Select selectseverallist = new Select(driver.findElement(By.cssSelector("div[class=panel-body] [id= multi-select]")));
        selectseverallist.selectByValue("New York");
        selectseverallist.selectByValue("Texas");

        List<WebElement> allStates = selectseverallist.getAllSelectedOptions();
        for (WebElement webElement : allStates) {
            System.out.println("Options selected are : " + webElement.getText());
            webElement.click();
        }
        return allStates;
    }
}

