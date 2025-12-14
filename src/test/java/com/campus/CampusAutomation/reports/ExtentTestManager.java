package com.campus.CampusAutomation.reports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;

public class ExtentTestManager {

    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentTest startTest(String testName) {
        ExtentTest extentTest = ExtentManager.getInstance().createTest(testName);
        test.set(extentTest);
        return getTest();
    }

    public static ExtentTest getTest() {
        return test.get();
    }

    public static void logTestStatus(ITestResult result) {

        if (result.getStatus() == ITestResult.SUCCESS) {
            getTest().log(Status.PASS, "Test Passed");
        } 
        else if (result.getStatus() == ITestResult.FAILURE) {
            getTest().log(Status.FAIL, result.getThrowable());
        } 
        else if (result.getStatus() == ITestResult.SKIP) {
            getTest().log(Status.SKIP, "Test Skipped");
        }
    }
}