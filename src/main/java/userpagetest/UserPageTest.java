package userpagetest;

import org.testng.annotations.Test;

import userbase.UserBase;
import userpage.AboutUsPage;
import userpage.BibleActivity;
import userpage.CarnaticActivity;
import userpage.ChessActivity;
import userpage.ContactUsPage;
import userpage.FooterPage;
import userpage.FreeTrialClass;
import userpage.HeaderPage;
import userpage.HeaderPageTwo;
import userpage.HighClass;
import userpage.HomePage;
import userpage.KGAndElementaryClass;
import userpage.LoginPage;
import userpage.MathsActivity;
import userpage.MiddleClass;
import userpage.ProgrammingActivity;
import userpage.RegisterPage;
import userpage.ScienceActivity;
import userpage.ShlokaActivity;
import userpage.TamilSubject;
import userpage.TeacherPage;
import userpage.TeluguSubject;
import userpage.UserPage;
import userpage.WhyCultureSeekerzPage;
import userpage.YogaActivity;

public class UserPageTest extends UserBase {
	

	@Test(priority=1)
	public void TestCase() {
		new UserPage(driver)
		.HeaderTest();
		
		new HeaderPage(driver)
		.ValidationHeader();
		
	}
	
	
	@Test(priority=2)
	public void TestCase2() {
		new UserPage(driver)
		.Login();
		
		new LoginPage(driver)
		.ValidationLogin();
			
	}
	
	
	@Test(priority=3)
	public void TestCase3() {
		new UserPage(driver)
		.Register();
		
		new RegisterPage(driver)
		.ValidationRegister();
	
	}
	
	
	@Test(priority=4)
	public void TestCase4() {
		new UserPage(driver)
		.HeaderTwo();
		
		new HeaderPageTwo(driver)
		.NavigationHeader();
	
	}

	
	@Test(priority=5)
	public void TestCase5() {
		new UserPage(driver)
		.Teacher();
		
		new TeacherPage(driver)
		.TeacherValForm();
	
	}
	
	
	@Test(priority=6)
	public void TestCase6() {
		new UserPage(driver)
		.AboutUs();
		
		new AboutUsPage(driver)
		.AboutUsValidation();
	
	}

	
	@Test(priority=7)
	public void TestCase7() {
		new UserPage(driver)
		.WhyCultureSeekerz();
		
		new WhyCultureSeekerzPage(driver)
		.ValidationOfWCS();
	
	}
	
	
	@Test(priority=8)
	public void TestCase8() {
		new UserPage(driver)
		.ContactUs();
		
		new ContactUsPage(driver)
		.ContactUsValidation();
	
	}
	
	
	@Test(priority=9)
	public void TestCase9() {
		new UserPage(driver)
		.Footer();
		
		new FooterPage(driver)
		.FooterValidation();
	}
	
	
	@Test(priority=10)
	public void TestCase10() {
		new UserPage(driver)
		.Home();
		
		new HomePage(driver)
		.HomePageValidation();
	}
	
	
	
	@Test(priority=11)
	public void TestCase11() {
		new UserPage(driver)
		.Tamil();
		
		new TamilSubject(driver)
		.TamilValidation();
	}
	
	
	@Test(priority=12)
	public void TestCase12() {
		new UserPage(driver)
		.Telugu();
		
		new TeluguSubject(driver)
		.TeluguValidation();
		
	}
	
	
	@Test(priority=13)
	public void TestCase13() {
		new UserPage(driver)
		.Bible();
		
		new BibleActivity(driver)
		.BibleValidation();
		
	}
	
	
	@Test(priority=14)
	public void TestCase14() {
		new UserPage(driver)
		.Carnatic();
		
		new CarnaticActivity(driver)
		.CarnaticValidation();
		
	}
	
	
	@Test(priority=15)
	public void TestCase15() {
		new UserPage(driver)
		.Shloka();
		
		new ShlokaActivity(driver)
		.ShlokaValidation();
		
	}
	
	
	@Test(priority=16)
	public void TestCase16() {
		new UserPage(driver)
		.Chess();
		
		new ChessActivity(driver)
		.ChessValidation();
		
	}
	
	@Test(priority=17)
	public void TestCase17() {
		new UserPage(driver)
		.Programming();
		
		new ProgrammingActivity(driver)
		.ProgrammingValidation();
		
	}
	
	
	@Test(priority=18)
	public void TestCase18() {
		new UserPage(driver)
		.Maths();
		
		new MathsActivity(driver)
		.MathsValidation();
		
	}
	
	@Test(priority=19)
	public void TestCase19() {
		new UserPage(driver)
		.Science();
		
		new ScienceActivity(driver)
		.ScienceValidation();
		
	}
	

	@Test(priority=20)
	public void TestCase20() {
		new UserPage(driver)
		.Yoga();
		
		new YogaActivity(driver)
		.YogaValidation();
		
	}
	
	
	@Test(priority=21)
	public void TestCase21() {
		new UserPage(driver)
		.KGAndElementary();
		
		new KGAndElementaryClass(driver)
		.KGAndElementaryValidation();
		
	}
	
	
	@Test(priority=22)
	public void TestCase22() {
		new UserPage(driver)
		.Middle();
		
		new MiddleClass(driver)
		.MiddleClassValidation();
		
	}
	
	
	@Test(priority=23)
	public void TestCase23() {
		new UserPage(driver)
		.High();
		
		new HighClass(driver)
		.HighClassValidation();
	}
	
	   
	@Test(priority=24)
	public void TestCase24() {
		new UserPage(driver)
		.FreeTrial();
		
		new FreeTrialClass(driver)
		.FreeTrialClassvalidation();
	}
	
	
	
//	@Test(priority=13)
//	public void TestCase13() {
//	new UserPage(driver)
//	.Bible();
//	
//	new BibleActivity(driver)
//	.BibleValidation();
//	
//
//	new UserPage(driver)
//	.Carnatic();
//	
//	new CarnaticActivity(driver)
//	.CarnaticValidation();
//	
//
//	new UserPage(driver)
//	.Shloka();
//	
//	new ShlokaActivity(driver)
//	.ShlokaValidation();
//	
//
//	new UserPage(driver)
//	.Chess();
//	
//	new ChessActivity(driver)
//	.ChessValidation();
//	
//
//	new UserPage(driver)
//	.Programming();
//	
//	new ProgrammingActivity(driver)
//	.ProgrammingValidation();
//
//	
//	new UserPage(driver)
//	.Maths();
//	
//	new MathsActivity(driver)
//	.MathsValidation();
//	
//
//	new UserPage(driver)
//	.Science();
//	
//	new ScienceActivity(driver)
//	.ScienceValidation();
//
//	new UserPage(driver)
//	.Yoga();
//	
//	new YogaActivity(driver)
//	.YogaValidation();
//	
//}
	
	
}