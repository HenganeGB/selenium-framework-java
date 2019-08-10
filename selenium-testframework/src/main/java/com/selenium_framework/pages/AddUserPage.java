package com.selenium_framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.common.WebDriverFactory;

public class AddUserPage {
	
	
	@FindBy (id="systemUser_employeeName_empName") private WebElement empName;
	
	@FindBy (id="systemUser_userName") private WebElement userName;
	
	@FindBy (id="systemUser_password") private WebElement password;
	
	@FindBy (id="systemUser_confirmPassword") private WebElement confirmPassword;
	
	@FindBy (id="btnSave") private WebElement btnSave;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public AdminPage addUser(String strempName,String struserName,String strPassword,String strconfirmPassword)
	{
		empName.sendKeys(strempName);
		userName.sendKeys(struserName);
		password.sendKeys(strPassword);
		confirmPassword.sendKeys(strconfirmPassword);
		btnSave.click();
		
		AdminPage ap= new AdminPage();
		return ap;
	}
	
	
}
