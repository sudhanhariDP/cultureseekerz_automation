package userpage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver = null;
	
	public HomePage(RemoteWebDriver driver10) {
		this.driver= driver10;
	}
	
	public void HomePageValidation() {
		
		driver.get("https://cultureseekerz.com/");
		
		
//		// Locate the slide show element
//        WebElement slideshow = driver.findElement(By.xpath("//img[@alt='Slide Image']"));
//
//        // Extract image elements within the slide show
//        List<WebElement> images = slideshow.findElements(By.tagName("img"));
//
//        // Validate each image URL
//        for (WebElement image : images) {
//            String imageURL = image.getAttribute("src");
//            if (isValidImageURL(imageURL)) {
//                System.out.println("Image URL is valid: " + imageURL);
//            } else {
//                System.out.println("Image URL is invalid or inaccessible: " + imageURL);
//            }
//        }
        
        
        
		// Define XPaths for the three types of slideshow images
        String[] slideshowXPaths = {
            "//img[@src='https://culture-seekerz.s3.ap-south-1.amazonaws.com/media/homepage1.jpg']",
            "//img[@src='https://culture-seekerz.s3.ap-south-1.amazonaws.com/media/homepage2.jpg']",
            "//img[@src='https://culture-seekerz.s3.ap-south-1.amazonaws.com/media/homepage5.png']"
        };

        // Iterate through each type of slideshow images
        for (int i = 0; i < slideshowXPaths.length; i++) {
            // Get all image elements of the current type
            List<WebElement> images = driver.findElements(By.xpath(slideshowXPaths[i]));

            // Validate each image of the current type
            for (int j = 0; j < images.size(); j++) {
                WebElement image = images.get(j);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOf(image));

                // Validate if image is displayed
                if (image.isDisplayed()) {
                    System.out.println("Slideshow type " + (i + 1) + ", Image " + (j + 1) + " is validating correctly.");
                } else {
                    System.out.println("Slideshow type " + (i + 1) + ", Image " + (j + 1) + " is not displayed correctly.");
                }
            }
        }
        
        
     // Wait for the page to load
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Create JavaScriptExecutor interface object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down gradually
        slowScrollDown(driver, js);
        
//     // Scroll to the top of the page
//        scrollToTop(js);
        
        
        
        //Heading Content
	  	WebElement HeadingElement= driver.findElement(By.xpath("//div[@class='header_activity']"));
		String HeadingText = HeadingElement.getText();
		System.out.println("Text Content: " + HeadingText);
		js.executeScript("arguments[0].scrollIntoView();", HeadingElement);
		
		try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		
		//Navigation for tamil activity
		WebElement TamilIcon=driver.findElement(By.xpath("//div[@class='activity_icons']//div[1]//a[1]//div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", TamilIcon);
  	    System.out.println("Clicked the Tamil Icon Link");

        // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
  	    
  	    
  	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
  	  
  	  
  	    //Navigation for telugu activity
  	  	driver.navigate().back();
  	  
  	    
  	    WebElement TeluguIcon=driver.findElement(By.xpath("(//div[@class='icon tamil_icon'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", TeluguIcon);
	    System.out.println("Clicked the Telugu Icon Link");
	    
        // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    //Navigation for bible activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement BibleIcon=driver.findElement(By.xpath("//div[@class='bible_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", BibleIcon);
	    System.out.println("Clicked the Bible Icon Link");

        // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for carnatic activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement CarnaticIcon=driver.findElement(By.xpath("//div[@class='carnatic_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", CarnaticIcon);
	    System.out.println("Clicked the Carnatic Icon Link");

        // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for Shloka activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement ShlokaIcon=driver.findElement(By.xpath("//div[@class='sloga_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ShlokaIcon);
	    System.out.println("Clicked the Shloka Icon Link");
	    
        // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for chess activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement ChessIcon=driver.findElement(By.xpath("//div[@class='icon chess_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ChessIcon);
	    System.out.println("Clicked the Chess Icon Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for programming activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement ProgrammingIcon=driver.findElement(By.xpath("//div[@class='programming_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ProgrammingIcon);
	    System.out.println("Clicked the Programming Icon Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for maths activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement MathsIcon=driver.findElement(By.xpath("//div[@class='maths_icon']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", MathsIcon);
	    System.out.println("Clicked the Maths Icon Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for science activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement ScienceIcon=driver.findElement(By.xpath("//div[9]//a[1]//div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ScienceIcon);
	    System.out.println("Clicked the Science Icon Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    //Navigation for yoga activity
	    driver.navigate().back();
  	  
  	    
  	    WebElement YogaIcon=driver.findElement(By.xpath("//div[10]//a[1]//div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", YogaIcon);
	    System.out.println("Clicked the Yoga Icon Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
     // Scroll to the top of the page
        scrollToTop(js);
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
        
	    driver.navigate().back();
	    
		
		//Heading2 Content
	  	WebElement HeadingElement2= driver.findElement(By.xpath("//p[normalize-space()='Discover Courses Suitable for All Age Ranges']"));
		String HeadingText2 = HeadingElement2.getText();
		System.out.println("Text2 Content: " + HeadingText2);
		js.executeScript("arguments[0].scrollIntoView();", HeadingElement2);
		
		
		WebElement KGAndElementaryImage=driver.findElement(By.xpath("//div[@routerlink='/trailclass']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", KGAndElementaryImage);
	    System.out.println("Clicked the KG and Elementary School image Link");
	    
	    // Scroll down gradually
        slowScrollDown(driver, js);
        
        // Scroll to the top of the page
        scrollToTop(js);
        
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    
	    
		driver.navigate().back();
	    
	    
	    WebElement MiddleSchoolImage=driver.findElement(By.xpath("//img[@src='https://culture-seekerz.s3.ap-south-1.amazonaws.com/media/homepage5.png']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", MiddleSchoolImage);
	    System.out.println("Clicked the Middle School image Link");
	    
	 // Scroll down gradually
        slowScrollDown(driver, js);
        
        // Scroll to the top of the page
        scrollToTop(js);
        
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    driver.navigate().back();
	    
	    
	    WebElement HighSchoolImage=driver.findElement(By.xpath("//img[@src='https://culture-seekerz.s3.ap-south-1.amazonaws.com/media/homepage4.png']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", HighSchoolImage);
	    System.out.println("Clicked the High School image Link");
		
	 // Scroll down gradually
        slowScrollDown(driver, js);
        
        // Scroll to the top of the page
        scrollToTop(js);
        
	    
	    try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	    
	    driver.navigate().back();
	    
		
		//Heading3 Content
	  	WebElement HeadingElement3= driver.findElement(By.className("difference_full_container"));
		String HeadingText3 = HeadingElement3.getText();
		System.out.println("Text3 Content: " + HeadingText3);
		js.executeScript("arguments[0].scrollIntoView();", HeadingElement3);
		
		try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		
		//Heading4 Content
	  	WebElement HeadingElement4= driver.findElement(By.xpath("//p[contains(text(),'Explore fantastic teachers and engaging courses ta')]"));
		String HeadingText4 = HeadingElement4.getText();
		System.out.println("Text4 Content: " + HeadingText4);
		js.executeScript("arguments[0].scrollIntoView();", HeadingElement4);
		
		
		//Heading5 Content
	  	WebElement HeadingElement5= driver.findElement(By.className("all_teacher_slide_container"));
		String HeadingText5 = HeadingElement5.getText();
		System.out.println("Text5 Content: " + HeadingText5);
		
		
		// Verify the image
		WebElement FtImage = driver.findElement(By.cssSelector(".free_trial_class2"));
		if (FtImage.isDisplayed()) {
          System.out.println("Image is displayed correctly.");
		} else {
			System.out.println("Image is not displayed.");
		}

		
		try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		//Heading6 Content
	  	WebElement HeadingElement6= driver.findElement(By.className("free_trial_class_container_wrap"));
		String HeadingText6 = HeadingElement6.getText();
		System.out.println("Text6 Content: " + HeadingText6);
		js.executeScript("arguments[0].scrollIntoView();", HeadingElement6);
		

		
////		WebElement ButtonLink=driver.findElement(By.xpath("//button[normalize-space()='Book a Free Trial']"));
////		ButtonLink.click();
		
		
		//CLicking Login Link
        WebElement ButtonLink = driver.findElement(By.xpath("//button[normalize-space()='Book a Free Trial']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ButtonLink);
  	    System.out.println("Clicked the Button Link");
  	    
  	    
  	    driver.navigate().back();
  	    
  	    
//  	//Heading7 Content
//	  	WebElement HeadingElement7= driver.findElement(By.xpath("//div[@class='div2 ng-tns-c4152791097-18']"));
//		String HeadingText7 = HeadingElement7.getText();
//		System.out.println("Text7 Content: " + HeadingText7);
  	    
  	    
  	    
//  	    //Heading5 Content
//	  	WebElement HeadingElement5= driver.findElement(By.cssSelector("div1"));
//		String HeadingText5 = HeadingElement5.getText();
//		System.out.println("Text5 Content: " + HeadingText5);
//		driver.switchTo().frame(HeadingElement5);
  	    
		
//  	    	// Chitra Devi's profile
//  	    	// Verify the image
//  			WebElement TeacherImage = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[1]"));
//  			if (TeacherImage.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading7 Content
//  		  	WebElement HeadingElement7= driver.findElement(By.xpath("//p[normalize-space()='Chitra Devi P']"));
//  			String HeadingText7 = HeadingElement7.getText();
//  			System.out.println("Text7 Content: " + HeadingText7);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink = driver.findElement(By.xpath("//body[1]/app-root[1]/app-user-home-page[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/a[1]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink);
//    	    System.out.println("Clicked the Read More Link");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement = driver.findElement(By.xpath("(//p[contains(text(),\"I'm Chitra Devi, with 26 years immersed in Tamil e\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph = paragraphElement.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink);
//    	    System.out.println("Clicked the Read Less Link");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement2 = driver.findElement(By.xpath("(//p[contains(text(),\"I'm Chitra Devi, with 26 years immersed in Tamil e\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph = paragraphElement2.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement= driver.findElement(By.xpath("(//span[normalize-space()='Tamil'])[1]"));
//  			String TamilHeadingText= TamilHeadingElement.getText();
//  			System.out.println("Text Content: " + TamilHeadingText);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[1]"));
//  			String HourHeadingText= HourHeadingElement.getText();
//  			System.out.println("Text Content: " + HourHeadingText);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement= driver.findElement(By.xpath("//span[normalize-space()='26 Years']"));
//  			String ExperienceHeadingText= ExperienceHeadingElement.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement= driver.findElement(By.xpath("(//span[normalize-space()='Mon - Fri'])[1]"));
//  			String TimeTableHeadingText= TimeTableHeadingElement.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement= driver.findElement(By.xpath("//span[normalize-space()='High']"));
//  			String StandardHeadingText= StandardHeadingElement.getText();
//  			System.out.println("Text Content: " + StandardHeadingText);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[1]"));
//  			String PaymentHeadingText= PaymentHeadingElement.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText);
  				        
  	        
////  	        //Heading7 Content
////  		  	WebElement HeadingElement8= driver.findElement(By.xpath("(//div[@class='subject_item1 ng-tns-c1994469476-0'])[1]"));
////  			String HeadingText8 = HeadingElement8.getText();
////  			System.out.println("Text6 Content: " + HeadingText8);
//  			
//  	        
//  	        // Bharathi's profile
//  	    	// Verify the image
//  			WebElement TeacherImage2 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[2]"));
//  			if (TeacherImage2.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading8 Content
//  		  	WebElement HeadingElement8= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-user-home-page[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/p[1]"));
//  			String HeadingText8 = HeadingElement8.getText();
//  			System.out.println("Text8 Content: " + HeadingText8);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink2 = driver.findElement(By.xpath("//div[2]//div[1]//div[4]//a[1]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink2);
//    	    System.out.println("Clicked the Read More Link 2");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement3 = driver.findElement(By.xpath("//p[contains(text(),'I am Bharathi, adorned with more than two score an')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph2 = paragraphElement3.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph2);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink2 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink2);
//    	    System.out.println("Clicked the Read Less Link 2");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement4 = driver.findElement(By.xpath("//p[contains(text(),'I am Bharathi, adorned with more than two score an')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph2 = paragraphElement4.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph2);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement2= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[2]"));
//  			String TamilHeadingText2= TamilHeadingElement2.getText();
//  			System.out.println("Text Content: " + TamilHeadingText2);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement2= driver.findElement(By.xpath("//div[2]//div[1]//div[5]"));
//  			String HourHeadingText2= HourHeadingElement2.getText();
//  			System.out.println("Text Content: " + HourHeadingText2);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement2= driver.findElement(By.xpath("//span[normalize-space()='22 Years']"));
//  			String ExperienceHeadingText2= ExperienceHeadingElement2.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText2);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement2= driver.findElement(By.xpath("//span[normalize-space()='Tue, Thu, Sat']"));
//  			String TimeTableHeadingText2= TimeTableHeadingElement2.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText2);
//  			
//  		//Heading for Standard Content
//  		  	WebElement StandardHeadingElement2= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[1]"));
//  			String StandardHeadingText2= StandardHeadingElement2.getText();
//  			System.out.println("Text Content: " + StandardHeadingText2);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement2= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[1]"));
//  			String PaymentHeadingText2= PaymentHeadingElement2.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText2);
//  	        
//  	        
//  	        // Padmavathi's profile
//  	    	// Verify the image
//  			WebElement TeacherImage3 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[3]"));
//  			if (TeacherImage3.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading9 Content
//  		  	WebElement HeadingElement9= driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-user-home-page:nth-child(2) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)"));
//  			String HeadingText9 = HeadingElement9.getText();
//  			System.out.println("Text9 Content: " + HeadingText9);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink3 = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[3]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink3);
//    	    System.out.println("Clicked the Read More Link 3");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement5 = driver.findElement(By.xpath("//p[contains(text(),'I am Padmavathi, humbly adorned with three decades')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph3 = paragraphElement5.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph3);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink3 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink3);
//    	    System.out.println("Clicked the Read Less Link 3");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement6 = driver.findElement(By.xpath("//p[contains(text(),'I am Padmavathi, humbly adorned with three decades')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph3 = paragraphElement6.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph3);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement3= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[3]"));
//  			String TamilHeadingText3= TamilHeadingElement3.getText();
//  			System.out.println("Text Content: " + TamilHeadingText3);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement3= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[3]"));
//  			String HourHeadingText3= HourHeadingElement3.getText();
//  			System.out.println("Text Content: " + HourHeadingText3);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement3= driver.findElement(By.xpath("//span[normalize-space()='29 Years']"));
//  			String ExperienceHeadingText3= ExperienceHeadingElement3.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText3);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement3= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[2]"));
//  			String TimeTableHeadingText3= TimeTableHeadingElement3.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText3);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement3= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[1]"));
//  			String StandardHeadingText3= StandardHeadingElement3.getText();
//  			System.out.println("Text Content: " + StandardHeadingText3);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement3= driver.findElement(By.xpath("(//div)[151]"));
//  			String PaymentHeadingText3= PaymentHeadingElement3.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText3);    
//  	        
//  	        
//  	   // Pushpa's profile
//  	    	// Verify the image
//  			WebElement TeacherImage4 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[4]"));
//  			if (TeacherImage4.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading10 Content
//  		  	WebElement HeadingElement10= driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-user-home-page:nth-child(2) > div:nth-child(2) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)"));
//  			String HeadingText10 = HeadingElement10.getText();
//  			System.out.println("Text10 Content: " + HeadingText10);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink4 = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[4]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink4);
//    	    System.out.println("Clicked the Read More Link 4");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement7 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-user-home-page[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph4 = paragraphElement7.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph4);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink4 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink4);
//    	    System.out.println("Clicked the Read Less Link 4");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement8 = driver.findElement(By.xpath("(//p[contains(text(),'I am Pushpa, immersed in the eternal embrace of th')])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph4 = paragraphElement8.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph4);
//  	        
//  	        
//  	    //Heading for shloka activity Content
//  		  	WebElement TamilHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'Shloka')])[1]"));
//  			String TamilHeadingText4= TamilHeadingElement4.getText();
//  			System.out.println("Text Content: " + TamilHeadingText4);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[4]"));
//  			String HourHeadingText4= HourHeadingElement4.getText();
//  			System.out.println("Text Content: " + HourHeadingText4);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'1 Year')])[1]"));
//  			String ExperienceHeadingText4= ExperienceHeadingElement4.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText4);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Wed')])[1]"));
//  			String TimeTableHeadingText4= TimeTableHeadingElement4.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText4);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[2]"));
//  			String StandardHeadingText4= StandardHeadingElement4.getText();
//  			System.out.println("Text Content: " + StandardHeadingText4);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement4= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[1]"));
//  			String PaymentHeadingText4= PaymentHeadingElement4.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText4);      
//  	        
//  	        
//  	        
//  	   // Karthikeyan's profile
//  	    	// Verify the image
//  			WebElement TeacherImage5 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[5]"));
//  			if (TeacherImage5.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading11 Content
//  		  	WebElement HeadingElement11= driver.findElement(By.xpath("//p[normalize-space()='Karthikeyan L']"));
//  			String HeadingText11 = HeadingElement11.getText();
//  			System.out.println("Text11 Content: " + HeadingText11);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink5 = driver.findElement(By.xpath("(//a[normalize-space()='Read more..'])[5]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink5);
//    	    System.out.println("Clicked the Read More Link 5");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement9 = driver.findElement(By.xpath("//body[1]/app-root[1]/app-user-home-page[1]/div[1]/div[7]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph5 = paragraphElement9.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph5);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink5 = driver.findElement(By.xpath("(//a[normalize-space()='Read less'])[1]")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink5);
//    	    System.out.println("Clicked the Read Less Link 5");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement10 = driver.findElement(By.xpath("(//div)[182]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph5 = paragraphElement10.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph5);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement5= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[4]"));
//  			String TamilHeadingText5= TamilHeadingElement5.getText();
//  			System.out.println("Text Content: " + TamilHeadingText5);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement5= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[5]"));
//  			String HourHeadingText5= HourHeadingElement5.getText();
//  			System.out.println("Text Content: " + HourHeadingText5);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement5= driver.findElement(By.xpath("//span[normalize-space()='6 Years']"));
//  			String ExperienceHeadingText5= ExperienceHeadingElement5.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText5);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement5= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Sat')])[1]"));
//  			String TimeTableHeadingText5= TimeTableHeadingElement5.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText5);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement5= driver.findElement(By.xpath("//span[normalize-space()='Middle,High']"));
//  			String StandardHeadingText5= StandardHeadingElement5.getText();
//  			System.out.println("Text Content: " + StandardHeadingText5);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement5= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[3]"));
//  			String PaymentHeadingText5= PaymentHeadingElement5.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText5);
//  			
//  			
//  			
//  		// Shiyam's profile
//  	    	// Verify the image
//  			WebElement TeacherImage6 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[6]"));
//  			if (TeacherImage6.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading11 Content
//  		  	WebElement HeadingElement12= driver.findElement(By.xpath("//p[normalize-space()='Shiyam V']"));
//  			String HeadingText12 = HeadingElement12.getText();
//  			System.out.println("Text12 Content: " + HeadingText12);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink6 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[6]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink6);
//    	    System.out.println("Clicked the Read More Link 6");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement11 = driver.findElement(By.xpath("//p[contains(text(),'In the realm of programming, I')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph6 = paragraphElement11.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph6);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink6 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink6);
//    	    System.out.println("Clicked the Read Less Link 6");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement12 = driver.findElement(By.xpath("//p[contains(text(),'In the realm of programming, I')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph6 = paragraphElement12.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph6);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement6= driver.findElement(By.xpath("(//span[contains(text(),'Programming')])[1]"));
//  			String TamilHeadingText6= TamilHeadingElement6.getText();
//  			System.out.println("Text Content: " + TamilHeadingText6);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement6= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[6]"));
//  			String HourHeadingText6= HourHeadingElement6.getText();
//  			System.out.println("Text Content: " + HourHeadingText6);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement6= driver.findElement(By.xpath("(//span[contains(text(),'3 Years')])[1]"));
//  			String ExperienceHeadingText6= ExperienceHeadingElement6.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText6);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement6= driver.findElement(By.xpath("//span[normalize-space()='Mon, Tue, Sat']"));
//  			String TimeTableHeadingText6= TimeTableHeadingElement6.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText6);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement6= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[2]"));
//  			String StandardHeadingText6= StandardHeadingElement6.getText();
//  			System.out.println("Text Content: " + StandardHeadingText6);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement6= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[4]"));
//  			String PaymentHeadingText6= PaymentHeadingElement6.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText6);
//  			
//  			
//  		// Nivodhini's profile
//  	    	// Verify the image
//  			WebElement TeacherImage7 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[7]"));
//  			if (TeacherImage7.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading11 Content
//  		  	WebElement HeadingElement13= driver.findElement(By.xpath("//p[normalize-space()='Nivodhini M K']"));
//  			String HeadingText13 = HeadingElement13.getText();
//  			System.out.println("Text13 Content: " + HeadingText13);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink7 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[7]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink7);
//    	    System.out.println("Clicked the Read More Link 7");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement13 = driver.findElement(By.xpath("//p[contains(text(),'Within the intricate web of programming, I am Nivo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph7 = paragraphElement13.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph7);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink7 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink7);
//    	    System.out.println("Clicked the Read Less Link 7");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement14 = driver.findElement(By.xpath("//p[contains(text(),'Within the intricate web of programming, I am Nivo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph7 = paragraphElement14.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph7);
//  	        
//  	        
//  	    //Heading for programming activity Content
//  		  	WebElement TamilHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'Programming')])[2]"));
//  			String TamilHeadingText7= TamilHeadingElement7.getText();
//  			System.out.println("Text Content: " + TamilHeadingText7);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[7]"));
//  			String HourHeadingText7= HourHeadingElement7.getText();
//  			System.out.println("Text Content: " + HourHeadingText7);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'10 Years')])[1]"));
//  			String ExperienceHeadingText7= ExperienceHeadingElement7.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText7);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[3]"));
//  			String TimeTableHeadingText7= TimeTableHeadingElement7.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText7);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[4]"));
//  			String StandardHeadingText7= StandardHeadingElement7.getText();
//  			System.out.println("Text Content: " + StandardHeadingText7);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement7= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[2]"));
//  			String PaymentHeadingText7= PaymentHeadingElement7.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText7);
//  			
//
//  			
//  		// Akshaya's profile
//  	    	// Verify the image
//  			WebElement TeacherImage8 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[8]"));
//  			if (TeacherImage8.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading14 Content
//  		  	WebElement HeadingElement14= driver.findElement(By.xpath("//p[normalize-space()='Akshaya M']"));
//  			String HeadingText14 = HeadingElement14.getText();
//  			System.out.println("Text14 Content: " + HeadingText14);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink8 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[8]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink8);
//    	    System.out.println("Clicked the Read More Link 8");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement15 = driver.findElement(By.xpath("//p[contains(text(),'As an ardent enthusiast of the spiritual and philo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph8 = paragraphElement15.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph8);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink8 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink8);
//    	    System.out.println("Clicked the Read Less Link 8");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement16 = driver.findElement(By.xpath("//p[contains(text(),'As an ardent enthusiast of the spiritual and philo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph8 = paragraphElement16.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph8);
//  	        
//  	        
//  	    //Heading for shloka activity Content
//  		  	WebElement TamilHeadingElement8= driver.findElement(By.xpath("(//span[contains(text(),'Shloka')])[2]"));
//  			String TamilHeadingText8= TamilHeadingElement8.getText();
//  			System.out.println("Text Content: " + TamilHeadingText8);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement8= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[8]"));
//  			String HourHeadingText8= HourHeadingElement8.getText();
//  			System.out.println("Text Content: " + HourHeadingText8);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement8= driver.findElement(By.xpath("(//span[contains(text(),'1 Year')])[2]"));
//  			String ExperienceHeadingText8= ExperienceHeadingElement8.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText8);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement8= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[4]"));
//  			String TimeTableHeadingText8= TimeTableHeadingElement8.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText8);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement8= driver.findElement(By.xpath("(//div)[273]"));
//  			String StandardHeadingText8= StandardHeadingElement8.getText();
//  			System.out.println("Text Content: " + StandardHeadingText8);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement8= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[3]"));
//  			String PaymentHeadingText8= PaymentHeadingElement8.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText8);
//
//  			
//  		// Paranthaman's profile
//  	    	// Verify the image
//  			WebElement TeacherImage9 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[9]"));
//  			if (TeacherImage9.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement15= driver.findElement(By.xpath("//p[normalize-space()='Paranthaman S']"));
//  			String HeadingText15 = HeadingElement15.getText();
//  			System.out.println("Text15 Content: " + HeadingText15);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink9 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[9]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink9);
//    	    System.out.println("Clicked the Read More Link 9");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement17 = driver.findElement(By.xpath("//p[contains(text(),'I am Paranthaman, tirelessly committed to shaping ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph9 = paragraphElement17.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph9);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink9 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink9);
//    	    System.out.println("Clicked the Read Less Link 9");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement18 = driver.findElement(By.xpath("//p[contains(text(),'I am Paranthaman, tirelessly committed to shaping ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph9 = paragraphElement18.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph9);
//  	        
//  	        
//  	    //Heading for shloka activity Content
//  		  	WebElement TamilHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[5]"));
//  			String TamilHeadingText9= TamilHeadingElement9.getText();
//  			System.out.println("Text Content: " + TamilHeadingText9);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[9]"));
//  			String HourHeadingText9= HourHeadingElement9.getText();
//  			System.out.println("Text Content: " + HourHeadingText9);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'20 Years')])[1]"));
//  			String ExperienceHeadingText9= ExperienceHeadingElement9.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText9);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[5]"));
//  			String TimeTableHeadingText9= TimeTableHeadingElement9.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText9);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[3]"));
//  			String StandardHeadingText9= StandardHeadingElement9.getText();
//  			System.out.println("Text Content: " + StandardHeadingText9);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement9= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[5]"));
//  			String PaymentHeadingText9= PaymentHeadingElement9.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText9);
//  			
//  			
//  			
//  		// Sobha Venkitesh's profile
//  	    	// Verify the image
//  			WebElement TeacherImage10 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[10]"));
//  			if (TeacherImage10.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement16= driver.findElement(By.xpath("//p[normalize-space()='Sobha Venkitesh']"));
//  			String HeadingText16 = HeadingElement16.getText();
//  			System.out.println("Text16 Content: " + HeadingText16);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink10 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[10]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink10);
//    	    System.out.println("Clicked the Read More Link 10");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement19 = driver.findElement(By.xpath("//p[contains(text(),'Embarking on a celestial odyssey through the capti')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph10 = paragraphElement19.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph10);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink10 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink10);
//    	    System.out.println("Clicked the Read Less Link 10");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement20 = driver.findElement(By.xpath("//p[contains(text(),'Embarking on a celestial odyssey through the capti')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph10 = paragraphElement20.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph10);
//  	        
//  	        
//  	    //Heading for shloka activity Content
//  		  	WebElement TamilHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'Shloga')])[3]"));
//  			String TamilHeadingText10= TamilHeadingElement10.getText();
//  			System.out.println("Text Content: " + TamilHeadingText10);
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[10]"));
//  			String HourHeadingText10= HourHeadingElement10.getText();
//  			System.out.println("Text Content: " + HourHeadingText10);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'4 Years')])[1]"));
//  			String ExperienceHeadingText10= ExperienceHeadingElement10.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText10);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[6]"));
//  			String TimeTableHeadingText10= TimeTableHeadingElement10.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText10);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[4]"));
//  			String StandardHeadingText10= StandardHeadingElement10.getText();
//  			System.out.println("Text Content: " + StandardHeadingText10);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement10= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[6]"));
//  			String PaymentHeadingText10= PaymentHeadingElement10.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText10);
//  			
//  			
//  		// Shek Showkath's profile
//  	    	// Verify the image
//  			WebElement TeacherImage11 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[11]"));
//  			if (TeacherImage11.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement17= driver.findElement(By.xpath("//p[normalize-space()='shek showkath']"));
//  			String HeadingText17 = HeadingElement17.getText();
//  			System.out.println("Text17 Content: " + HeadingText17);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink11 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[11]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink11);
//    	    System.out.println("Clicked the Read More Link 11");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement21 = driver.findElement(By.xpath("//p[normalize-space()='good boy']")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph11 = paragraphElement21.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph11);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink11 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink11);
//    	    System.out.println("Clicked the Read Less Link 11");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement22 = driver.findElement(By.xpath("//p[normalize-space()='good boy']")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph11 = paragraphElement22.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph11);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement11= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[6]"));
//  			String TamilHeadingText11= TamilHeadingElement11.getText();
//  			System.out.println("Text Content: " + TamilHeadingText11);
//  			
//  		//Heading for programming activity Content
//  		  	WebElement TamilHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'Programming')])[3]"));
//  			String TamilHeadingText12= TamilHeadingElement12.getText();
//  			System.out.println("Text Content: " + TamilHeadingText12);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement11= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[11]"));
//  			String HourHeadingText11= HourHeadingElement11.getText();
//  			System.out.println("Text Content: " + HourHeadingText11);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement11= driver.findElement(By.xpath("(//span[normalize-space()='20'])[2]"));
//  			String ExperienceHeadingText11= ExperienceHeadingElement11.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText11);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement11= driver.findElement(By.xpath("//span[normalize-space()='Tue, Fri']"));
//  			String TimeTableHeadingText11= TimeTableHeadingElement11.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText11);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement11= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[8]"));
//  			String StandardHeadingText11= StandardHeadingElement11.getText();
//  			System.out.println("Text Content: " + StandardHeadingText11);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement11= driver.findElement(By.xpath("//span[normalize-space()='100']"));
//  			String PaymentHeadingText11= PaymentHeadingElement11.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText11);
//  			
//  			
//  			
//  		// Varsha's profile
//  	    	// Verify the image
//  			WebElement TeacherImage12 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[12]"));
//  			if (TeacherImage12.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement18= driver.findElement(By.xpath("//p[normalize-space()='Varsha V']"));
//  			String HeadingText18 = HeadingElement18.getText();
//  			System.out.println("Text17 Content: " + HeadingText18);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink12 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[12]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink12);
//    	    System.out.println("Clicked the Read More Link 12");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement23 = driver.findElement(By.xpath("//p[contains(text(),'I am Varsha, an enthusiast with a passion for both')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph12 = paragraphElement23.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph12);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink12 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink12);
//    	    System.out.println("Clicked the Read Less Link 12");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement24 = driver.findElement(By.xpath("//p[contains(text(),'I am Varsha, an enthusiast with a passion for both')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph12 = paragraphElement24.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph12);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement13= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[7]"));
//  			String TamilHeadingText13= TamilHeadingElement13.getText();
//  			System.out.println("Text Content: " + TamilHeadingText13);
//  			
//  		//Heading for science activity Content
//  		  	WebElement TamilHeadingElement14= driver.findElement(By.xpath("(//span[contains(text(),'Science')])[1]"));
//  			String TamilHeadingText14= TamilHeadingElement14.getText();
//  			System.out.println("Text Content: " + TamilHeadingText14);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[12]"));
//  			String HourHeadingText12= HourHeadingElement12.getText();
//  			System.out.println("Text Content: " + HourHeadingText12);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'2 Years')])[2]"));
//  			String ExperienceHeadingText12= ExperienceHeadingElement12.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText12);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Thu')])[1]"));
//  			String TimeTableHeadingText12= TimeTableHeadingElement12.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText12);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[7]"));
//  			String StandardHeadingText12= StandardHeadingElement12.getText();
//  			System.out.println("Text Content: " + StandardHeadingText12);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement12= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[2]"));
//  			String PaymentHeadingText12= PaymentHeadingElement12.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText12);
//  			
//  			
//  		// Shobana R's profile
//  	    	// Verify the image
//  			WebElement TeacherImage13 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[13]"));
//  			if (TeacherImage13.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement19= driver.findElement(By.xpath("//p[normalize-space()='Shobana R']"));
//  			String HeadingText19 = HeadingElement19.getText();
//  			System.out.println("Text17 Content: " + HeadingText19);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink13 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[13]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink13);
//    	    System.out.println("Clicked the Read More Link 13");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement25 = driver.findElement(By.xpath("//p[contains(text(),'I am Shobana, an experienced practitioner with a l')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph13 = paragraphElement25.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph13);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink13 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink13);
//    	    System.out.println("Clicked the Read Less Link 13");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement26 = driver.findElement(By.xpath("//p[contains(text(),'I am Shobana, an experienced practitioner with a l')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph13 = paragraphElement26.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph13);
//  	        
//  	        
//  	    //Heading for carnatic activity Content
//  		  	WebElement TamilHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'Carnatic')])[1]"));
//  			String TamilHeadingText15= TamilHeadingElement15.getText();
//  			System.out.println("Text Content: " + TamilHeadingText15);
//  			
//  		//Heading for shloka activity Content
//  		  	WebElement TamilHeadingElement16= driver.findElement(By.xpath("(//span[contains(text(),'Shloka')])[4]"));
//  			String TamilHeadingText16= TamilHeadingElement16.getText();
//  			System.out.println("Text Content: " + TamilHeadingText16);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement13= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[13]"));
//  			String HourHeadingText13= HourHeadingElement13.getText();
//  			System.out.println("Text Content: " + HourHeadingText13);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement13= driver.findElement(By.xpath("//span[normalize-space()='28 Years']"));
//  			String ExperienceHeadingText13= ExperienceHeadingElement13.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText13);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement13= driver.findElement(By.xpath("//span[normalize-space()='Tue']"));
//  			String TimeTableHeadingText13= TimeTableHeadingElement13.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText13);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement13= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[9]"));
//  			String StandardHeadingText13= StandardHeadingElement13.getText();
//  			System.out.println("Text Content: " + StandardHeadingText13);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement13= driver.findElement(By.xpath("//span[normalize-space()='123']"));
//  			String PaymentHeadingText13= PaymentHeadingElement13.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText13);
//  			
//  			
//  		// Meera Ganapathy Raman's profile
//  	    	// Verify the image
//  			WebElement TeacherImage14 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[14]"));
//  			if (TeacherImage14.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement20= driver.findElement(By.xpath("//p[normalize-space()='Meera Ganapathy Raman']"));
//  			String HeadingText20 = HeadingElement20.getText();
//  			System.out.println("Text20 Content: " + HeadingText20);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink14 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[14]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink14);
//    	    System.out.println("Clicked the Read More Link 14");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement27 = driver.findElement(By.xpath("//p[contains(text(),'I am Meera Ganapathy Raman, a traveler on the melo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph14 = paragraphElement27.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph14);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink14 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink14);
//    	    System.out.println("Clicked the Read Less Link 14");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement28 = driver.findElement(By.xpath("//p[contains(text(),'I am Meera Ganapathy Raman, a traveler on the melo')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph14 = paragraphElement28.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph14);
//  	        
//  	        
//  	    //Heading for carnatic activity Content
//  		  	WebElement TamilHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'Carnatic')])[2]"));
//  			String TamilHeadingText17= TamilHeadingElement17.getText();
//  			System.out.println("Text Content: " + TamilHeadingText17);
//  			
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement14= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[14]"));
//  			String HourHeadingText14= HourHeadingElement14.getText();
//  			System.out.println("Text Content: " + HourHeadingText14);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement14= driver.findElement(By.xpath("//span[normalize-space()='19 Years']"));
//  			String ExperienceHeadingText14= ExperienceHeadingElement14.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText14);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement14= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Thu')])[2]"));
//  			String TimeTableHeadingText14= TimeTableHeadingElement14.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText14);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement14= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle')])[5]"));
//  			String StandardHeadingText14= StandardHeadingElement14.getText();
//  			System.out.println("Text Content: " + StandardHeadingText14);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement14= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[3]"));
//  			String PaymentHeadingText14= PaymentHeadingElement14.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText14);
//  			
//  			
//  		// preethi's profile
//  	    	// Verify the image
//  			WebElement TeacherImage15 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[15]"));
//  			if (TeacherImage15.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading15 Content
//  		  	WebElement HeadingElement21= driver.findElement(By.xpath("//p[normalize-space()='Preethi S']"));
//  			String HeadingText21 = HeadingElement21.getText();
//  			System.out.println("Text21 Content: " + HeadingText21);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink15 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[15]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink15);
//    	    System.out.println("Clicked the Read More Link 15");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement29 = driver.findElement(By.xpath("//p[contains(text(),'I am Preethi, an adept professional with a versati')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph15 = paragraphElement29.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph15);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink15 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink15);
//    	    System.out.println("Clicked the Read Less Link 15");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement30 = driver.findElement(By.xpath("//p[contains(text(),'I am Preethi, an adept professional with a versati')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph15 = paragraphElement30.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph15);
//  	        
//  	        
//  	    //Heading for tamil activity Content
//  		  	WebElement TamilHeadingElement18= driver.findElement(By.xpath("(//span[contains(text(),'Tamil')])[8]"));
//  			String TamilHeadingText18= TamilHeadingElement18.getText();
//  			System.out.println("Text Content: " + TamilHeadingText18);
//  			
//  		//Heading for programming activity Content
//  		  	WebElement TamilHeadingElement19= driver.findElement(By.xpath("(//span[contains(text(),'Programming')])[4]"));
//  			String TamilHeadingText19= TamilHeadingElement19.getText();
//  			System.out.println("Text Content: " + TamilHeadingText19);
//  			
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[15]"));
//  			String HourHeadingText15= HourHeadingElement15.getText();
//  			System.out.println("Text Content: " + HourHeadingText15);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'5 Years')])[1]"));
//  			String ExperienceHeadingText15= ExperienceHeadingElement15.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText15);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Wed')])[2]"));
//  			String TimeTableHeadingText15= TimeTableHeadingElement15.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText15);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[5]"));
//  			String StandardHeadingText15= StandardHeadingElement15.getText();
//  			System.out.println("Text Content: " + StandardHeadingText15);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement15= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[7]"));
//  			String PaymentHeadingText15= PaymentHeadingElement15.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText15);
//
//  			
//  		// Subramanyam's profile
//  	    	// Verify the image
//  			WebElement TeacherImage16 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[16]"));
//  			if (TeacherImage16.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading22 Content
//  		  	WebElement HeadingElement22= driver.findElement(By.xpath("//p[normalize-space()='Subramanyam G']"));
//  			String HeadingText22 = HeadingElement22.getText();
//  			System.out.println("Text22 Content: " + HeadingText22);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink16 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[16]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink16);
//    	    System.out.println("Clicked the Read More Link 16");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement31 = driver.findElement(By.xpath("//p[contains(text(),'I am Gudimetla Subramanyam VN, an esteemed torchbe')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph16 = paragraphElement31.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph16);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink16 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink16);
//    	    System.out.println("Clicked the Read Less Link 16");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement32 = driver.findElement(By.xpath("//p[contains(text(),'I am Gudimetla Subramanyam VN, an esteemed torchbe')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph16 = paragraphElement32.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph16);
//  	        
//  	        
//  	    //Heading for telugu activity Content
//  		  	WebElement TamilHeadingElement20= driver.findElement(By.xpath("(//span[contains(text(),'Telugu')])[1]"));
//  			String TamilHeadingText20= TamilHeadingElement20.getText();
//  			System.out.println("Text Content: " + TamilHeadingText20);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement16= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[16]"));
//  			String HourHeadingText16= HourHeadingElement16.getText();
//  			System.out.println("Text Content: " + HourHeadingText16);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement16= driver.findElement(By.xpath("(//span[contains(text(),'20 Years')])[2]"));
//  			String ExperienceHeadingText16= ExperienceHeadingElement16.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText16);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement16= driver.findElement(By.xpath("//span[normalize-space()='Mon, Wed, Sun']"));
//  			String TimeTableHeadingText16= TimeTableHeadingElement16.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText16);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement16= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[12]"));
//  			String StandardHeadingText16= StandardHeadingElement16.getText();
//  			System.out.println("Text Content: " + StandardHeadingText16);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement16= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[4]"));
//  			String PaymentHeadingText16= PaymentHeadingElement16.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText16);
//  			
//  			
//  		// Shanmuga Priya's profile
//  	    	// Verify the image
//  			WebElement TeacherImage17 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[17]"));
//  			if (TeacherImage17.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading23 Content
//  		  	WebElement HeadingElement23= driver.findElement(By.xpath("//p[normalize-space()='Shanmuga Priya R']"));
//  			String HeadingText23 = HeadingElement23.getText();
//  			System.out.println("Text23 Content: " + HeadingText23);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink17 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[17]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink17);
//    	    System.out.println("Clicked the Read More Link 17");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement33 = driver.findElement(By.xpath("//p[contains(text(),'I am Shanmuga Priya, an orchestrator of scientific')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph17 = paragraphElement33.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph17);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink17 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink17);
//    	    System.out.println("Clicked the Read Less Link 17");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement34 = driver.findElement(By.xpath("//p[contains(text(),'I am Shanmuga Priya, an orchestrator of scientific')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph17 = paragraphElement34.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph17);
//  	        
//  	        
//  	    //Heading for science activity Content
//  		  	WebElement TamilHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'Science')])[2]"));
//  			String TamilHeadingText21= TamilHeadingElement21.getText();
//  			System.out.println("Text Content: " + TamilHeadingText21);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[17]"));
//  			String HourHeadingText17= HourHeadingElement17.getText();
//  			System.out.println("Text Content: " + HourHeadingText17);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'1 Year')])[3]"));
//  			String ExperienceHeadingText17= ExperienceHeadingElement17.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText17);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[7]"));
//  			String TimeTableHeadingText17= TimeTableHeadingElement17.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText17);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle')])[7]"));
//  			String StandardHeadingText17= StandardHeadingElement17.getText();
//  			System.out.println("Text Content: " + StandardHeadingText17);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement17= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[4]"));
//  			String PaymentHeadingText17= PaymentHeadingElement17.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText17);
//  			
//  			
//  		// David Raj's profile
//  	    	// Verify the image
//  			WebElement TeacherImage18 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[18]"));
//  			if (TeacherImage18.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading24 Content
//  		  	WebElement HeadingElement24= driver.findElement(By.xpath("//p[normalize-space()='David Raj V']"));
//  			String HeadingText24 = HeadingElement24.getText();
//  			System.out.println("Text24 Content: " + HeadingText24);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink18 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[18]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink18);
//    	    System.out.println("Clicked the Read More Link 18");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement35 = driver.findElement(By.xpath("//p[contains(text(),'I am David Raj, a wayfarer of the Divine Word, tra')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph18 = paragraphElement35.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph18);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink18 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink18);
//    	    System.out.println("Clicked the Read Less Link 18");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement36 = driver.findElement(By.xpath("//p[contains(text(),'I am David Raj, a wayfarer of the Divine Word, tra')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph18 = paragraphElement36.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph18);
//  	        
//  	        
//  	    //Heading for bible activity Content
//  		  	WebElement TamilHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'Bible')])[1]"));
//  			String TamilHeadingText22= TamilHeadingElement22.getText();
//  			System.out.println("Text Content: " + TamilHeadingText22);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement18= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[18]"));
//  			String HourHeadingText18= HourHeadingElement18.getText();
//  			System.out.println("Text Content: " + HourHeadingText18);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement18= driver.findElement(By.xpath("(//span[contains(text(),'2 Years')])[3]"));
//  			String ExperienceHeadingText18= ExperienceHeadingElement18.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText18);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement18= driver.findElement(By.xpath("//span[normalize-space()='Tue - Thu']"));
//  			String TimeTableHeadingText18= TimeTableHeadingElement18.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText18);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement18= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[14]"));
//  			String StandardHeadingText18= StandardHeadingElement18.getText();
//  			System.out.println("Text Content: " + StandardHeadingText18);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement18= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[5]"));
//  			String PaymentHeadingText18= PaymentHeadingElement18.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText18);
//  			
//  			
//  		// George Samuel's profile
//  	    	// Verify the image
//  			WebElement TeacherImage19 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[19]"));
//  			if (TeacherImage19.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading24 Content
//  		  	WebElement HeadingElement25= driver.findElement(By.xpath("//p[normalize-space()='George Samuel G']"));
//  			String HeadingText25 = HeadingElement25.getText();
//  			System.out.println("Text25 Content: " + HeadingText25);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink19 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[19]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink19);
//    	    System.out.println("Clicked the Read More Link 19");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement37 = driver.findElement(By.xpath("(//p[contains(text(),\"Hello, I'm George Samuel, and I've dedicated the p\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph19 = paragraphElement37.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph19);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink19 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink19);
//    	    System.out.println("Clicked the Read Less Link 19");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement38 = driver.findElement(By.xpath("(//p[contains(text(),\"Hello, I'm George Samuel, and I've dedicated the p\")])[1]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph19 = paragraphElement38.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph19);
//  	        
//  	        
//  	    //Heading for bible activity Content
//  		  	WebElement TamilHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'Bible')])[2]"));
//  			String TamilHeadingText23= TamilHeadingElement23.getText();
//  			System.out.println("Text Content: " + TamilHeadingText23);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement19= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[19]"));
//  			String HourHeadingText19= HourHeadingElement19.getText();
//  			System.out.println("Text Content: " + HourHeadingText19);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement19= driver.findElement(By.xpath("(//span[contains(text(),'10 Years')])[2]"));
//  			String ExperienceHeadingText19= ExperienceHeadingElement19.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText19);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement19= driver.findElement(By.xpath("//span[normalize-space()='Tue - Thu']"));
//  			String TimeTableHeadingText19= TimeTableHeadingElement19.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText19);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement19= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[11]"));
//  			String StandardHeadingText19= StandardHeadingElement19.getText();
//  			System.out.println("Text Content: " + StandardHeadingText19);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement19= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[5]"));
//  			String PaymentHeadingText19= PaymentHeadingElement19.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText19);
//  			
//  			
//  		// Preethi's profile
//  	    	// Verify the image
//  			WebElement TeacherImage20 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[20]"));
//  			if (TeacherImage20.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading24 Content
//  		  	WebElement HeadingElement26= driver.findElement(By.xpath("//p[normalize-space()='Preethi A R']"));
//  			String HeadingText26 = HeadingElement26.getText();
//  			System.out.println("Text26 Content: " + HeadingText26);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink20 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[20]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink20);
//    	    System.out.println("Clicked the Read More Link 20");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement39 = driver.findElement(By.xpath("//p[contains(text(),'I am Preethi, a pilgrim on the path of enlightenme')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph20 = paragraphElement39.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph20);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink20 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink20);
//    	    System.out.println("Clicked the Read Less Link 20");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement40 = driver.findElement(By.xpath("//p[contains(text(),'I am Preethi, a pilgrim on the path of enlightenme')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph20 = paragraphElement40.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph20);
//  	        
//  	        
//  	    //Heading for bible activity Content
//  		  	WebElement TamilHeadingElement25= driver.findElement(By.xpath("(//span[contains(text(),'Bible')])[3]"));
//  			String TamilHeadingText25= TamilHeadingElement25.getText();
//  			System.out.println("Text Content: " + TamilHeadingText25);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement20= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[20]"));
//  			String HourHeadingText20= HourHeadingElement20.getText();
//  			System.out.println("Text Content: " + HourHeadingText20);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement20= driver.findElement(By.xpath("(//span[contains(text(),'3 Years')])[2]"));
//  			String ExperienceHeadingText20= ExperienceHeadingElement20.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText20);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement20= driver.findElement(By.xpath("//span[normalize-space()='Tue - Fri']"));
//  			String TimeTableHeadingText20= TimeTableHeadingElement20.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText20);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement20= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[12]"));
//  			String StandardHeadingText20= StandardHeadingElement20.getText();
//  			System.out.println("Text Content: " + StandardHeadingText20);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement20= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[6]"));
//  			String PaymentHeadingText20= PaymentHeadingElement20.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText20);
//
//  			
//  		// Sunantha's profile
//  	    	// Verify the image
//  			WebElement TeacherImage21 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[21]"));
//  			if (TeacherImage21.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement27= driver.findElement(By.xpath("//p[normalize-space()='Sunantha D']"));
//  			String HeadingText27 = HeadingElement27.getText();
//  			System.out.println("Text27 Content: " + HeadingText27);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink21 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[21]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink21);
//    	    System.out.println("Clicked the Read More Link 21");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement41 = driver.findElement(By.xpath("//p[contains(text(),'Hello, esteemed math enthusiasts! I extend a warm ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph21 = paragraphElement41.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph21);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink21 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink21);
//    	    System.out.println("Clicked the Read Less Link 21");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement42 = driver.findElement(By.xpath("//p[contains(text(),'Hello, esteemed math enthusiasts! I extend a warm ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph21 = paragraphElement42.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph21);
//  	        
//  	        
//  	    //Heading for maths activity Content
//  		  	WebElement TamilHeadingElement26= driver.findElement(By.xpath("(//span[contains(text(),'Maths')])[1]"));
//  			String TamilHeadingText26= TamilHeadingElement26.getText();
//  			System.out.println("Text Content: " + TamilHeadingText26);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[21]"));
//  			String HourHeadingText21= HourHeadingElement21.getText();
//  			System.out.println("Text Content: " + HourHeadingText21);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'2 Years')])[4]"));
//  			String ExperienceHeadingText21= ExperienceHeadingElement21.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText21);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Sat')])[2]"));
//  			String TimeTableHeadingText21= TimeTableHeadingElement21.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText21);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[6]"));
//  			String StandardHeadingText21= StandardHeadingElement21.getText();
//  			System.out.println("Text Content: " + StandardHeadingText21);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement21= driver.findElement(By.xpath("(//span[contains(text(),'9 - 12')])[8]"));
//  			String PaymentHeadingText21= PaymentHeadingElement21.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText21);
//  			
//  		// Aruna Narayanan's profile
//  	    	// Verify the image
//  			WebElement TeacherImage22 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[22]"));
//  			if (TeacherImage22.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement28= driver.findElement(By.xpath("//p[normalize-space()='Aruna Narayanan']"));
//  			String HeadingText28 = HeadingElement28.getText();
//  			System.out.println("Text28 Content: " + HeadingText28);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink22 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[22]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink22);
//    	    System.out.println("Clicked the Read More Link 22");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement43 = driver.findElement(By.xpath("//p[contains(text(),'Hello, esteemed math enthusiasts! I extend a warm ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph22 = paragraphElement43.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph22);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink22 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink22);
//    	    System.out.println("Clicked the Read Less Link 22");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement44 = driver.findElement(By.xpath("//p[contains(text(),'Hello, esteemed math enthusiasts! I extend a warm ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph22 = paragraphElement44.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph22);
//  	        
//  	        
//  	    //Heading for carnatic activity Content
//  		  	WebElement TamilHeadingElement27= driver.findElement(By.xpath("(//span[contains(text(),'Carnatic')])[3]"));
//  			String TamilHeadingText27= TamilHeadingElement27.getText();
//  			System.out.println("Text Content: " + TamilHeadingText27);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[22]"));
//  			String HourHeadingText22= HourHeadingElement22.getText();
//  			System.out.println("Text Content: " + HourHeadingText22);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'15 Years')])[1]"));
//  			String ExperienceHeadingText22= ExperienceHeadingElement22.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText22);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Thu')])[3]"));
//  			String TimeTableHeadingText22= TimeTableHeadingElement22.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText22);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle')])[9]"));
//  			String StandardHeadingText22= StandardHeadingElement22.getText();
//  			System.out.println("Text Content: " + StandardHeadingText22);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement22= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[7]"));
//  			String PaymentHeadingText22= PaymentHeadingElement22.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText22);
//  			
//  		// Devibala's profile
//  	    	// Verify the image
//  			WebElement TeacherImage23 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[23]"));
//  			if (TeacherImage23.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement29= driver.findElement(By.xpath("//p[normalize-space()='Devibala M']"));
//  			String HeadingText29 = HeadingElement29.getText();
//  			System.out.println("Text29 Content: " + HeadingText29);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink23 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[23]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink23);
//    	    System.out.println("Clicked the Read More Link 23");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement45 = driver.findElement(By.xpath("//p[contains(text(),'Hail, seekers of numerical insight! I bid you a he')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph23 = paragraphElement45.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph23);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink23 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink23);
//    	    System.out.println("Clicked the Read Less Link 23");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement46 = driver.findElement(By.xpath("//p[contains(text(),'Hail, seekers of numerical insight! I bid you a he')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph23 = paragraphElement46.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph23);
//  	        
//  	        
//  	    //Heading for maths activity Content
//  		  	WebElement TamilHeadingElement28= driver.findElement(By.xpath("(//span[contains(text(),'Maths')])[2]"));
//  			String TamilHeadingText28= TamilHeadingElement28.getText();
//  			System.out.println("Text Content: " + TamilHeadingText28);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[23]"));
//  			String HourHeadingText23= HourHeadingElement23.getText();
//  			System.out.println("Text Content: " + HourHeadingText23);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'4 Years')])[2]"));
//  			String ExperienceHeadingText23= ExperienceHeadingElement23.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText23);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[8]"));
//  			String TimeTableHeadingText23= TimeTableHeadingElement23.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText23);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[15]"));
//  			String StandardHeadingText23= StandardHeadingElement23.getText();
//  			System.out.println("Text Content: " + StandardHeadingText23);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement23= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[8]"));
//  			String PaymentHeadingText23= PaymentHeadingElement23.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText23);
//  			
//  			
//  		// Rajesh Kumar's profile
//  	    	// Verify the image
//  			WebElement TeacherImage24 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[24]"));
//  			if (TeacherImage24.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement30= driver.findElement(By.xpath("//p[normalize-space()='Rajesh Kumar C']"));
//  			String HeadingText30 = HeadingElement30.getText();
//  			System.out.println("Text30 Content: " + HeadingText30);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink24 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[24]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink24);
//    	    System.out.println("Clicked the Read More Link 24");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement47 = driver.findElement(By.xpath("//p[contains(text(),'I am Rajesh Kumar, a pilgrim of profound explorati')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph24 = paragraphElement47.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph24);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink24 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink24);
//    	    System.out.println("Clicked the Read Less Link 24");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement48 = driver.findElement(By.xpath("//p[contains(text(),'Hail, seekers of numerical insight! I bid you a he')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph24 = paragraphElement48.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph24);
//  	        
//  	        
//  	    //Heading for maths activity Content
//  		  	WebElement TamilHeadingElement29= driver.findElement(By.xpath("(//span[contains(text(),'Bible')])[4]"));
//  			String TamilHeadingText29= TamilHeadingElement29.getText();
//  			System.out.println("Text Content: " + TamilHeadingText29);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement24= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[24]"));
//  			String HourHeadingText24= HourHeadingElement24.getText();
//  			System.out.println("Text Content: " + HourHeadingText24);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement24= driver.findElement(By.xpath("(//span[contains(text(),'5 Years')])[3]"));
//  			String ExperienceHeadingText24= ExperienceHeadingElement24.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText24);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement24= driver.findElement(By.xpath("//span[normalize-space()='Mon, Wed, Fri']"));
//  			String TimeTableHeadingText24= TimeTableHeadingElement24.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText24);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement24= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary')])[17]"));
//  			String StandardHeadingText24= StandardHeadingElement24.getText();
//  			System.out.println("Text Content: " + StandardHeadingText24);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement24= driver.findElement(By.xpath("(//span[contains(text(),'8 - 10')])[6]"));
//  			String PaymentHeadingText24= PaymentHeadingElement24.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText24);
//  			
//  		// Sandhya's profile
//  	    	// Verify the image
//  			WebElement TeacherImage25 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[25]"));
//  			if (TeacherImage25.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement31= driver.findElement(By.xpath("//p[normalize-space()='Sandhya P N']"));
//  			String HeadingText31 = HeadingElement31.getText();
//  			System.out.println("Text31 Content: " + HeadingText31);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink25 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[25]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink25);
//    	    System.out.println("Clicked the Read More Link 25");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement49 = driver.findElement(By.xpath("//p[contains(text(),'In the realm of Telugu language and culture, I am ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph25 = paragraphElement49.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph25);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink25 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink25);
//    	    System.out.println("Clicked the Read Less Link 25");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement50 = driver.findElement(By.xpath("//p[contains(text(),'In the realm of Telugu language and culture, I am ')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph25 = paragraphElement50.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph25);
//  	        
//  	        
//  	    //Heading for maths activity Content
//  		  	WebElement TamilHeadingElement30= driver.findElement(By.xpath("(//span[contains(text(),'Telugu')])[2]"));
//  			String TamilHeadingText30= TamilHeadingElement30.getText();
//  			System.out.println("Text Content: " + TamilHeadingText30);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement25= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[25]"));
//  			String HourHeadingText25= HourHeadingElement25.getText();
//  			System.out.println("Text Content: " + HourHeadingText25);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement25= driver.findElement(By.xpath("//span[normalize-space()='11 Years']"));
//  			String ExperienceHeadingText25= ExperienceHeadingElement25.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText25);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement25= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Sat')])[3]"));
//  			String TimeTableHeadingText25= TimeTableHeadingElement25.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText25);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement25= driver.findElement(By.xpath("(//span[contains(text(),'Middle')])[16]"));
//  			String StandardHeadingText25= StandardHeadingElement25.getText();
//  			System.out.println("Text Content: " + StandardHeadingText25);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement25= driver.findElement(By.xpath("(//span[contains(text(),'9 - 11')])[9]"));
//  			String PaymentHeadingText25= PaymentHeadingElement25.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText25);
//  			
//  			
//  		// Rupesh Kumar's profile
//  	    	// Verify the image
//  			WebElement TeacherImage26 = driver.findElement(By.xpath("(//img[@alt='Profile Image'])[26]"));
//  			if (TeacherImage26.isDisplayed()) {
//  	          System.out.println("Image is displayed correctly.");
//  			} else {
//  				System.out.println("Image is not displayed.");
//  			}
//  			
//  			//Heading27 Content
//  		  	WebElement HeadingElement32= driver.findElement(By.xpath("//p[normalize-space()='Rupesh Kumar']"));
//  			String HeadingText32 = HeadingElement32.getText();
//  			System.out.println("Text32 Content: " + HeadingText32);
//  			
//  			
//  		// Find the "read more" link
//  	        WebElement readMoreLink26 = driver.findElement(By.xpath("(//a[contains(text(),'Read more..')])[26]")); // Replace "readMoreLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readMoreLink26);
//    	    System.out.println("Clicked the Read More Link 26");
//
//  	        // Wait for the additional content to load (you may need to implement a wait mechanism here)
//
//  	        // Get the text of the expanded paragraph
//  	        WebElement paragraphElement51 = driver.findElement(By.xpath("//p[contains(text(),'I am Rupesh Kumar, a seasoned devotee of the intri')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String expandedParagraph26 = paragraphElement51.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(expandedParagraph26);
//  	        
//  	        // Find the "read less" link
//  	        WebElement readLessLink26 = driver.findElement(By.xpath("//a[normalize-space()='Read less']")); // Replace "readLessLink" with the actual ID of the read more link
//  	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", readLessLink26);
//    	    System.out.println("Clicked the Read Less Link 26");
//    	    
//    	 // Get the text of the expanded paragraph
//  	        WebElement paragraphElement52 = driver.findElement(By.xpath("//p[contains(text(),'I am Rupesh Kumar, a seasoned devotee of the intri')]")); // Replace "paragraphId" with the actual ID of the paragraph
//  	        String currentParagraph26 = paragraphElement52.getText();
//
//  	        // Print the expanded paragraph
//  	        System.out.println(currentParagraph26);
//  	        
//  	        
//  	    //Heading for maths activity Content
//  		  	WebElement TamilHeadingElement31= driver.findElement(By.xpath("//span[normalize-space()='Chess']"));
//  			String TamilHeadingText31= TamilHeadingElement31.getText();
//  			System.out.println("Text Content: " + TamilHeadingText31);	
//  			
//  		//Heading for hour Content
//  		  	WebElement HourHeadingElement26= driver.findElement(By.xpath("(//span[contains(text(),'1 hr')])[26]"));
//  			String HourHeadingText26= HourHeadingElement26.getText();
//  			System.out.println("Text Content: " + HourHeadingText26);
//  			
//  		//Heading for experience Content
//  		  	WebElement ExperienceHeadingElement26= driver.findElement(By.xpath("(//span[contains(text(),'15 Years')])[2]"));
//  			String ExperienceHeadingText26= ExperienceHeadingElement26.getText();
//  			System.out.println("Text Content: " + ExperienceHeadingText26);
//  			
//  		//Heading for Day Content
//  		  	WebElement TimeTableHeadingElement26= driver.findElement(By.xpath("(//span[contains(text(),'Mon - Fri')])[9]"));
//  			String TimeTableHeadingText26= TimeTableHeadingElement26.getText();
//  			System.out.println("Text Content: " + TimeTableHeadingText26);
//  			
//  		//Heading for Standards Content
//  		  	WebElement StandardHeadingElement26= driver.findElement(By.xpath("(//span[contains(text(),'KG and Elementary,Middle,High')])[7]"));
//  			String StandardHeadingText26= StandardHeadingElement26.getText();
//  			System.out.println("Text Content: " + StandardHeadingText26);
//  			
//  		//Heading for Payment Content
//  		  	WebElement PaymentHeadingElement26= driver.findElement(By.xpath("//span[normalize-space()='18 - 20']"));
//  			String PaymentHeadingText26= PaymentHeadingElement26.getText();
//  			System.out.println("Text Content: " + PaymentHeadingText26);
//

  	
  	    
	}
	
	
	
//	// Method to check if image URL is valid
//    private static boolean isValidImageURL(String url) {
//        try {
//            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//            connection.setRequestMethod("HEAD");
//            int responseCode = connection.getResponseCode();
//            return (responseCode == HttpURLConnection.HTTP_OK);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
	
	
	
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
	
	// Function to scroll to the top of the page
    public static void scrollToTop(JavascriptExecutor js) {
        js.executeScript("window.scrollTo(0, 0);");
    }
	

}



