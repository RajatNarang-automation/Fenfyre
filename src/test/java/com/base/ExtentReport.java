package com.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    protected static ExtentReports extent;
    protected static ExtentTest test;

    @BeforeClass
    public void setup() {
        // Create an instance of ExtentSparkReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        
        // Create an instance of ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @AfterClass
    public void tearDown() {
        // Write the report to disk
        extent.flush();
    }
}
