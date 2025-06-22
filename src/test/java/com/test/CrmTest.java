package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.CrmPage;

public class CrmTest extends LoginTest {
    CrmPage crmPage;

    @BeforeClass
    public void setupCrm() {
        crmPage = new CrmPage(driver); // driver inherited from LoginTest
        test = extent.createTest("CRM Test");
    }

    @Test(priority = 1)
    public void completeDashboardPopup() throws InterruptedException {
        test.info("Completing dashboard popup...");
        crmPage.clickCompletedDashboard();
        crmPage.clickAddWidget();
        crmPage.clickGrabWidget();
        crmPage.clickSkipDragContainer();
        Thread.sleep(3000); // Allow UI to settle
        test.pass("Dashboard popup completed successfully");
    }
    @Test(priority = 2)
    public void add_widgt() throws InterruptedException {
        test.info("Completing dashboard popup...");
        crmPage.clickAddWidget();
        Thread.sleep(5000);
        WebElement source = driver.findElement(By.xpath("//div[normalize-space()='Team Activity']//img"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(source)
               .moveByOffset(200, 200) // Adjust X & Y values
               .release()
               .build()
               .perform();
   
        Thread.sleep(2000);
        WebElement source1 = driver.findElement(By.xpath("//div[normalize-space()='Upcoming Tasks']//img"));
        Actions actions1 = new Actions(driver);
        actions1.clickAndHold(source1)
               .moveByOffset(150, 300) // Adjust X & Y values
               .release()
               .build()
               .perform();
        test.pass("Dashboard popup completed successfully");
    }
    
}
