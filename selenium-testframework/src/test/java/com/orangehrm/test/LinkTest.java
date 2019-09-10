/*
 * package com.orangehrm.test;
 * 
 * import org.testng.annotations.Test;
 * 
 * import com.selenium_framework.common.AbstractSelenium; import
 * com.selenium_framework.pages.LoginPage;
 * 
 * public class LinkTest extends AbstractSelenium {
 * 
 * @Test public void verifyLink() {
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Selenium\\chromedriver.exe");
 * 
 * WebDriver dr= new ChromeDriver();
 * dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
 * 
 * dr.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
 * dr.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
 * dr.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
 * dr.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
 * 
 * System.out.println(dr.getTitle());
 * 
 * 
 * String ohandle=dr.getWindowHandle(); Set<String> allHandles=
 * dr.getWindowHandles();
 * 
 * Iterator<String> itr= allHandles.iterator();
 * 
 * while(itr.hasNext()) { String currentHandle = itr.next();
 * if(!ohandle.contentEquals(currentHandle)) {
 * dr.switchTo().window(currentHandle);
 * 
 * System.out.println(dr.getTitle()); dr.close();
 * 
 * } dr.switchTo().window((ohandle)); System.out.println(dr.getTitle());
 * //dr.quit(); }
 * 
 * 
 * }
 * 
 * @Test public void VerifyLinkTest() { LoginPage lp= new LoginPage();
 * lp.navigateToLoginPage();//.Windowhandles();
 * 
 * } }
 */