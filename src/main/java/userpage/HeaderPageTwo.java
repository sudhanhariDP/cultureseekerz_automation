package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HeaderPageTwo {
	
	WebDriver driver=null;
	
	public HeaderPageTwo(RemoteWebDriver driver4) {
		this.driver=driver4;
	}
	
	public void NavigationHeader() {
		
		//CLicking Home Page Link
	      WebElement HomeLink = driver.findElement(By.linkText("Home"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", HomeLink);
		  System.out.println("Clicked the Home Page Link");
		
		  
		  try {
	          Thread.sleep(5000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		  
		//CLicking About Us Page Link
	      WebElement AboutUsLink = driver.findElement(By.linkText("About Us"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", AboutUsLink);
		  System.out.println("Clicked the About Us Page Link");
		  
		  
		  try {
	          Thread.sleep(5000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		  
		//CLicking Why CultureSeekerz Page Link
	      WebElement WhyCultureSeekerzLink = driver.findElement(By.linkText("Why CultureSeekerz"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", WhyCultureSeekerzLink);
		  System.out.println("Clicked the Why CultureSeekerz Page Link");
		  

		  try {
	          Thread.sleep(5000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		  
		//CLicking Why CultureSeekerz Page Link
	      WebElement ContactUsLink = driver.findElement(By.linkText("Contact Us"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContactUsLink);
		  System.out.println("Clicked the Contact Us Page Link");
		  
		  
	}

}