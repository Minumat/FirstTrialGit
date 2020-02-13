package TagAssignmentPkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagaText {
    static WebDriver driver;
    
	public static void main(String[] args) {
		
		
		
		BrowserUtil browsr = new BrowserUtil();
		driver = browsr.init_driver("Chrome");
		
		ElementAction elementaction = new ElementAction(driver);
		elementaction.launchUrl("https://www.amazon.com/");
		
		By tagA=By.tagName("a");
		
		elementaction.getTagText(tagA);
		
		
		
		


	}
	
		
	

}
