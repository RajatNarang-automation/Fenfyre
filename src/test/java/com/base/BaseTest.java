package com.base;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilis.EmailUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BaseTest {
//    protected static ExtentReports extent;
//    protected static ExtentSparkReporter spark;
//    protected ExtentTest test;
//    private static ExtentTest classLevelTest;
//    private static String className = "";
//    @BeforeSuite
//    public void setupExtent() {
//        spark = new ExtentSparkReporter("test-output/ExtentReport.html");
//        extent = new ExtentReports();
//        extent.attachReporter(spark);
//        extent.setSystemInfo("Environment", "QA");
//        extent.setSystemInfo("Tester", "Rajat");
//        new File(System.getProperty("user.dir") + "/test-output/screenshots/").mkdirs();
//    }
//    @BeforeClass
//    public void setupClassReport() {
//        className = this.getClass().getSimpleName();
//        classLevelTest = extent.createTest(className);
//    }
//    @BeforeMethod
//    public void setupTest(Method method) {
//        test = classLevelTest.createNode(method.getName());
//        test.info(":large_yellow_circle: Starting Test: " + method.getName());
//    }
//    @AfterMethod
//    public void tearDown(ITestResult result) {
//        WebDriver driver = null;
//        try {
//            Object currentClass = result.getInstance();
//            Class<?> superClass = currentClass.getClass().getSuperclass();
//            java.lang.reflect.Field field = superClass.getDeclaredField("driver");
//            field.setAccessible(true);
//            driver = (WebDriver) field.get(currentClass);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        String screenshotPath = (driver != null) ? takeScreenshot(driver, result.getName()) : null;
//        String relativePath = (screenshotPath != null)
//                ? "screenshots/" + new File(screenshotPath).getName()
//                : null;
//        String imageTag = (relativePath != null)
//                ? "<br><img src='" + relativePath + "' height='300' width='400'/><br>"
//                : "";
//        switch (result.getStatus()) {
//            case ITestResult.FAILURE:
//                test.fail(":x: Test Failed: " + result.getName() + imageTag);
//                test.fail(result.getThrowable());
//                break;
//            case ITestResult.SUCCESS:
//                test.pass(":white_check_mark: Test Passed: " + result.getName() + imageTag);
//                break;
//            case ITestResult.SKIP:
//                test.skip(":warning: Test Skipped: " + result.getName() + imageTag);
//                break;
//        }
//    }
//    @AfterSuite
//    public void flushReport() {
//        extent.flush();
//        injectCustomScrollAndHeadingFix();
//        EmailUtil.sendExtentReportEmail("test-output/ExtentReport.html", "receiver@example.com");
//    }
//    public String takeScreenshot(WebDriver driver, String testName) {
//        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        String destPath = System.getProperty("user.dir") + "/test-output/screenshots/" + testName + "_" + timestamp + ".png";
//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File dest = new File(destPath);
//        try {
//            FileUtils.copyFile(src, dest);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return destPath;
//    }
//    private void injectCustomScrollAndHeadingFix() {
//        try {
//            File reportFile = new File("test-output/ExtentReport.html");
//            String content = FileUtils.readFileToString(reportFile, "UTF-8");
//            String script = "<style>\n" +
//                    "/* Add scrollbar */\n" +
//                    ".test-content, .card-body, .step-details { max-height: 600px !important; overflow-y: auto !important; padding-right: 10px; }\n" +
//                    "/* Hide durations */\n" +
//                    ".test-duration, .suite > .duration, .test > .duration, .category-heading:contains('Log events'), .category-heading:contains('Log Summary') { display: none !important; }\n" +
//                    "/* Hide left nav Log Summary */\n" +
//                    "li.test > div.name:contains('Log Summary') { display: none !important; }\n" +
//                    "/* Hide Log Events donut card */\n" +
//                    ".category-container:has(.category-heading:contains('Log events')) { display: none !important; }\n" +
//                    "</style>\n" +
//                    "<script>\n" +
//                    "document.addEventListener('DOMContentLoaded', function() {\n" +
//                    "  document.querySelectorAll('.category-heading').forEach(el => {\n" +
//                    "    if (el.innerText.trim() === 'Steps') el.innerText = 'Test Case Steps';\n" +
//                    "    if (el.innerText.trim() === 'Tests') el.innerText = 'Tests - " + className + "';\n" +
//                    "  });\n" +
//                    "});\n" +
//                    "</script>";
//            content = content.replace("</head>", script + "\n</head>");
//            FileUtils.writeStringToFile(reportFile, content, "UTF-8");
//            System.out.println(":white_check_mark: Scroll, heading, and chart fixes applied.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}