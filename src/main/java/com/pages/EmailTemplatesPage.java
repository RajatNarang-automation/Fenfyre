package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailTemplatesPage
{
	private WebDriver driver;
    private WebDriverWait wait;

    private By MovetoEmailTemplates = By.xpath("//span[normalize-space()='Email Templates']");
    private By Emailtemplate = By.cssSelector("[id='add-user']"); 
    private By Emailtitle = By.cssSelector("[placeholder='Enter template title']");
    private By Email_Subject = By.cssSelector("[id='Names']");
    private By Emaildescription = By.cssSelector("[class='angular-editor-textarea']");
    private By savebtn = By.cssSelector("[id='save']");
    private By Editemailtemplates = By.xpath("(//a[@id='editEmailTemplate'])[1]");
    private By UpdateEmailtitle = By.cssSelector("[placeholder='Enter template title']");
    private By Update_templates = By.xpath("//button[@id='save']");
    private By delete_email_template = By.xpath("(//a[@id='deleteEmailTemplate'])[1]");
    private By yesdeletealert = By.cssSelector("[id='save']");
    
    
    public EmailTemplatesPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    public void Move_to_Email_Templates()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(MovetoEmailTemplates)).click();
    }

    public void Select_Email_Form() {
        wait.until(ExpectedConditions.presenceOfElementLocated(Emailtemplate)).click();
    }
    public void Enter_email_title(String email_title) {
        wait.until(ExpectedConditions.presenceOfElementLocated(Emailtitle)).sendKeys(email_title);
    }
    public void Enter_email_subj(String emailsubj)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Email_Subject)).sendKeys(emailsubj);
    }
    public void Enter_email_Message(String Emailmessage)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Emaildescription)).sendKeys(Emailmessage);
    }
    public void Submit_Email_template()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(savebtn)).click();
    }
    public void Edit_email_templates()
    {
    	 wait.until(ExpectedConditions.presenceOfElementLocated(Editemailtemplates)).click();
    }
    public void Update_Email_Template(String Updatetitle)
    {
    	wait.until(ExpectedConditions.presenceOfElementLocated(UpdateEmailtitle)).sendKeys(Updatetitle);
    }
    public void Update_template_btn()
    {
    	 wait.until(ExpectedConditions.presenceOfElementLocated(Update_templates)).click();
    }
    public void delete_email_template()
    {
    	wait.until(ExpectedConditions.presenceOfElementLocated(delete_email_template)).click();
    }
    public void delete_yes_btn_from_btn()
    {
    	wait.until(ExpectedConditions.presenceOfElementLocated(yesdeletealert)).click();
    }
    }

