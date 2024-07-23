package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HeaderPage {
	
	WebDriver driver=null;
	
	public HeaderPage(RemoteWebDriver driver) {
		this.driver= driver;
		
	}
	
	public void ValidationHeader() {
		
		// Find the logo element
        WebElement logo = null;
        try {
            logo = driver.findElement(By.xpath("//img[@alt='logo']"));
        } catch (StaleElementReferenceException e) {
            // Handle StaleElementReferenceException by re-locating the element
            logo = driver.findElement(By.xpath("//img[@alt='logo']"));
        }

        // Validate if the logo is displayed
        if (logo != null && logo.isDisplayed()) {
            System.out.println("Logo is displayed correctly.");
        } else {
            System.out.println("Logo is not displayed.");
        }
        
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		
//		// Verify the logo
//      WebElement logo = driver.findElement(By.xpath("//img[@alt='logo']"));
//      if (logo.isDisplayed()) {
//          System.out.println("Logo is displayed correctly.");
//      } else {
//          System.out.println("Logo is not displayed.");
//      }
        
        
      //CLicking Login Link
        WebElement LoginLink = driver.findElement(By.xpath("//a[@routerlink='/login-reg/login']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", LoginLink);
  	    System.out.println("Clicked the Login Link");
  	    
  	    
  	  try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  	  
  	    
  	//CLicking Register Link
        WebElement RegisterLink = driver.findElement(By.xpath("//a[@routerlink='/login-reg/toregistration']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", RegisterLink);
  	    System.out.println("Clicked the Register Link");
        
		
	}

}
