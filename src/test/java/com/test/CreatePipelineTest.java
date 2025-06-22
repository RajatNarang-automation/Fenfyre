package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.CreatePipelinePage;
import com.pages.CrmPage;

public class CreatePipelineTest extends LoginTest
{

	CreatePipelinePage CreatePipelinePageobj;
	CrmPage crmPage; 
	
    @BeforeClass
    public void setupPipleine()
    {
		CreatePipelinePageobj = new CreatePipelinePage(driver); 
		test = extent.createTest("Pipeline Test");
    }

    @Test(priority = 1)
    public void Admin_panel_open_sucessfully()
    {
    	test.info("Opening Admin panel...");
    	CreatePipelinePageobj.Move_to_Admin_panel();
    	test.pass("Admin panel opened successfully");
    }
    @Test(priority = 2)
    public void Alert_handle()
    {
    
    	test.info("We're handling Alert");
    	CreatePipelinePageobj.AlertCreatepiplinehandle();
    	CreatePipelinePageobj.handleAlertuserpermission();
    	CreatePipelinePageobj.handleAlertContactAttributes();
    	CreatePipelinePageobj.handleAlertemailtemplates();
    	CreatePipelinePageobj.handlesettingsAlert();
    	CreatePipelinePageobj.handle_susbscriptionplan();
    	CreatePipelinePageobj.handlebrand_Alert();
    	CreatePipelinePageobj.Handle_delete_Alert();
    	test.pass("All  Alert Hnadle successfully");

    }
    @Test(priority = 3)
    public void Create_pipeline()
    {
    	test.info("We're redirect Alto Create pipeline section");
    	CreatePipelinePageobj.Redirect_to_Create_pipline(); 
    	test.pass("yes now we fill detials for add pipline");
    }
    @Test(priority = 4)
    public void Add_new_pipline()
    
    {
    	test.info("we aree added new pipeline");
    	CreatePipelinePageobj.Choose_Add_pipeline();
    	CreatePipelinePageobj.Enter_piplinename("Rajat pipline");
    	CreatePipelinePageobj.Pipleine_description("Hi we Are Add new pipeline");
    	CreatePipelinePageobj.Add_new_Stage();
        CreatePipelinePageobj.Enter_stage_name("SOLVE THE AUTOMATION PROBLEMS");
        CreatePipelinePageobj.Add_stage_btn();
        CreatePipelinePageobj.Add_pipleine_btn();
        test.pass("Now we are added sucesfully pipleine");
    }
}
