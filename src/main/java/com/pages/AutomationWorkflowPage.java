package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationWorkflowPage
{
	private WebDriver driver;
    private WebDriverWait wait;

    private By Automation = By.xpath("//span[normalize-space()='Automation']");
    private By Workflowrules = By.xpath("//span[normalize-space()='Workflow Rules']"); 
    private By CreateNewRule = By.cssSelector("[id='addUser']");
    private By Countryid = By.cssSelector("[id='country_id']");
    private By Enterworkflowname = By.cssSelector("[id='Names']");
    private By description = By.cssSelector("[id='Description']");
    private By saveworkflow = By.cssSelector("[id='save']");
    
    
    public AutomationWorkflowPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    public  void Move_to_Automation()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Automation)).click();
    }
    public  void Choose_Automation()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Workflowrules)).click();
    }
    public  void Open_Workflow_For_Add_Rule()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(CreateNewRule)).click();
    }
    public  void Choose_workflow_for_pipline_and_contact_attributes(String chooseworkflowid)
    {
    	 WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(Countryid));
         Select select = new Select(dropdownElement);
         select.selectByVisibleText(chooseworkflowid);
    }
    public void Enter_Workflow_name(String workflowname)
    {
      wait.until(ExpectedConditions.elementToBeClickable(Enterworkflowname)).sendKeys(workflowname);
    }
    public void Enter_workflow_description(String Workflowdesc)
    {
      wait.until(ExpectedConditions.elementToBeClickable(description)).sendKeys(Workflowdesc);
    }
    public void Save_Our_Workflow()
    {
      wait.until(ExpectedConditions.elementToBeClickable(saveworkflow)).click();
    }
}
