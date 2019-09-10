package com.orangehrm.test;

import org.testng.annotations.Test;

import com.selenium_framework.common.AbstractSelenium;
import com.selenium_framework.pages.LoginPage;


public class LoginTest extends AbstractSelenium
{
	
	@Test(groups= {"Critical","Positive"},dataProvider="ExcelData")    //'d' od data provider is in small letters but declaration is in Caps
	public void verifyAdminLoginSuccessful(String strUserName, String strPwd)
	{
		
		
		LoginPage lp = new LoginPage();
		//lp.navigateToLoginPage()         -------its is navigating to LinkTest class
			lp.navigateToLoginPage()
			.login(strUserName, strPwd);
				//.verifyAdminLink();     //this called Object Chain
		
				
		}


	@Test(groups= {"High","Negative"})    //'d' od data provider is in small letters but declaration is in Caps
	public void verifyAdminLoginHigh()
	{
		
		
		LoginPage lp = new LoginPage();
		//lp.navigateToLoginPage()         -------its is navigating to LinkTest class
			lp.navigateToLoginPage()
			.login("admin", "admin");
				//.verifyAdminLink();     //this called Object Chain
		
				
		}
	
	
	@Test(groups= {"High"})    //'d' od data provider is in small letters but declaration is in Caps
	public void verifyAdminLoginHigh1()
	{
		
		
		LoginPage lp = new LoginPage();
		//lp.navigateToLoginPage()         -------its is navigating to LinkTest class
			lp.navigateToLoginPage()
			.login("gajanan", "gajanan");
				//.verifyAdminLink();     //this called Object Chain
		
				
		}
	
	/*@Test(dataProvider="ExcelData")   // duplicate method
	public void verifyAdminLoginSuccessful123(String strUserName, String strPwd)
	{
		
		
		LoginPage lp = new LoginPage();
		//lp.navigateToLoginPage()         -------its is navigating to LinkTest class
			lp.navigateToLoginPage()
			.login(strUserName, strPwd);
				//.verifyAdminLink();     //this called Object Chain
		
				
		}*/

}
