
package com.selenium_framework.common;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverFactory
{
	//private static WebDriver dr;
	
	private static  ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	public static void createWebDriverInstance(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		//WebDriver dr = new ChromeDriver();  remove this, dr will be in blue colour- global declartion & local dr in gray colour
		 
		
		//dr= new ChromeDriver();
		
		
		//Grid
//		DesiredCapabilities capablities = new DesiredCapabilities();
//		capablities.setBrowserName("Firefox");
//		capablities.setVersion("68");
//		
//		WebDriver localDriver;
//		try {
//			localDriver= new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"),capablities);
//
//			dr.set(localDriver);
//			dr.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			
//		} catch (MalformedURLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "4.2.2");
		capabilities.setCapability("deviceName", "Emulator");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.chrome");
		capabilities.setCapability("appActivity", "com.android.chrome");
		
		try {
			dr.set(new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities));
			dr.get().manage().window().maximize();
			dr.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver()
	{
		return dr.get();
	}
}