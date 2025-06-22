package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePipelinePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By MovetoAdmin = By.xpath("//*[contains(text(),'Admin')]");
    private By AlertCreatepipline = By.xpath("//*[contains(text(), 'Next')]");
    private By Alertuserpermission = By.xpath("//*[contains(text(), 'Next')]");
    private By ContactAttributes = By.xpath("//*[contains(text(), 'Next')]");
    private By emailtemplates = By.xpath("//*[contains(text(), 'Next')]");
    private By settings = By.xpath("//*[contains(text(), 'Next')]");
    private By subscriptionplan = By.xpath("//*[contains(text(), 'Next')]");
    private By branding = By.xpath("//*[contains(text(), 'Next')]");
    private By deleteaccount = By.xpath("//*[contains(text(), ' Complete ')]");

    private By Create_pipeline = By.id("pipelineTour");
    private By Add_pipeline = By.id("addPipeline");
    private By Pipeline_name = By.cssSelector("[formcontrolname='pipeline_name']");
    private By Pipeline_Description = By.cssSelector("[formcontrolname='description']");
    private By addNewStage = By.id("addNewStage");
    private By EnterStagename = By.cssSelector("[placeholder='Enter Stage name']");
    private By AddStagebtn = By.xpath("(//button[@type='submit'])[1]");
    private By Addpiplinebtn = By.xpath("(//button[@type='submit'])[2]");

    public CreatePipelinePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void AlertCreatepiplinehandle() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(AlertCreatepipline)).click();
            System.out.println("✅ Alert on Create pipeline");
        } catch (Exception e) {
            System.out.println("❌ Alert pipeline not found: " + e.getMessage());
        }
    }

    public void handleAlertuserpermission() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(Alertuserpermission)).click();
            System.out.println("✅ Clicked on Alert User permission");
        } catch (Exception e) {
            System.out.println("❌ Alert user permission not found: " + e.getMessage());
        }
    }

    public void handleAlertContactAttributes() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(ContactAttributes)).click();
            System.out.println("✅ Clicked on Contact Attributes");
        } catch (Exception e) {
            System.out.println("❌ Alert Contact Attributes not found: " + e.getMessage());
        }
    }

    public void handleAlertemailtemplates() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(emailtemplates)).click();
            System.out.println("✅ Clicked on Email templates Alert");
        } catch (Exception e) {
            System.out.println("❌ Alert Email Templates not found: " + e.getMessage());
        }
    }

    public void handlesettingsAlert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(settings)).click();
            System.out.println("✅ Clicked on handle settings Alert");
        } catch (Exception e) {
            System.out.println("❌ Settings Alert not found: " + e.getMessage());
        }
    }

    public void handle_susbscriptionplan() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(subscriptionplan)).click();
            System.out.println("✅ Clicked on subscription plan Alert");
        } catch (Exception e) {
            System.out.println("❌ Subscription Plan not found: " + e.getMessage());
        }
    }

    public void handlebrand_Alert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(branding)).click();
            System.out.println("✅ Clicked on Branding Alert");
        } catch (Exception e) {
            System.out.println("❌ Branding Alert not found: " + e.getMessage());
        }
    }

    public void Handle_delete_Alert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(deleteaccount)).click();
            System.out.println("✅ Clicked on Handle Delete Alert");
        } catch (Exception e) {
            System.out.println("❌ Delete Alert not found: " + e.getMessage());
        }
    }

    public void Move_to_Admin_panel() {
        wait.until(ExpectedConditions.presenceOfElementLocated(MovetoAdmin)).click();
    }

    public void Redirect_to_Create_pipline() {
        wait.until(ExpectedConditions.presenceOfElementLocated(Create_pipeline)).click();
    }

    public void Choose_Add_pipeline() {
        wait.until(ExpectedConditions.presenceOfElementLocated(Add_pipeline)).click();
    }

    public void Enter_piplinename(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Pipeline_name)).sendKeys(name);
    }

    public void Pipleine_description(String desc) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Pipeline_Description)).sendKeys(desc);
    }

    public void Add_new_Stage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(addNewStage)).click();
    }

    public void Enter_stage_name(String stagename) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EnterStagename)).sendKeys(stagename);
    }

    public void Add_stage_btn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(AddStagebtn)).click();
    }

    public void Add_pipleine_btn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(Addpiplinebtn)).click();
    }
}
