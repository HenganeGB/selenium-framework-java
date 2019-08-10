package com.selenium_framework.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

  @Listeners(FrameworkListeners.class)
public class AbstractSelenium    
{
	/*@BeforeTest
	public void callCreateWebdriverInstanceMethod() //use to call above method
	{
		WebDriverFactory.createWebDriverInstance();  //this method helps to create object 
	}*/
	
	@DataProvider(name="LoginData")
	public String[][] getLoginData() 
	{
		String myData[][]= {{"admin","admin"},{"Amit","amit"},{"Swanil","Swapnil"}};
		
		return myData;
	}
	
	/*@DataProvider(name="ExcelData")
	public String[][] getExcelData() throws Exception
	{
		return ExcelReader.getExcelTableArray("C:\\Users\\Gajanan\\eclipse-workspace\\selenium-testframework\\src\\test\\java\\com\\orangehrm\\test\\LoginTest.xlsx", "verifyAdminLoginSuccessful");
	}*/


	@DataProvider(name="ExcelData")
	public String[][] getExcelData(Method m) throws Exception
	{
		System.out.println("************sheet name"+m.getName());
		
		return ExcelReader.getExcelTableArray(getFilePath(m.getDeclaringClass()),m.getName()); // dynamic excel sheets 
	}

/*public static void main(String args[]) throws IOException
{
	File file= new File("C:\\Users\\Gajanan\\Desktop\\LoginData.txt");
	FileReader fr= new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	
	String line="";
	while((line=br.readLine())!=null)
	{
		
		System.out.println(line);	
}}*/
	
@DataProvider(name="CVSData")
public String[][] getCSVData()
{
	File file= new File("C:\\Users\\Gajanan\\Desktop\\LoginData.txt");
	String[] [] myData= new String[3][2];
	
	try
	{	
	FileReader fr= new FileReader(file);
	BufferedReader br= new BufferedReader(fr);
	
	String line="";
	
	int i=0;
	while((line=br.readLine())!=null)
	{
		myData[i]=line.split(","); //splite data into array format
		i=i+1;
	}
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
	return myData;
	}

private static String getFilePath(Class<?> cls) //  from mail it converts class name into excelfile 
{
	System.out.println("******** getFilePath for class "+cls.getName());
	String strSourceClassName = cls.getResource(cls.getSimpleName()+".class").getPath();
	System.out.println("*************** resource path is "+strSourceClassName);
	try {
		strSourceClassName = URLDecoder.decode(strSourceClassName,"UTF-8");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	StringBuffer strFilePath = new StringBuffer();
	strFilePath.append(strSourceClassName.subSequence(1, strSourceClassName.indexOf("com")));
	strFilePath.append(cls.getName().replace(".","/"));
	strFilePath.append(".xlsx");
	System.out.println("Class path is - "+strFilePath);
	//return strFilePath.toString();
	return strSourceClassName.replace(".class", ".xlsx");
}
}