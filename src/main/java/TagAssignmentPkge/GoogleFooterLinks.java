package TagAssignmentPkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleFooterLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		BrowserUtil browsr = new BrowserUtil();
		driver = browsr.init_driver("Chrome");
		
		ElementAction elementaction = new ElementAction(driver);
		elementaction.launchUrl("https://www.google.com/");
		
		By footerId= By.xpath("//div[@id='fbar']//span/a");
		
		elementaction.getTagText(footerId);
	}

}
