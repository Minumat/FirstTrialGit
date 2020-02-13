package TagAssignmentPkge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonFooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		BrowserUtil browsr = new BrowserUtil();
		driver = browsr.init_driver("Chrome");
		
		ElementAction elementaction = new ElementAction(driver);
		elementaction.launchUrl("https://www.amazon.com/");
		
		By footerId= By.xpath("//div[@id='navFooter']//li/a");
		
		elementaction.getTagText(footerId);
	}

}
