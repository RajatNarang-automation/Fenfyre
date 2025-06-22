package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.ExtentReport;
import com.pages.LoginPage;
import com.utilis.ConfigReader;

public class LoginTest extends ExtentReport {
    protected WebDriver driver;
    LoginPage login;

    @BeforeClass
    public void setupLogin() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");  // Open browser in incognito mode
        options.addArguments("--disable-notifications"); // Optional: Disable browser notifications
        driver = new ChromeDriver(options);  // Pass options to driver
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='0.8'");

        login = new LoginPage(driver);
        login.clickAcceptCookieIfPresent();
        login.Enter_Email(ConfigReader.getProperty("email"));
        login.Enter_password(ConfigReader.getProperty("password"));
        login.click_on_login_btn();

        test = extent.createTest("Login Test");
        test.info("Navigated and logged in");
        test.pass("Login successful");
    }
}
