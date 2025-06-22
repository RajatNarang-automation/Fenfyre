package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactAttributesPage
{
	private WebDriver driver;
    private WebDriverWait wait;

    private By Contact_Attributes = By.xpath("//span[normalize-space()='Contact Attributes']");
    private By Add_Contact_Attribues_popup = By.cssSelector("[id='add-user']"); 
    private By EnterContactAttributename = By.cssSelector("[placeholder='Enter Attribute name']");
    private By attributeTypeDropdown = By.id("data_type");
    private By ChooseAttributesOrder = By.xpath("//select[@formcontrolname='position']");
    private By Save_Attributes = By.cssSelector("[id='save']");
    private By Editcontactattribu = By.xpath("(//a[@id='editField'])[1]");
    private By UpdateContractname = By.cssSelector("[placeholder='Enter Attribute name']");
    private By Update_ContractAtributes = By.cssSelector("[id='save']");
    private By delete_contrcat_template = By.xpath("(//a[@id='deleteField'])[1]");
    private By yesdeletealert = By.cssSelector("[id='save']");
    
    
    public ContactAttributesPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    public  void Move_to_Contact_Attributes()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Contact_Attributes)).click();
    }

    public void Open_Contact_Attributes()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Add_Contact_Attribues_popup)).click();
    }
    public void Enter_Contract_Attributes(String Contractname)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(EnterContactAttributename)).sendKeys(Contractname);
    }
    public void selectAttributeType(String optionText)
    {
        WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(attributeTypeDropdown));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(optionText);
    }
    public void selectChooseAttributeorder(String AttributesOrder)
    {
        WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(ChooseAttributesOrder));
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(AttributesOrder);
    }
    public void Save_Attributes()
    {
      wait.until(ExpectedConditions.elementToBeClickable(Save_Attributes)).click();
    }
    public void Edit_Contract_Attributes()
    {
      wait.until(ExpectedConditions.elementToBeClickable(Editcontactattribu)).click();
    }
    public void Update_details_Contract_Attributes(String updatecontractname)
    {
      wait.until(ExpectedConditions.elementToBeClickable(UpdateContractname)).sendKeys(updatecontractname);
    }
    public void Update_attributes_btn()
    {
      wait.until(ExpectedConditions.elementToBeClickable(Update_ContractAtributes)).click();
    }
    public void Delete_contract_template()
    {
      wait.until(ExpectedConditions.elementToBeClickable(delete_contrcat_template)).click();
    }
    public void Delete_contcat_from_alert()
    {
      wait.until(ExpectedConditions.elementToBeClickable(yesdeletealert)).click();
    }
}
