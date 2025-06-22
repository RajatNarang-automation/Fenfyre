package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.ContactAttributesPage;
import com.pages.CreatePipelinePage;

public class ContactAttributestTest extends LoginTest
{
	CreatePipelinePage createPipelinePageObj;
	ContactAttributesPage contactAttributesPageObj;
   

    @BeforeClass
    public void setupEmailTemplates()
    {
        createPipelinePageObj = new CreatePipelinePage(driver);
        contactAttributesPageObj = new ContactAttributesPage(driver);
        test = extent.createTest("Contact Attributes Test");
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
        test.info("Navigating to Contract Attributes...");
        contactAttributesPageObj.Move_to_Contact_Attributes();
        contactAttributesPageObj.Open_Contact_Attributes();
        test.pass("Contract Attributes opened successfully");
    }

    @Test(priority = 4)
    public void Save_Contract_Attributes() {
        test.info("Saving Contrcat Attributes...");
        contactAttributesPageObj.Enter_Contract_Attributes("Test Updates");
        contactAttributesPageObj.selectAttributeType("Date");
        contactAttributesPageObj.selectChooseAttributeorder("1");
        contactAttributesPageObj.Save_Attributes();
        test.pass("Contract Attributes saved successfully");
    }
    @Test(priority = 5)
    public void Edit_Contract_Attributes() throws InterruptedException {
        test.info("We're edit in the first row for Contract Attribute");
        contactAttributesPageObj.Edit_Contract_Attributes();
        Thread.sleep(3000);
        contactAttributesPageObj.Update_details_Contract_Attributes("Test Updates Change");
        contactAttributesPageObj.Update_attributes_btn();
        test.pass("Contracat Attributes are sucesfully edit");
    }
    @Test(priority=6)
    public void delete_email_template()
    {
    	test.info("delete contract template");
    	contactAttributesPageObj.Delete_contract_template();
    	contactAttributesPageObj.Delete_contcat_from_alert();
    	test.pass("Delete contract Template sucessfully");
    }

}
