package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WhyCultureSeekerzPage {
	
	WebDriver driver = null;
	
	
	public WhyCultureSeekerzPage(RemoteWebDriver driver7) {
		this.driver=driver7;	
	}
	
	
	public void ValidationOfWCS() {
		
		WebElement WhyCultureSeekerzLink = driver.findElement(By.linkText("Why CultureSeekerz"));
		WhyCultureSeekerzLink.click();
		
		WebElement imageElement4 = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//img"));

        // Validate if the image element is present
        if (imageElement4.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement4.getAttribute("src");
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
