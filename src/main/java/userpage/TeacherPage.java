package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TeacherPage {
	
	WebDriver driver= null;
	
	public TeacherPage(RemoteWebDriver driver5) {
		this.driver=driver5;
	}

	public void TeacherValForm() {
		
		WebElement RegisterLink = driver.findElement(By.xpath("//a[@routerlink='/login-reg/toregistration']"));
		RegisterLink.click();
		
		WebElement TeacherButtonLink = driver.findElement(By.xpath("//div[@class='teacher-container']//button[@class='mdc-button mdc-button--raised mat-mdc-raised-button mat-unthemed mat-mdc-button-base']"));
		TeacherButtonLink.click();
		
		// Fill out the registration form
        WebElement firstNameInput = driver.findElement(By.id("mat-input-0"));
        firstNameInput.sendKeys("John");

        WebElement middleNameInput = driver.findElement(By.id("mat-input-1"));
        middleNameInput.sendKeys("Doe");

        WebElement lastNameInput = driver.findElement(By.id("mat-input-2"));
        lastNameInput.sendKeys("Smith");

        WebElement emailInput = driver.findElement(By.id("mat-input-3"));
        emailInput.sendKeys("john.smith@example.com");

        WebElement phoneNumberInput = driver.findElement(By.id("mat-input-4"));
        phoneNumberInput.sendKeys("1234567890");

        WebElement ageInput = driver.findElement(By.id("mat-input-7"));
        ageInput.sendKeys("30");

        WebElement genderSelect = driver.findElement(By.id("mat-select-0"));
        genderSelect.sendKeys("Female"); // Assuming there's a dropdown for gender

        WebElement passwordInput = driver.findElement(By.id("mat-input-5"));
        passwordInput.sendKeys("password");

        WebElement confirmPasswordInput = driver.findElement(By.id("mat-input-6"));
        confirmPasswordInput.sendKeys("password");

        // Submit the registration form
        WebElement registerButton = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        registerButton.click();
		
	}

}
