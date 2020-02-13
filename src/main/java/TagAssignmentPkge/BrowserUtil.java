package TagAssignmentPkge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	WebDriver driver;
	
	public WebDriver init_driver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\minu-joseph\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\minu-joseph\\Downloads\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser not found....");
		}
		return driver;
		}
	
	

}
