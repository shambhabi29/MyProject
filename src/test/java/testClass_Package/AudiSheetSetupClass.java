package testClass_Package;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass_Package.baseClass;
import page_Obj.AuditSheetSetupPage;
import page_Obj.login;


public class AudiSheetSetupClass extends baseClass{
	
	@Test (priority=1)
	public void ValidCredentialLoginpage() throws InterruptedException
	{
		LoginBasic();
		Thread.sleep(3000);
		String expectedUrl= "https://wsqms.omindtech.net/o/F653-BD0-A380/dashboard";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
    
	@Test (priority=2)
	
	public void auditSicon() throws InterruptedException
	{
		LoginBasic();
		AuditSheetSetupPage AuditSheetSetupPage= new AuditSheetSetupPage();
		Thread.sleep(3000);
		AuditSheetSetupPage.AuditIconClick();
		Thread.sleep(3000);
	
		String expectedUrl= "https://wsqms.omindtech.net/o/F653-BD0-A380/audit-sheet/list";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Test (priority=3)
	public void CreateAuditSheetButton() throws InterruptedException
	{
		LoginBasic();
		AuditSheetSetupPage AuditSheetSetupPage= new AuditSheetSetupPage();
		Thread.sleep(3000);
		AuditSheetSetupPage.AuditIconClick();
		Thread.sleep(3000);
		AuditSheetSetupPage.CreateAuditClick();
		Thread.sleep(3000);
		String expectedUrl= "https://wsqms.omindtech.net/o/F653-BD0-A380/audit-sheet/create";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
}
