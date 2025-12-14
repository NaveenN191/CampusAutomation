package com.campus.CampusAutomation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.campus.CampusAutomation.reports.ExtentManager;
import com.campus.CampusAutomation.reports.ExtentTestManager;

public class TestListeners implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.getInstance().flush();
        System.out.println("Test Suite Finished");
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTestManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTestManager.getTest().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTestManager.getTest().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTestManager.getTest().skip("Test Skipped");
    }
}