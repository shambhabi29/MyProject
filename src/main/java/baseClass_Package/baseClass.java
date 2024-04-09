package baseClass_Package;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_Obj.login;

public class baseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public void LoginBasic(){
		login login= new login();
		login.EmailIdInput(prop.getProperty("ValidUsername"));
		login.PassWordInput(prop.getProperty("ValidPassword"));
		login.ButtonClick();}
	
	@BeforeMethod
	
	public static void OpenBrowser()
	{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://wsqms.omindtech.net/");
	}
	
	@AfterMethod
	
	public static void CloseBrowser()	
	{
		driver.quit();
	}
	@BeforeTest
	public void LoadingConfigFile() throws IOException
	{
	    prop= new Properties();
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config_Package\\config.properties");
	    prop.load(fis);
	}
	
	
}
