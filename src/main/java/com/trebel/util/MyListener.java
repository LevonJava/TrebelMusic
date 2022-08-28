package com.trebel.util;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    private static final Logger logger = Logger.getLogger(MyListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info(result.getName() + " test case started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("The name of the testcase passed is: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("The name of the testcase failed is: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("The name of the testcase Skipped is: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logger.error("Failure of test cases and its details are: " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        logger.error("Timeout failer: " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        logger.info("Test suite is started");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Test suite was finished");
    }
}
