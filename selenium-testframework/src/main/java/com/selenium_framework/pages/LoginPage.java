package com.selenium_framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.selenium_framework.common.WebDriverFactory;

public class LoginPage 
{
	
	
	@FindBy(id="txtUsername")    //dr.findelement("......");
	private WebElement userName;  // variable declarition
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(xpath=("//input[@id='btnLogin']"))
	private WebElement btnSubmit;

	
	private WebDriverWait wait; //global variable declartion  of explicit wait
	
	public LoginPage()  // Constructor
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);//Initialization of elements
		//navigateToLoginPage();
		
		wait=new WebDriverWait(WebDriverFactory.getDriver(),30);
	}
	

//public LinkTestPage navigateToLoginPage()
public LoginPage navigateToLoginPage()
{
	
	WebDriverFactory.getDriver().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
	//return new LinkTestPage();
	return this;
	
	 
	}

public HomePage login(String strUserName, String strPassword) //throws InterruptedException
{
	userName.sendKeys(strUserName);
	password.sendKeys(strPassword);
	btnSubmit.click();
	
	
	/*try {
		Thread.sleep(5000);
	} catch (InterruptedException e)------// Exception e-- for all type of exceptions
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  //avoid  */
	
		
	
	return new HomePage().isPageLoaded();
	
	/*HomePage hp= new HomePage(); // or u can write-- return new HomePage();
	return hp;*/
	
}

public LoginPage isPageLoaded()
{
	/*Assert.assertTrue(userName.isDisplayed(), "UserName field not loaded");
	Assert.assertTrue(password.isDisplayed(), "Password field not displayed");
	Assert.assertTrue(btnSubmit.isDisplayed(), "submit button not displayed"); */
	
	wait.until(ExpectedConditions.visibilityOf(userName));// mandatory to use in isdisplayed()  -- this is explicit wait
	wait.until(ExpectedConditions.visibilityOf(password));
	wait.until(ExpectedConditions.visibilityOf(btnSubmit)); 
	return this;
}

}

