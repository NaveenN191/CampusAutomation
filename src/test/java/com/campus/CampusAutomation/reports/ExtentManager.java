package com.campus.CampusAutomation.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setReportName("Campus Automation Test Report");
            spark.config().setDocumentTitle("Automation Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
        }

        return extent;
    }
}