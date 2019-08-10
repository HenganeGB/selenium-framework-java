
package com.selenium_framework.common;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory
{
	private static WebDriver dr;
	
	public static void createWebDriverInstance()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//WebDriver dr = new ChromeDriver();  remove this, dr will be in blue colour- global declartion & local dr in gray colour
		 
		
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver()
	{
		return dr;
	}
}