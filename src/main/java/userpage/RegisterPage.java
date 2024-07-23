package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RegisterPage {
	
	WebDriver driver=null;
	
	public RegisterPage(RemoteWebDriver driver3) {
		this.driver=driver3;
		
	}


	public void ValidationRegister() {
		
		//Images for Teacher
        WebElement imageElement = driver.findElement(By.xpath("(//img[@alt='Parents Image'])[1]"));

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

	
		//CLicking Teacher Button
        WebElement TeacherButton = driver.findElement(By.xpath("//div[@class='teacher-container']//span[@class='mat-mdc-button-touch-target']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TeacherButton);
  	    System.out.println("Clicked the Teacher Button");
  	    

  	    
  	  try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  	    
  	    
  	    //back to previous page
        driver.navigate().back();
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        
      //Images for Parent
        WebElement imageElement2 = driver.findElement(By.xpath("//div[@class='parent-container']//img[@alt='Parents Image']"));

        // Validate if the image element is present
        if (imageElement2.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement2.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
    	
  	    
        //CLicking Parent Button
        WebElement ParentButton = driver.findElement(By.xpath("//div[@class='parent-container']//span[@class='mat-mdc-button-touch-target']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ParentButton);
  	    System.out.println("Clicked the Parent Button");
  	    
  	    
  	    //back to previous page
        driver.navigate().back();
  	    
  	    
  	    //CLicking Already have an account link
        WebElement AccountLink = driver.findElement(By.xpath("//p[@routerlink='/login-reg/login']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AccountLink);
  	    System.out.println("Clicked the Already Have An account Button");
	
		}
	
		
		
	}