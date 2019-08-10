package com.selenium_framework.common;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class FrameworkListeners implements IInvokedMethodListener {

	
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		if(method.isTestMethod()) //one liner if statement
		WebDriverFactory.createWebDriverInstance();
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		if(method.isTestMethod())
		WebDriverFactory.getDriver().quit(); 
		
	}
	

}
