package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ContactUsPage {
	
	WebDriver driver = null;
	
	public ContactUsPage(RemoteWebDriver driver8) {
		this.driver = driver8;
	}
	
	public void ContactUsValidation() {
		
		
		WebElement ContactUsLink = driver.findElement(By.linkText("Contact Us"));
		ContactUsLink.click();
		
		
		WebElement imageElement5 = driver.findElement(By.xpath("//img[@alt='Parents Image']"));

        // Validate if the image element is present
        if (imageElement5.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement5.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
        
        
        WebElement TextElement= driver.findElement(By.className("info-area"));
		String ContentText = TextElement.getText();
        System.out.println("Address Content: " + ContentText);
        
        
		
	}

}
