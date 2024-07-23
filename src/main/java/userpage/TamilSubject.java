package userpage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TamilSubject {
	
	WebDriver driver=null;
	
	public TamilSubject(RemoteWebDriver driver11) {
		this.driver=driver11;
	}
	
	
	public void TamilValidation() {
		
		driver.get("https://cultureseekerz.com/activityWithTeacher?Activity=Tamil&class=Tamil");
		
		
		//Heading7 Content
	  	WebElement HeadingElement7= driver.findElement(By.xpath("//div[@id='Activity_with_Teacher']"));
		String HeadingText7 = HeadingElement7.getText();
		System.out.println("Text7 Content: " + HeadingText7);
		
		
		// Find the container element that holds the logo and text
        WebElement container = driver.findElement(By.className("icon_container")); // Replace "container-id" with the actual ID of the container

        // Find the logo element within the container
        WebElement logo = container.findElement(By.className("activity_Tamilicon")); // Assuming the logo is represented by an <img> tag, adjust the XPath if needed

        // Find the text element within the container
        WebElement text = container.findElement(By.className("activity_name")); // Assuming the text is represented by a <p> tag, adjust the XPath if needed

        // Validate that the logo is displayed
        boolean isLogoDisplayed = logo.isDisplayed();

        // Validate that the text matches the expected value
        String expectedText = "Tamil";
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

//        // Scroll down gradually
//        slowScrollDown(driver, js);
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		//Teacher's details for Bharathi
//		// Validate activity image
//		WebElement activityImage = driver.findElement(By.xpath("//div[@class='activity_classes_container ng-tns-c193138732-0 ng-star-inserted']//div[1]//div[1]//div[1]//div[1]//img[1]"));
//		if (activityImage.isDisplayed()) {
//		    System.out.println("Activity image validated.");
//		} else {
//		    System.out.println("Activity image not found or not displayed.");
//		}
//		
//		// Validate icon image
//		WebElement iconImage = driver.findElement(By.xpath("//body[1]/app-root[1]/app-activity-with-teacher[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/p[1]/img[1]"));
//		if (iconImage.isDisplayed()) {
//			System.out.println("Icon image validated.");
//			} else {
//				 System.out.println("Icon image not found or not displayed.");
//		}
//				
//		
//		//Heading Content for Bharathi
//	  	WebElement NameHeading= driver.findElement(By.xpath("//span[contains(text(),'Bharathi')]"));
//		String NameText = NameHeading.getText();
//		System.out.println("Name Text Content: " + NameText);
//		
//		
//		
//		//Heading Content for Tamil
//	  	WebElement TamilActivityHeading= driver.findElement(By.xpath("//span[contains(text(),'Bharathi')]"));
//		String TamilActivityText = TamilActivityHeading.getText();
//		System.out.println("Activity Content: " + TamilActivityText);
//		
//
//		// Find the "read more" link
//		WebElement readMoreLink = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[1]")); // Replace "readMoreLink" with the actual ID of the read more link
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink);
//		System.out.println("Clicked the Read More Link");
//
//      // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//      // Get the text of the expanded paragraph
//      WebElement paragraphElement = driver.findElement(By.xpath("//p[contains(text(),'Namaskaram! I am Bharathi P, bringing 22 years of ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//      String expandedParagraph = paragraphElement.getText();
//
//      // Print the expanded paragraph
//      System.out.println(expandedParagraph);
//      
//      // Find the "read less" link
//      WebElement readLessLink = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink);
//    System.out.println("Clicked the Read Less Link");
//    
// // Get the text of the expanded paragraph
//      WebElement paragraphElement2 = driver.findElement(By.xpath("//p[contains(text(),'Namaskaram! I am Bharathi P, bringing 22 years of ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//      String currentParagraph = paragraphElement2.getText();
//
//      // Print the expanded paragraph
//      System.out.println(currentParagraph);
//      
//      
//      try {
//		    Thread.sleep(2000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
//
//      
//
//   // Find and click on the date in the calendar
//        WebElement date = driver.findElement(By.xpath("//body[1]/app-root[1]/app-activity-with-teacher[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]"));
//        date.click();
//      
//      
//
//     // Check if there is available time statement
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            WebElement availableTimeStatement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'ng-tns-c193138732-0 ng-star-inserted')]")));
//
//            // If available time statement is found, click on available time button
//            WebElement availableTimeButton = availableTimeStatement.findElement(By.xpath("//li[normalize-space()='07:30']"));
//            availableTimeButton.click();
//
//            // Wait for the popup form to be displayed
//            WebElement popupForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//
//            // Print success message
//            System.out.println("Popup form displayed successfully after clicking available time button.");
//        } catch (Exception e) {
//            // If no available time statement found, print message
//            System.out.println("No available time for the selected date.");
//        }
//        
//        
//        
//      //Contents like class type, age group and price for Bharathi
//	  	WebElement ContentsHeading= driver.findElement(By.xpath("//body[1]/app-root[1]/app-activity-with-teacher[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]"));
//		String ContentsText = ContentsHeading.getText();
//		System.out.println("Contents are: " + ContentsText);
//		
//		
//		// Find the Teacher Details Button
//		WebElement TeacherDetailsButton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Monthly Availability'])[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", TeacherDetailsButton);
//		System.out.println("Clicked the Teacher Details Button");
//		
//		try {
//		    Thread.sleep(5000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
//		
//		
//		// Validate activity image
//		WebElement PersonImage = driver.findElement(By.xpath("//div[@class='teacher_profile_card_image']//img"));
//		if (PersonImage.isDisplayed()) {
//		    System.out.println("Person's image validated.");
//		} else {
//		    System.out.println("Person's image not found or not displayed.");
//		}
//		
//		
//		//Heading Content for lists of teacher
//		WebElement BharathiActivityHeading= driver.findElement(By.xpath("//div[@class='teacher_profile_about_teacher_details']"));
//		String BharathiActivityText = BharathiActivityHeading.getText();
//		System.out.println("Activity Content: " + BharathiActivityText);
//	
//		try {
//			Thread.sleep(2000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	
//	
//		// Scroll down gradually
//		slowScrollDown(driver, js);
//	
//	
//		// Click on the right arrow to navigate to the next month
//		WebElement rightArrow = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
//		rightArrow.click();
//    
//    
//		try {
//			Thread.sleep(2000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//    
//    
//		// Click on the date (June 11)
//		WebElement June11 = driver.findElement(By.xpath("//span[normalize-space()='11']"));
//		June11.click();
//    
//    
//		// Wait for the available times to be displayed
//		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement availableTime = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("li")));
//
//		// Click on the available time
//		availableTime.click();
//    
//    
//		// Find the Enroll Button
//		WebElement EnrollButton = driver.findElement(By.xpath("//button[normalize-space()='Enroll']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnrollButton);
//		System.out.println("Clicked the Enroll Button");
//	 
//    
//		// Wait for the popup form to be displayed
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//    
//    
//		WebElement CancelButton = driver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
//		CancelButton.click();
//    
//    
//		driver.navigate().back();
//    
//    
////		// Scroll down gradually
////		slowScrollDown(driver, js);
//
//    
//		// Find the Free Trial Button
//		WebElement FreeTrialButton = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Book a free trial'])[1]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", FreeTrialButton);
//		System.out.println("Clicked the Free trial Button");
// 	
//		// Wait for the popup form to be displayed
//		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement popupForm = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//
//		// Find the email input field and send email button
//		WebElement emailInput = popupForm.findElement(By.className("swal2-input"));
//		WebElement sendEmailButton = popupForm.findElement(By.xpath("//button[normalize-space()='Send Email']"));
//    
//
//		// Enter an empty email ID
//		emailInput.sendKeys("");
//    
//		try {
//			Thread.sleep(2000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		// Click the send email button
//		sendEmailButton.click();
    
//		try {
//			Thread.sleep(2000); // Wait for 5 seconds
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//		// Wait for the error message to be displayed in the email input field
//		WebElement errorMessage = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//
//		// Print the error message text
//		System.out.println("Error message displayed: " + errorMessage.getText());
    
//    	WebElement OkButton = popupForm.findElement(By.className("swal2-confirm"));
//    	OkButton.click();
    
    
//      // Scroll down gradually
//      slowScrollDown(driver, js);
        
		
		
        
        
        // Scroll down by a small amount (100 pixels vertically)
        js.executeScript("window.scrollBy(0, 650);");

        // Optional: You can add a delay to observe the scroll
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
      
      
      
      
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//Teacher's details for Kathikeyan
		// Validate activity image
		WebElement activityImage1 = driver.findElement(By.xpath("//div[2]//div[1]//div[1]//div[1]//img[1]"));
		if (activityImage1.isDisplayed()) {
		    System.out.println("Activity image validated.");
		} else {
		    System.out.println("Activity image not found or not displayed.");
		}
		
		// Validate icon image
		WebElement iconImage1 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-activity-with-teacher[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/p[1]/img[1]"));
		if (iconImage1.isDisplayed()) {
			System.out.println("Icon image validated.");
			} else {
				 System.out.println("Icon image not found or not displayed.");
		}
				
		
		//Heading Content for Karthikeyan
	  	WebElement NameHeading1= driver.findElement(By.xpath("//span[contains(text(),'Karthikeyan')]"));
		String NameText1 = NameHeading1.getText();
		System.out.println("Name Text Content: " + NameText1);
		
		
		
		//Heading Content for Tamil
	  	WebElement TamilActivityHeading1= driver.findElement(By.xpath("(//span[normalize-space()='Tamil'])[2]"));
		String TamilActivityText1 = TamilActivityHeading1.getText();
		System.out.println("Activity Content: " + TamilActivityText1);
		

		// Find the "read more" link
		WebElement readMoreLink1 = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[2]")); // Replace "readMoreLink" with the actual ID of the read more link
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink1);
		System.out.println("Clicked the Read More Link 1");

    // Wait for the additional content to load (you may need to implement a wait mechanism here)

    // Get the text of the expanded paragraph
    WebElement paragraphElement1 = driver.findElement(By.xpath("(//p[contains(text(),\"Hello, I'm Karthikeyan L, and I bring six years of\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
    String expandedParagraph1 = paragraphElement1.getText();

    // Print the expanded paragraph
    System.out.println(expandedParagraph1);
    
    // Find the "read less" link
    WebElement readLessLink1 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink1);
  System.out.println("Clicked the Read Less Link");
  
// Get the text of the expanded paragraph
    WebElement paragraphElement3 = driver.findElement(By.xpath("(//p[contains(text(),\"Hello, I'm Karthikeyan L, and I bring six years of\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
    String currentParagraph1 = paragraphElement3.getText();

    // Print the expanded paragraph
    System.out.println(currentParagraph1);
    
    
    try {
		    Thread.sleep(2000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

    

 // Find and click on the date in the calendar
      WebElement date1 = driver.findElement(By.xpath("(//div)[96]"));
      date1.click();
    
    

   // Check if there is available time statement
      WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
      try {
          WebElement availableTimeStatement = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[@class='ng-tns-c193138732-34 selected_time ng-star-inserted'])[1]")));

          
          // If available time statement is found, click on available time button
          WebElement availableTimeButton = availableTimeStatement.findElement(By.xpath("(//li[normalize-space()='09.30']"));
          availableTimeButton.click();

          // Wait for the popup form to be displayed
          WebElement popupForm1 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));

          // Print success message
          System.out.println("Popup form displayed successfully after clicking available time button.");
      } catch (Exception e) {
          // If no available time statement found, print message
          System.out.println("No available time for the selected date.");
      }
      
      
      
    //Contents like class type, age group and price for Karthikeyan
	  	WebElement ContentsHeading1= driver.findElement(By.xpath("(//div[@class='details_icon_container_wrap ng-tns-c193138732-0'])[2]"));
		String ContentsText1 = ContentsHeading1.getText();
		System.out.println("Contents are: " + ContentsText1);
		
		
		// Find the Teacher Details Button
		WebElement TeacherDetailsButton1 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Monthly Availability'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", TeacherDetailsButton1);
		System.out.println("Clicked the Teacher Details Button");
		
		try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		
		// Validate activity image
		WebElement PersonImage1 = driver.findElement(By.xpath("//div[@class='teacher_profile_card_image']"));
		if (PersonImage1.isDisplayed()) {
		    System.out.println("Person's image validated.");
		} else {
		    System.out.println("Person's image not found or not displayed.");
		}
		
		
		//Heading Content for lists of teacher
		WebElement KarthikeyanActivityHeading= driver.findElement(By.xpath("(//div[@class='teacher_profile_about_teacher_details'])[1]"));
		String KarthikeyanActivityText = KarthikeyanActivityHeading.getText();
		System.out.println("Activity Content: " + KarthikeyanActivityText);
	
		try {
			Thread.sleep(2000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
		// Scroll down gradually
		slowScrollDown(driver, js);
	
	
		// Click on the right arrow to navigate to the next month
		WebElement rightArrow1 = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		rightArrow1.click();
  
  
		try {
			Thread.sleep(2000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
  
  
		// Click on the date (June 11)
		WebElement June13 = driver.findElement(By.xpath("//span[normalize-space()='13']"));
		June13.click();
  
  
		// Wait for the available times to be displayed
		WebDriverWait wait5= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement availableTime1 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("li")));

		// Click on the available time
		availableTime1.click();
  
  
		// Find the Enroll Button
		WebElement EnrollButton1 = driver.findElement(By.xpath("//button[normalize-space()='Enroll']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", EnrollButton1);
		System.out.println("Clicked the Enroll Button 1");
	 
  
		// Wait for the popup form to be displayed
		wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
  
  
		WebElement CancelButton1 = driver.findElement(By.xpath("//button[normalize-space()='×']"));
		CancelButton1.click();
  
  
		driver.navigate().back();
  
  
		// Scroll down gradually
		slowScrollDown(driver, js);

  
		// Find the Free Trial Button
		WebElement FreeTrialButton1 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Book a free trial'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", FreeTrialButton1);
		System.out.println("Clicked the Free trial Button");
	
		// Wait for the popup form to be displayed
		WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popupForm1 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));

		// Find the email input field and send email button
		WebElement emailInput1 = popupForm1.findElement(By.className("swal2-input"));
		WebElement sendEmailButton1 = popupForm1.findElement(By.xpath("//button[normalize-space()='Send Email']"));
  

		// Enter an empty email ID
		emailInput1.sendKeys("");
  
		try {
			Thread.sleep(2000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Click the send email button
		sendEmailButton1.click();
  
		try {
			Thread.sleep(2000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		// Wait for the error message to be displayed in the email input field
//		WebElement errorMessage1 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//
//		// Print the error message text
//		System.out.println("Error message displayed: " + errorMessage1.getText());
//  
//		WebElement OkButton1 = popupForm1.findElement(By.linkText("OK"));
//		OkButton1.click();  
		
		
		
		


	     	
	     	
      
      }
		
	
	// Function to perform a slow scroll down
    public static void slowScrollDown(WebDriver driver, JavascriptExecutor js) {
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