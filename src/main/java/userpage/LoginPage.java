package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {
	
	WebDriver driver=null;

	public LoginPage(RemoteWebDriver driver2) {
		this.driver=driver2;
	}
	
	public void ValidationLogin() {
		
		
		// Find email input field and enter email
        WebElement emailInput = driver.findElement(By.id("mat-input-0"));
        emailInput.sendKeys("unregistered_email@example.com");

        // Find password input field and enter password
        WebElement passwordInput = driver.findElement(By.id("mat-input-1"));
        passwordInput.sendKeys("random_password");

        // Find the login button and click on it
        WebElement loginButton = driver.findElement(By.className("login_btn"));
        loginButton.click();

        // Check if error message is displayed
        WebElement errorMessage = driver.findElement(By.id("mat-mdc-error-1"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Login unsuccessful. Error message displayed: " + errorMessage.getText());
        } else {
            System.out.println("Login successful.");
        }

		
		
		
//		// Find email input field and enter email
//        System.out.println("Entering email...");
//        WebElement emailInput = driver.findElement(By.id("mat-input-0"));
//        emailInput.sendKeys("your_email@example.com");
//
//        // Find password input field and enter password
//        System.out.println("Entering password...");
//        WebElement passwordInput = driver.findElement(By.id("mat-input-1"));
//        passwordInput.sendKeys("your_password");
//
//        // Find the login button and click on it
//        System.out.println("Clicking the login button...");
//        WebElement loginButton = driver.findElement(By.className("login_btn"));
//        loginButton.click();
//        System.out.println("Login button clicked.");

        // Find the forgot password link and click on it
        System.out.println("Clicking the forgot password link...");
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        forgotPasswordLink.click();
        System.out.println("Forgot password link clicked.");
        
        //back to previous page
        driver.navigate().back();

        // Find the "Don't have an account" link and click on it
        System.out.println("Clicking the 'Don't have an account' link...");
        WebElement signUpLink = driver.findElement(By.linkText("Don't have an account"));
        signUpLink.click();
        System.out.println("'Don't have an account' link clicked.");

		
	}
	

}
