package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AboutUsPage {
	
	WebDriver driver=null;
	
	
	public AboutUsPage(RemoteWebDriver driver6) {
		this.driver=driver6; 
	 }
	
	
	public void AboutUsValidation() {
		
		WebElement AboutUsLink = driver.findElement(By.linkText("About Us"));
		AboutUsLink.click();
		
		WebElement imageElement3 = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//img"));

        // Validate if the image element is present
        if (imageElement3.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement3.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
		
		
	}

}
