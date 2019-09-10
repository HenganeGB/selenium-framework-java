package com.selenium_framework.common;

import java.io.IOException;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.selenium_framework.common.reporting.ExtentReportTestFactory;

public class ApiTestListener implements IInvokedMethodListener {

	
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		if(method.isTestMethod()) //one liner if statement
		{
			ExtentReportTestFactory.createNewTest(method);

		}
	}
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		//if
		{
			if(!testResult.isSuccess())
			{
					
				
						ExtentReportTestFactory.getTest().fail(testResult.getThrowable());
				
			}else {
				ExtentReportTestFactory.getTest().pass(testResult.getName()+" PASS successfully");
			}
			ExtentReportTestFactory.flushReport();
		}
	}
}
