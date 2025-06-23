package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.AutomationWorkflowPage;


public class AutomationWorkflowTest extends LoginTest
{
	AutomationWorkflowPage AutomationWorkflowPageobj;
	@BeforeClass
    public void setupEmailTemplates()
    {
		AutomationWorkflowPageobj = new AutomationWorkflowPage(driver);
        test = extent.createTest("Our workflow test");
    }

    @Test(priority = 1)
    public void Open_Automation_Choose_workflow()
    {
        test.info("Opening Automation workflow panel...");
        AutomationWorkflowPageobj.Move_to_Automation();
        AutomationWorkflowPageobj.Choose_Automation();
        test.pass("Automation  workflow opened successfully");
    }
    @Test(priority = 2)
    public void Add_workflow_for_pipeline() throws InterruptedException
    {
        test.info("We are Open workflow module popup.");
        AutomationWorkflowPageobj.Open_Workflow_For_Add_Rule();
        AutomationWorkflowPageobj.Choose_Automation();
        test.pass("workflow popup sucesfully opend");  
    }
    @Test(priority = 3)
    public void enter_workflowname()
    {
    	test.info("We are now add workflow stage.");
    	AutomationWorkflowPageobj.Choose_workflow_for_pipline_and_contact_attributes("Pipeline");
        AutomationWorkflowPageobj.Enter_Workflow_name("New worklow add");
        AutomationWorkflowPageobj.Enter_workflow_description("Hi we are add some desc");
        AutomationWorkflowPageobj.Save_Our_Workflow();
        test.pass("workflow are now sucesfully stage first"); 
    }
}
