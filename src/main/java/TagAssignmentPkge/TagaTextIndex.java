package TagAssignmentPkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagaTextIndex {
		
		static WebDriver driver;
		public static void main(String[] args) {
			
			
			BrowserUtil br = new BrowserUtil();
			driver = br.init_driver("chrome");
			
			ElementAction elementaction = new ElementAction(driver);
			elementaction.launchUrl("https://www.amazon.com/");
			
			By tagA = By.tagName("a");
			
			elementaction.getTagTextIndex(tagA, "href");

		}

	

}
