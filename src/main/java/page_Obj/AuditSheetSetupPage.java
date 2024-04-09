package page_Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_Package.baseClass;

public class AuditSheetSetupPage extends baseClass{

		
		@FindBy(xpath = "//span[text()='Audit Sheet Setup']")
		WebElement AuditSheetSetupIconClick;
		
		@FindBy(xpath = "//a[text()='Create Audit Sheet']")
		WebElement CreateAuditSheetButtonClick;
		
		
		public AuditSheetSetupPage()
		{
			PageFactory.initElements(driver, this);
	    }
		
		public void AuditIconClick()
		{
			AuditSheetSetupIconClick.click();
		}
		public void CreateAuditClick()
		{
			CreateAuditSheetButtonClick.click();
		}
	}

