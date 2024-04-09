package testClass_Package;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass_Package.baseClass;
import page_Obj.login;

public class Login_testClass extends baseClass {
	
	

	
	/*@BeforeMethod
	public void SetUp()
	{
	OpenBrowser();	
	}
	
	@AfterMethod
	public void Teardown()
	{
	CloseBrowser();
	}*/
	
	@Test
	public void ValidCredentialLoginpage() throws InterruptedException
	{
		LoginBasic();
		Thread.sleep(5000);
		String expectedUrl= "https://wsqms.omindtech.net/o/F653-BD0-A380/dashboard";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Test
	public void InvalidCredentialLoginpage() throws InterruptedException
	{
		login login= new login();
		login.EmailIdInput(prop.getProperty("InvalidUsername"));
		login.PassWordInput(prop.getProperty("InvalidPassword"));
		login.ButtonClick();
		Thread.sleep(3000);
		String actualErrormessage=driver.findElement(By.xpath("//div[@class='mb-4 login_error']//div[text()='Invalid email or password']")).getText();
		String expectedErrormessage="Invalid email or password";
		Assert.assertEquals(actualErrormessage, expectedErrormessage);
	}
	@Test
	public void InvalidCredentialLoginpage2() throws InterruptedException
	{
		login login= new login();
		login.EmailIdInput(prop.getProperty("ValidUsername"));
		login.PassWordInput(prop.getProperty("BlankPassword"));
		login.ButtonClick();
		Thread.sleep(3000);
		String actualErrormessage=driver.findElement(By.xpath("//div[@class='mb-4 login_error']//div[text()='Password is required']")).getText();
		String expectedErrormessage="Password is required";
		Assert.assertEquals(actualErrormessage, expectedErrormessage);
	}
	
	@Test
	public void InvalidCredentialLoginpage3() throws InterruptedException
	{
		login login= new login();
		login.EmailIdInput(prop.getProperty("BlankUsername"));
		login.PassWordInput(prop.getProperty("ValidPassword"));
		login.ButtonClick();
		Thread.sleep(3000);
		String actualErrormessage=driver.findElement(By.xpath("//div[text()='Please provide your Email Id. This field can not be filled empty.']")).getText();
		String expectedErrormessage="Please provide your Email Id. This field can not be filled empty.";
		Assert.assertEquals(actualErrormessage, expectedErrormessage);
	}
	@Test
	public void InvalidCredentialLoginpage4() throws InterruptedException
	{
		login login= new login();
		login.EmailIdInput(prop.getProperty("BlankUsername"));
		login.PassWordInput(prop.getProperty("BlankPassword"));
		login.ButtonClick();
		Thread.sleep(3000);
		String actualErrormessage=driver.findElement(By.xpath("//div[text()='Please provide your Email Id. This field can not be filled empty.']")).getText();
		String expectedErrormessage="Please provide your Email Id. This field can not be filled empty.";
		Assert.assertEquals(actualErrormessage, expectedErrormessage);
		String actualErrormessage1=driver.findElement(By.xpath("//div[@class='mb-4 login_error']//div[text()='Password is required']")).getText();
		String expectedErrormessage1="Password is required";
		Assert.assertEquals(actualErrormessage1, expectedErrormessage1);
	}
	
	
}

 


