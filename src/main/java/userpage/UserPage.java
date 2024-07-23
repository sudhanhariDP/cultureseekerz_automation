package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import userbase.UserBase;

public class UserPage extends UserBase {
	
	RemoteWebDriver driver= null;
	
	public UserPage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	
	public HeaderPage HeaderTest() {
		return new HeaderPage(driver);	
	}
	
	public LoginPage Login() {
		driver.findElement(By.xpath("//a[@routerlink='/login-reg/login']")).click();
		return new LoginPage(driver);
	}
	
	public RegisterPage Register() {
		driver.findElement(By.xpath("//a[@routerlink='/login-reg/toregistration']")).click();
		return new RegisterPage(driver);
	}
	
	public HeaderPageTwo HeaderTwo() {
		return new HeaderPageTwo(driver);
		
	}
	
	public TeacherPage Teacher() {
		return new TeacherPage(driver);
	}
	
	public AboutUsPage AboutUs() {
		return new AboutUsPage(driver);	
	}
	
	public WhyCultureSeekerzPage WhyCultureSeekerz() {
		return new WhyCultureSeekerzPage(driver);
	}
	
	public ContactUsPage ContactUs() {
		return new ContactUsPage(driver);
	}
	
	public FooterPage Footer() {
		return new FooterPage(driver);
	}
	
	public HomePage Home() {
		return new HomePage(driver);
		
	}
	
	
	public TamilSubject Tamil() {
		driver.findElement(By.xpath("//img[@src='../../../assets/SVG icon/Frame40.svg']"));
		return new TamilSubject(driver);
	}
	
	
	public TeluguSubject Telugu() {
		return new TeluguSubject(driver);
		
	}
	
	public BibleActivity Bible() {
		return new BibleActivity(driver);
	}
	
	public CarnaticActivity Carnatic() {
		return new CarnaticActivity(driver);
	}
	
	public ShlokaActivity Shloka() {
		return new ShlokaActivity(driver);
	}

	public ChessActivity Chess() {
		return new ChessActivity(driver);
	}
	
	
	public ProgrammingActivity Programming() {
		return new ProgrammingActivity(driver);
	}
	
	public MathsActivity Maths() {
		return new MathsActivity(driver);
	}
	
	public ScienceActivity Science() {
		return new ScienceActivity(driver);
	}
	
	public YogaActivity Yoga() {
		return new YogaActivity(driver);
	}
	
	public KGAndElementaryClass KGAndElementary() {
		return new KGAndElementaryClass(driver);
	}
	
	public MiddleClass Middle() {
		return new MiddleClass(driver);
	}
	
	public HighClass High() {
		return new HighClass(driver);
	}
	
	public FreeTrialClass FreeTrial() {
		return new FreeTrialClass(driver);
	}
	
	

}