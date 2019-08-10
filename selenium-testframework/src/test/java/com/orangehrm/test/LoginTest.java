package com.orangehrm.test;

import org.testng.annotations.Test;

import com.selenium_framework.common.AbstractSelenium;
import com.selenium_framework.pages.LoginPage;


public class LoginTest extends AbstractSelenium
{
	
	@Test(dataProvider="ExcelData")    //'d' od data provider is in small letters but declaration is in Caps
	public void verifyAdminLoginSuccessful(String strUserName, String strPwd)
	{
		
		
		LoginPage lp = new LoginPage();
		//lp.navigateToLoginPage()         -------its is navigating to LinkTest class
			lp.navigateToLoginPage()
			.login(strUserName, strPwd);
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
