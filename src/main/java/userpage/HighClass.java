package userpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HighClass {
	
	
	WebDriver driver=null;
	
	public HighClass(RemoteWebDriver driver23) {
		this.driver=driver23;
	}
	
	
	
public void HighClassValidation() {
		
		
			driver.get("https://cultureseekerz.com/trailclass?ageGroup=High");
			
			
			WebElement imageElement = driver.findElement(By.xpath("//img[@class='ng-star-inserted']"));
	
	        // Validate if the image element is present
	        if (imageElement.isDisplayed()) {
	            System.out.println("Image is displayed on the webpage.");
	
	            // Validate if the image is loaded correctly
	            String srcAttribute = imageElement.getAttribute("src");
	            if (srcAttribute != null && !srcAttribute.isEmpty()) {
	                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
	            } else {
	                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
	            }
	        } else {
	            System.out.println("Image is not displayed on the webpage.");
	        }
	
	        
	      //Heading Content for lists of teacher
		  	WebElement HeadingElement= driver.findElement(By.className("trial_class_text"));
			String HeadingText = HeadingElement.getText();
			System.out.println("Text Content: " + HeadingText);
			
			try {
	 		    Thread.sleep(2000); // Wait for 5 seconds
	 		} catch (InterruptedException e) {
	 		    e.printStackTrace();
	 		}
			
			
			WebElement ActivityDropdown = driver.findElement(By.id("activitys"));
	        
	        
			// Use Select class to work with dropdown
	        Select selectClassGroup = new Select(ActivityDropdown);
	        
	        try {
	 		    Thread.sleep(2000); // Wait for 5 seconds
	 		} catch (InterruptedException e) {
	 		    e.printStackTrace();
	 		}
	
	        // Select "High School" option from dropdown
	        selectClassGroup.selectByValue("Maths");
	        
	        try {
	 		    Thread.sleep(2000); // Wait for 5 seconds
	 		} catch (InterruptedException e) {
	 		    e.printStackTrace();
	 		}
	        
	        
	      //Heading Content for lists of teacher
		  	WebElement HeadingElement2= driver.findElement(By.xpath("//div[@class='container']"));
			String HeadingText2 = HeadingElement2.getText();
			System.out.println("Text Content: " + HeadingText2);
			
			
			
			// Create JavaScriptExecutor interface object
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
			
			// Scroll down gradually
				slowScrollDown(driver, js);
			
	
			
			// Verify the image
	 		WebElement TeacherImage = driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[1]//img[1]"));
	 		if (TeacherImage.isDisplayed()) {
	           System.out.println("Image is displayed correctly.");
	 		} else {
	 			System.out.println("Image is not displayed.");
	 		}
	    
	    
	
			
			// Find the "read more" link
			WebElement readMoreLink = driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[3]//div[1]//a[1]")); // Replace "readMoreLink" with the actual ID of the read more link
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink);
			System.out.println("Clicked the Read More Link");
			
			// Wait for the additional content to load (you may need to implement a wait mechanism here)
			
			// Get the text of the expanded paragraph
			WebElement paragraphElement = driver.findElement(By.xpath("//p[@class='about ng-star-inserted']")); // Replace "paragraphId" with the actual ID of the paragraph
			String expandedParagraph = paragraphElement.getText();
			
			// Print the expanded paragraph
			System.out.println(expandedParagraph);
			
			// Find the "read less" link
			WebElement readLessLink = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink);
			System.out.println("Clicked the Read Less Link");
			
			// Get the text of the expanded paragraph
			WebElement paragraphElement1 = driver.findElement(By.xpath("//p[@class='about ng-star-inserted']")); // Replace "paragraphId" with the actual ID of the paragraph
			String currentParagraph = paragraphElement1.getText();
			
			// Print the expanded paragraph
			System.out.println(currentParagraph); 
	    
			
			// Find the Enroll Button
				WebElement EnrollButton = driver.findElement(By.xpath("//button[normalize-space()='Enroll']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnrollButton);
				System.out.println("Clicked the Enroll Button");
	
	        
			
			// Validate activity image
			WebElement PersonImage = driver.findElement(By.xpath("//div[@class='teacher_profile_card_image']//img"));
			if (PersonImage.isDisplayed()) {
			System.out.println("Person's image validated.");
			} else {
			System.out.println("Person's image not found or not displayed.");
			}
			
			
			//Heading Content for lists of teacher
			WebElement SubramanyamActivityHeading= driver.findElement(By.xpath("//div[@class='teacher_profile_about_teacher_details']"));
			String SubramanyamActivityText = SubramanyamActivityHeading.getText();
			System.out.println("Activity Content: " + SubramanyamActivityText);
			
			
			// Scroll down gradually
			slowScrollDown(driver, js);
			
			
			// Click on the right arrow to navigate to the next month
			WebElement rightArrow = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
			rightArrow.click();
			
			
			try {
			Thread.sleep(2000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
			
			// Click on the date (June 11)
			WebElement July15 = driver.findElement(By.xpath("//span[normalize-space()='15']"));
			July15.click();
			
			
			// Wait for the available times to be displayed
			WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement availableTime = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("li")));
			
			// Click on the available time
			availableTime.click();
			
			
			// Find the Enroll Button
			WebElement EnrollButton1 = driver.findElement(By.xpath("//button[normalize-space()='Enroll']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnrollButton1);
			System.out.println("Clicked the Enroll Button 1");
			
			
			// Wait for the popup form to be displayed
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
			
			
			WebElement CancelButton = driver.findElement(By.xpath("//button[normalize-space()='×']"));
			CancelButton.click();
        
	

			
	}


	private void slowScrollDown(WebDriver driver3, JavascriptExecutor js) {
	    long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
	
	    while (true) {
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	
	        try {
	            Thread.sleep(2000); // Adjust the sleep time as needed (in milliseconds)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	
	        long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
	        if (newHeight == lastHeight) {
	            break;
	        }
	        lastHeight = newHeight;
	    	}	
		
	}

}
