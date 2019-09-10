 package com.selenium_framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.selenium_framework.common.WebDriverFactory;

public class HomePage {
	
	@FindBy (id="welcome") 	private WebElement welComeText;
	
	@FindBy(id = "menu_admin_viewAdminModule")	private WebElement adminTab;
	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
		}

	public HomePage verifyAdminLink()
	{
		System.out.println(welComeText.isDisplayed()); // isDisplayed returns true/false here it return true
		Assert.assertEquals(welComeText.isDisplayed(), true);
		Assert.assertEquals(welComeText.getText(), "Welcome Admin");

		return this;
	}
	
	public AdminPage naviagateToAdminPage()
	{ 
		adminTab.click();
		
		return new AdminPage();
	}
	
	public HomePage isPageLoaded()
	{
		Assert.assertTrue(welComeText.isDisplayed(), "Welcome text not loaded");
		Assert.assertTrue(adminTab.isDisplayed(), "admintab not displayed");
		return this;
	}

}

