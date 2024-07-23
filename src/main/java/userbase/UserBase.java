package userbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UserBase {
	
	String URL = "https://cultureseekerz.com/";
	
	protected RemoteWebDriver driver= null;
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void StartApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	
	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}


}
