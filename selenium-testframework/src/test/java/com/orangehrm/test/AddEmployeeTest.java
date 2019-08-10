package com.orangehrm.test;

import org.testng.annotations.Test;

import com.selenium_framework.common.AbstractSelenium;
import com.selenium_framework.pages.LoginPage;

public class AddEmployeeTest extends AbstractSelenium
{
	
	@Test
	public void verifyAddEmployeeSuccessful()
	{
		LoginPage lp= new LoginPage();
		
		lp.navigateToLoginPage().
			login("admin", "admin").
				verifyAdminLink().naviagateToAdminPage().navigateToAddUserPage().addUser("John", "Roy", "Roy", "Roy");
				//.verifyAddEmployee("abc", "def", "def", "def", "def");*/
		
	}

}
