package com.globant.test;

import com.globant.pages.EasyDemo;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidateTest extends BaseTests{

    WebDriver driver;

    @Test (description="Test dropdown")
    @Parameters({"Value","result"})
    public void dropDown (@Optional("Wednesday") String dayselected, @Optional("Day selected :- ") String result){
        EasyDemo home = getEasyDemo();
        home.selectDay();
        home.getResult();
        Assert.assertEquals(getEasyDemo().selectDay(), "Wednesday");
        Assert.assertEquals(home.getResult(),"Day selected :- Wednesday");

    }

    @Test (description = "Test multiselect one element")
    @Parameters({"multiselectedone","Firstselected"})
    public void multiSelectOne (@Optional("multiselectedone") String multistates, @Optional("First selected option is : ") String Firstselected){
        EasyDemo home = getEasyDemo();
        home.selectMultiStates();
        Assert.assertEquals(getEasyDemo().selectMultiStates(), "New York");

    }

    @Test (description = "Test multiselect all elements")
    @Parameters ({"multiselectall","Allselected"})
    public void multiSelectAll (@Optional("multiselectall") String severalstates, @Optional("Options selected are :") String Allselected){
        EasyDemo home = getEasyDemo();
        home.webElement();
        Assert.assertEquals(getEasyDemo().webElement(),"Options selected are : New York,Texas");
    }
}
