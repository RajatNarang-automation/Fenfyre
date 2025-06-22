package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class LoginPage
{
	    private WebDriver driver;
	    private WebDriverWait wait;
	    private By EmailInput = By.cssSelector("[id='email']");
	    private By PasswordInput = By.cssSelector("[id='pwd']");
	    private By Loginbtn = By.cssSelector("[id='login']");
	    private By AcceptCookieBtn = By.xpath("//*[contains(text(),'Accept Cookie')]");


	    public LoginPage(WebDriver driver)
	    {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	    }
	    public void clickAcceptCookieIfPresent()
	    {
	        try 
	        {
	            WebElement cookieBtn = wait.until(ExpectedConditions.presenceOfElementLocated(AcceptCookieBtn));
	            if (cookieBtn.isDisplayed()) 
	            {
	                cookieBtn.click();
	                System.out.println("Clicked on Accept Cookie button");
	            }
	        } catch (TimeoutException e)
	        {
	        	
	            System.out.println("Accept Cookie button not found. Proceeding...");
	        } 
	        catch (Exception e)
	        {
	            System.out.println("Error while handling Accept Cookie: " + e.getMessage());
	        }
	    }
	    public void clear_EmailField()
	    {
	        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(EmailInput));
	        emailElement.clear();
	    }

	    public void clear_PasswordField()
	    {
	        WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(PasswordInput));
	        passwordElement.clear();
	    }
	    public void Enter_Email(String email)
	    {
	        WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(EmailInput));
	        emailElement.sendKeys(email);
	    }
	    public void Enter_password(String password)
	    {
	        WebElement passElement = wait.until(ExpectedConditions.presenceOfElementLocated(PasswordInput));
	        passElement.sendKeys(password);
	    }

	    public void click_on_login_btn()
	    {
	        wait.until(ExpectedConditions.elementToBeClickable(Loginbtn)).click();
	    }
}
