package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrmPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    // Locators
    private By CompletedDashboard = By.xpath("//*[contains(text(), 'Complet')]");
    private By GrabWidget = By.xpath("//*[contains(text(),' Next ')]");
    private By DragContainer = By.xpath("//*[contains(text(),'Complete ')]");
    private By SkipDragContainer = By.cssSelector("[class='skip-button link-button']");
    private By AddWidget = By.cssSelector("#clickHereToAddWidgetCrm");
    private By sourceLocator = By.cssSelector("[title='Measure how efficiently your team completes assigned tasks and goals.']");
    private By targetLocator = By.xpath("//*[contains(text(), 'Drag a widget here.')]");

    // Constructor
    public CrmPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.actions = new Actions(driver);
    }

    

    // Page Actions
    public void clickCompletedDashboard() {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CompletedDashboard));
            element.click();
            System.out.println("✅ Clicked on Completed Dashboard");
        } catch (Exception e) {
            System.out.println("❌ Completed Dashboard not found: " + e.getMessage());
        }
    }

    public void clickGrabWidget() {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(GrabWidget));
            element.click();
            System.out.println("✅ Clicked on Grab Widget");
        } catch (Exception e) {
            System.out.println("❌ Grab Widget not clickable: " + e.getMessage());
        }
    }

    public void clickSkipDragContainer() {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SkipDragContainer));
            element.click();
            System.out.println("✅ Clicked on Skip Drag Container");
        } catch (Exception e) {
            System.out.println("❌ Skip button not found: " + e.getMessage());
        }
    }

    public void clickAddWidget() {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(AddWidget));
            element.click();
            System.out.println("✅ Clicked on Add Widget");
        } catch (Exception e) {
            System.out.println("❌ Add Widget button not found: " + e.getMessage());
        }
    }

   
    

    
}
