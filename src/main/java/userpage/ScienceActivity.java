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

public class ScienceActivity {
	
	
	WebDriver driver=null;
	
	public ScienceActivity(RemoteWebDriver driver19) {
		this.driver=driver19;			
	
	}
	
	
	public void ScienceValidation() {
		
		
		driver.get("https://cultureseekerz.com/activityWithTeacher?Activity=Science&class=Science");
		
		
		// Find the container element that holds the logo and text
        WebElement container = driver.findElement(By.className("icon_container")); // Replace "container-id" with the actual ID of the container

        // Find the logo element within the container
        WebElement logo = container.findElement(By.tagName("svg")); // Assuming the logo is represented by an <img> tag, adjust the XPath if needed

        // Find the text element within the container
        WebElement text = container.findElement(By.className("activity_name")); // Assuming the text is represented by a <p> tag, adjust the XPath if needed

        // Validate that the logo is displayed
        boolean isLogoDisplayed = logo.isDisplayed();

        // Validate that the text matches the expected value
        String expectedText = "Science";
        String actualText = text.getText();
        boolean isTextValid = actualText.equals(expectedText);

        // Print the validation results
        System.out.println("Is logo displayed? " + isLogoDisplayed);
        System.out.println("Is text valid? " + isTextValid);  
        
        try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
        
        
        
     // Find the ageGroup dropdown element
        WebElement ageGroupDropdown = driver.findElement(By.id("ageGroup"));
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Use Select class to work with dropdown
        Select selectAgeGroup = new Select(ageGroupDropdown);
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Select "High School" option from dropdown
        selectAgeGroup.selectByValue("Middle");
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}
        
     // Find the ageGroup dropdown element
        WebElement classTopicDropdown = driver.findElement(By.id("classTopic"));
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Use Select class to work with dropdown
        Select selectClassGroup = new Select(classTopicDropdown);
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Select "High School" option from dropdown
        selectClassGroup.selectByValue("Wed");
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}
        
     // Find the ageGroup dropdown element
        WebElement classTypeDropdown = driver.findElement(By.id("rating"));
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Use Select class to work with dropdown
        Select selectClassTypeGroup = new Select(classTypeDropdown);
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}

        // Select "High School" option from dropdown
        selectClassTypeGroup.selectByValue("Individual");
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}
        
        
		//Heading Content for lists of teacher
	  	WebElement HeadingElement= driver.findElement(By.xpath("(//div[@class='activity_classes_container ng-tns-c193138732-0 ng-star-inserted'])[1]"));
		String HeadingText = HeadingElement.getText();
		System.out.println("Text Content: " + HeadingText);
        
        WebElement ResetButton = driver.findElement(By.xpath("//button[normalize-space()='Reset']"));
        ResetButton.click();
        

		
		//Heading8 Content
	  	WebElement HeadingElement8= driver.findElement(By.xpath("//p[contains(text(),'Our guides, seasoned experts with a touch of passi')]"));
		String HeadingText8 = HeadingElement8.getText();
		System.out.println("Text8 Content: " + HeadingText8);
		
		//Heading Content for lists of teacher
	  	WebElement HeadingElement2= driver.findElement(By.xpath("(//div[@class='activity_classes_container ng-tns-c193138732-0 ng-star-inserted'])[1]"));
		String HeadingText2 = HeadingElement2.getText();
		System.out.println("Text2 Content: " + HeadingText2);

		
		// Create JavaScriptExecutor interface object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by a small amount (100 pixels vertically)
        js.executeScript("window.scrollBy(0, 450);");
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}
		
		
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        
			//Teacher's details for Meera Ganapathy Raman
			// Validate activity image
			WebElement activityImage = driver.findElement(By.xpath("//div[@id='Activity_with_Teacher']//div[1]//div[1]//div[1]//div[1]//img[1]"));
			if (activityImage.isDisplayed()) {
			System.out.println("Activity image validated.");
			} else {
			System.out.println("Activity image not found or not displayed.");
			}
			
			// Validate icon image
			WebElement iconImage = driver.findElement(By.xpath("//div[@id='Activity_with_Teacher']//div[1]//div[1]//div[1]//div[2]//p[1]//img[1]"));
			if (iconImage.isDisplayed()) {
			System.out.println("Icon image validated.");
			} else {
			System.out.println("Icon image not found or not displayed.");
			}
			
			
			//Heading Content for Meera Ganapathy Raman
			WebElement NameHeading= driver.findElement(By.xpath("(//div[@class='profileAndImg_container ng-tns-c193138732-0'])[1]"));
			String NameText = NameHeading.getText();
			System.out.println("Name Text Content: " + NameText);
			
			// Find the "read more" link
			WebElement readMoreLink = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[1]")); // Replace "readMoreLink" with the actual ID of the read more link
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink);
			System.out.println("Clicked the Read More Link");
			
			// Wait for the additional content to load (you may need to implement a wait mechanism here)
			
			// Get the text of the expanded paragraph
			WebElement paragraphElement = driver.findElement(By.xpath("//p[contains(text(),'Hello, everyone! I am Gomathi, and I bring 20 year')]")); // Replace "paragraphId" with the actual ID of the paragraph
			String expandedParagraph = paragraphElement.getText();
			
			// Print the expanded paragraph
			System.out.println(expandedParagraph);
			
			// Find the "read less" link
			WebElement readLessLink = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink);
			System.out.println("Clicked the Read Less Link");
			
			// Get the text of the expanded paragraph
			WebElement paragraphElement1 = driver.findElement(By.xpath("//p[contains(text(),'Hello, everyone! I am Gomathi, and I bring 20 year')]")); // Replace "paragraphId" with the actual ID of the paragraph
			String currentParagraph = paragraphElement1.getText();
			
			// Print the expanded paragraph
			System.out.println(currentParagraph); 
			
			
			try {
			Thread.sleep(2000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
			
			
			// Find and click on the date in the calendar
			WebElement date = driver.findElement(By.xpath("(//div)[45]"));
			date.click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			// Wait until the '07:30' button is clickable and click it
			WebElement timeButton = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("li")));
			timeButton.click();
			
			// Wait until the popup form is visible
			WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));  // Replace with the actual ID or locator of the popup form
			
			// Verify the popup text
			String popupText = popup.getText();
			if (popupText.contains("To join this class you need to sign in / register")) {
			System.out.println("Popup text verified");
			
			// Find and click the 'Sign in' button
			WebElement signInButton = popup.findElement(By.xpath("//button[normalize-space()='Sign in']"));
			signInButton.click();
			
			// Wait until the login page is loaded
			wait.until(ExpectedConditions.urlContains("login"));  // Replace with the actual URL fragment or condition to confirm the login page has loaded
			System.out.println("Navigated to login page");
			
			
			// Measure time for navigation to login page
			long startTime = System.currentTimeMillis();
			signInButton.click();
			wait.until(ExpectedConditions.urlContains("login"));  // Replace with the actual URL fragment or condition to confirm the login page has loaded
			long endTime = System.currentTimeMillis();
			long duration = endTime - startTime;
			System.out.println("Time taken to navigate to login page: " + duration + " milliseconds");
			
			
			// Navigate back to click the '09:30' button again
			driver.navigate().back();
			
			
			//Contents like class type, age group and price for Preethi A R
			WebElement ContentsHeading= driver.findElement(By.xpath("//body[1]/app-root[1]/app-activity-with-teacher[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]"));
			String ContentsText = ContentsHeading.getText();
			System.out.println("Contents are: " + ContentsText);
			
			
			
			// Find the Teacher Details Button
			WebElement TeacherDetailsButton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Monthly Availability'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", TeacherDetailsButton);
			System.out.println("Clicked the Teacher Details Button");
			
			try {
			Thread.sleep(5000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
			
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
			WebElement June11 = driver.findElement(By.xpath("//span[normalize-space()='11']"));
			June11.click();
			
			
			// Wait for the available times to be displayed
			WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement availableTime = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("li")));
			
			// Click on the available time
			availableTime.click();
			
			
			// Find the Enroll Button
			WebElement EnrollButton = driver.findElement(By.xpath("//button[normalize-space()='Enroll']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnrollButton);
			System.out.println("Clicked the Enroll Button");
			
			
			// Wait for the popup form to be displayed
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
			
			
			WebElement CancelButton = driver.findElement(By.xpath("//button[normalize-space()='×']"));
			CancelButton.click();
			
			
			driver.navigate().back();
			
			
			// Find the Free Trial Button
			WebElement FreeTrialButton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Book a free trial'])[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", FreeTrialButton);
			System.out.println("Clicked the Free trial Button");
			
			// Wait for the popup form to be displayed
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement popupForm = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
			
			// Find the email input field and send email button
			WebElement emailInput = popupForm.findElement(By.className("swal2-input"));
			WebElement sendEmailButton = popupForm.findElement(By.xpath("//button[normalize-space()='Send Email']"));
			
			
			// Enter an empty email ID
			emailInput.sendKeys("");
			
			try {
			Thread.sleep(2000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
			// Click the send email button
			sendEmailButton.click();
			
			try {
			Thread.sleep(2000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			
			// Wait for the error message to be displayed in the email input field
			WebElement errorMessage = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-validation-message")));
			
			// Print the error message text
			System.out.println("Error message displayed: " + errorMessage.getText());
			
			WebElement OkButton = popupForm.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
			OkButton.click();
			
			
			}
		
		
		
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
