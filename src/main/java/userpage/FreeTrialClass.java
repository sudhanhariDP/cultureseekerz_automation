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

public class FreeTrialClass {
	
	
	WebDriver driver= null;
	
	public FreeTrialClass(RemoteWebDriver driver24) {
		this.driver=driver24;
		
	}
	
	public void FreeTrialClassvalidation() {
		
		driver.get("https://cultureseekerz.com/trailclass?FreeTrial=freetrial");
		
		
		WebElement imageElement = driver.findElement(By.xpath("//div[@class='trail_icon']//img"));

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
        selectClassGroup.selectByValue("Science");
        
        try {
 		    Thread.sleep(2000); // Wait for 5 seconds
 		} catch (InterruptedException e) {
 		    e.printStackTrace();
 		}
        

        
      //Heading Content for lists of teacher
	  	WebElement HeadingElement= driver.findElement(By.className("trial_class_text"));
		String HeadingText = HeadingElement.getText();
		System.out.println("Text Content: " + HeadingText);
		
		

		
		
		// Create JavaScriptExecutor interface object
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
		
     // Scroll down by a small amount (100 pixels vertically)
        js.executeScript("window.scrollBy(0, 450);");
		

		
		// Verify the image
 		WebElement TeacherImage = driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[1]//img[1]"));
 		if (TeacherImage.isDisplayed()) {
           System.out.println("Image is displayed correctly.");
 		} else {
 			System.out.println("Image is not displayed.");
 		}

 		
		
		// Find the "read more" link
		WebElement readMoreLink = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[1]")); // Replace "readMoreLink" with the actual ID of the read more link
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
		
		
		// Find the Free Trial Button
		WebElement FreeTrialButton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Book a trial'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", FreeTrialButton);
		System.out.println("Clicked the Free trial Button");
		
		// Wait for the popup form to be displayed
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popupForm = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
		
		// Find the email input field and send email button
		WebElement emailInput = popupForm.findElement(By.className("swal2-input"));
		WebElement sendEmailButton = popupForm.findElement(By.xpath("//button[normalize-space()='Submit']"));
		
		
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
