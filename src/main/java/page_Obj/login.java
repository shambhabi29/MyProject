package page_Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass_Package.baseClass;

public class login extends baseClass{
	
	
	@FindBy(id = ":r0:")
	WebElement EmailId;
	
	@FindBy(id = ":r1:")
	WebElement PassWord;
	
	@FindBy(id = ":r2:")
	WebElement LogInClick;
	
	public login()
	{
		PageFactory.initElements(driver, this);
    }
	
	public void EmailIdInput(String email)
	{
		EmailId.sendKeys(email);
	}
	public void PassWordInput(String pass )
	{
		PassWord.sendKeys(pass);
	}
	public void ButtonClick()
	{
		LogInClick.click();
	}
}
	


