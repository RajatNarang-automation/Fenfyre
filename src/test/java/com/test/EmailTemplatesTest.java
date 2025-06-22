package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.CreatePipelinePage;
import com.pages.EmailTemplatesPage;

public class EmailTemplatesTest extends LoginTest {
    CreatePipelinePage createPipelinePageObj;
    EmailTemplatesPage emailPageObj;

    @BeforeClass
    public void setupEmailTemplates()
    {
        createPipelinePageObj = new CreatePipelinePage(driver);
        emailPageObj = new EmailTemplatesPage(driver);
        test = extent.createTest("Email Templates Test");
    }

    @Test(priority = 1)
    public void adminPanelOpenSuccessfully()
    {
        test.info("Opening Admin panel...");
        createPipelinePageObj.Move_to_Admin_panel();
        test.pass("Admin panel opened successfully");
    }
    @Test(priority = 2)
    public void Alert_handle()
    {
        test.info("We're handling Alert");
    	createPipelinePageObj.AlertCreatepiplinehandle();
    	createPipelinePageObj.handleAlertuserpermission();
    	createPipelinePageObj.handleAlertContactAttributes();
    	createPipelinePageObj.handleAlertemailtemplates();
    	createPipelinePageObj.handlesettingsAlert();
    	createPipelinePageObj.handle_susbscriptionplan();
    	createPipelinePageObj.handlebrand_Alert();
    	createPipelinePageObj.Handle_delete_Alert();
    	test.pass("All  Alert Hnadle successfully");

    }

    @Test(priority = 3)
    public void openEmailTemplate() {
        test.info("Navigating to Email Templates...");
        emailPageObj.Move_to_Email_Templates();
        emailPageObj.Select_Email_Form();
        test.pass("Email Template opened successfully");
    }

    @Test(priority = 4)
    public void saveEmailTemplates() {
        test.info("Saving Email Template...");
        emailPageObj.Enter_email_title("Fresh email Templates");
        emailPageObj.Enter_email_subj("Welcome to Test Company!");
        emailPageObj.Enter_email_Message("Welcome to Test Company! We're excited to have you on board");
        emailPageObj.Submit_Email_template();
        test.pass("Email Template saved successfully");
    }
    @Test(priority = 5)
    public void Edit_Email_Template() throws InterruptedException {
        test.info("We're edit in the first row for email temaplate change the title");
        emailPageObj.Edit_email_templates();
        Thread.sleep(3000);
        emailPageObj.Update_Email_Template("Change Fresh email Templates");
        emailPageObj.Update_template_btn();
        test.pass("Email Title are sucesfully edit");
    }
    @Test(priority=6)
    public void delete_email_template()
    {
    	test.info("delete email template");
    	emailPageObj.delete_email_template();
    	emailPageObj.delete_yes_btn_from_btn();
    	test.pass("Delete email Template sucessfully");
    }
}
