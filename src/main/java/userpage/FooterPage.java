package userpage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FooterPage {
	
	WebDriver driver = null;
	
	public FooterPage(RemoteWebDriver driver9) {
		this.driver=driver9;
	}
	
	
	public void FooterValidation() {
		//CLicking Home Page Link
	      WebElement HomeLink = driver.findElement(By.xpath("//li[normalize-space()='Home']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", HomeLink);
		  System.out.println("Clicked the Home Page Link");
		  
		  // Add a wait duration (e.g., 5 seconds) to observe the navigation
		  try {
			    Thread.sleep(5000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		  
		  //CLicking Our Plan Page Link
	      WebElement AboutUsLink = driver.findElement(By.xpath("//li[normalize-space()='About Us']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AboutUsLink);
		  System.out.println("Clicked the About Us Page Link");
		  
		// Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			  
			  
			//back to previous page
		        driver.navigate().back();
			  
		  
		  //CLicking Why CultureSeekerz Page Link
		  WebElement WhyCultureSeekerzLink = driver.findElement(By.xpath("//li[normalize-space()='Why CultureSeekerz ?']"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", WhyCultureSeekerzLink);
		  System.out.println("Clicked the Why CultureSeekerz Page Link");
		  
		  // Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			  
			  
			  //CLicking Contact Us Page Link
			  WebElement ContactUsLink = driver.findElement(By.className("contactus"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContactUsLink);
			  System.out.println("Clicked the Contact Us Page Link");
			  
			  
			// Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			  
			  
			//CLicking Email Page Link
			  WebElement EmailLink = driver.findElement(By.xpath("//span[@class='email.text'][normalize-space()='support@cultureseekerz.com']"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", EmailLink);
			  System.out.println("Clicked the Email Page Link");
			  
			  
			  
			// Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			  
			  
			  //Phone Number Content
			  	WebElement PhoneNumberElement= driver.findElement(By.xpath("//span[@class='email.text'][normalize-space()='+91 99940 74216']"));
				String PhoneNumberText = PhoneNumberElement.getText();
				System.out.println("Phone Number Content: " + PhoneNumberText);
				
				
				// Add a wait duration (e.g., 5 seconds) to observe the navigation
				  try {
					    Thread.sleep(5000); // Wait for 5 seconds
					} catch (InterruptedException e) {
					    e.printStackTrace();
					}
			  
			  
			  //Clicking LinkedIn Page Link
			  WebElement LinkedInLink = driver.findElement(By.className("LinkedIn_text"));
		      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LinkedInLink);
			  System.out.println("Clicked the LinkedIn Link");
			  
			// Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			
//			  driver.navigate().back();
			  
			  
			  
				//Copyrights Content
				WebElement CopyrightsElement= driver.findElement(By.xpath("//div[@class='copyrights_icon_content']"));
				String CopyrightsText = CopyrightsElement.getText();
				System.out.println("Copyrights Content: " + CopyrightsText);
				
				//Clicking LinkedIn Page Link
				  WebElement DataPatternLink = driver.findElement(By.xpath("//img[@alt='DataPattern']"));
			      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DataPatternLink);
				  System.out.println("Clicked the DataPattern Link");
				  
				
	}
	
	

}