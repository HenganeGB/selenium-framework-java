package com.selenium_framework.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium_framework.common.WebDriverFactory;

public class LinkTestPage {

	@FindBy(xpath="//img[@alt='LinkedIn OrangeHRM group']") private WebElement linkdin;
	@FindBy(xpath="//img[@alt='OrangeHRM on Facebook']") private WebElement facebook;
	@FindBy(xpath="//img[@alt='OrangeHRM on twitter']") private WebElement twitter;
	@FindBy(xpath="//img[@alt='OrangeHRM on youtube']") private WebElement youtube;
	
	public LinkTestPage()
	{
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}
	
	public void Windowhandles()
	{
		String ohandle= WebDriverFactory.getDriver().getWindowHandle();
		Set<String> allHandles= WebDriverFactory.getDriver().getWindowHandles();
		
		Iterator<String> itr= allHandles.iterator();
		
		while(itr.hasNext())
		{
			String currentHandle = itr.next();
			if(!ohandle.contentEquals(currentHandle))
			{
			WebDriverFactory.getDriver().switchTo().window(currentHandle);//
				
			System.out.println(WebDriverFactory.getDriver().getTitle());//
			WebDriverFactory.getDriver().close();
			
			} 
			WebDriverFactory.getDriver().switchTo().window((ohandle));//
			System.out.println(WebDriverFactory.getDriver().getTitle());//

		}
	}
}
	

	

