package com.globant.test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

public class Listener implements ITestListener {

    private Logger log = Logger.getLogger(Listener.class);

    @Override
    public void onTestFailure(ITestResult arg0) {
        log.info("The test failed");
    }

}

