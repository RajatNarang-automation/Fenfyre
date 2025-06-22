package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.AutomationWorkflowPage;
import com.pages.ContactAttributesPage;
import com.pages.CreatePipelinePage;

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
    public void Add_workflow_for_pipeline()
    {
        test.info("We are added workflow.");
        AutomationWorkflowPageobj.Open_Workflow_For_Add_Rule();
        AutomationWorkflowPageobj.Choose_Automation();
        AutomationWorkflowPageobj.Choose_workflow_for_pipline_and_contact_attributes("Pipeline");
        AutomationWorkflowPageobj.Enter_Workflow_name("New worklow add");
        AutomationWorkflowPageobj.Enter_workflow_description("Hi we are add some desc");
        AutomationWorkflowPageobj.Save_Our_Workflow();
        test.pass("workflow added sucesfully");
    }
}
