package TagAssignmentPkge;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementAction {
	WebDriver driver;
	
	public ElementAction(WebDriver driver){
		this.driver = driver;
	}
	
	 public void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	 
	 public List<WebElement> getElementsList(By locator) {
		 List<WebElement> elements =  driver.findElements(locator);
		 return elements;
	 }
	 
	 public void getTagText(By locator) {
		 List<WebElement> elements = getElementsList(locator);
		 int totalTagA= elements.size();
		 System.out.println("Total # of tag'a' links = "+totalTagA);
		 int txtCount=0;
		for(int i=0; i< totalTagA; i++ ) {
			String text =elements.get(i).getText();
			if(!(text.isEmpty())){
				System.out.println(text.trim());
				txtCount++;
			}
			
		}
		int noTxtCount = totalTagA - txtCount;
		System.out.println("\nTotal # of links with no text = "+ noTxtCount);
		
		}
		public void getTagText(By locator, String href) {
			 List<WebElement> elements = getElementsList(locator);
			 System.out.println(elements.size());
			for(int i=0; i< elements.size(); i++) {
				String webelement =elements.get(i).getAttribute(href);
				
				System.out.println(webelement);
			}
			
		}
		
		public void getTagTextIndex(By locator,String href) {
			System.out.println("----index-------Text--------Links -------");
			 List<WebElement> elements = getElementsList(locator);
			for(int i=0; i< elements.size(); i++) {
				String webelementTxt =elements.get(i).getText();
				String webelementhref =elements.get(i).getAttribute(href);
				
				System.out.println(i+" ---> "+webelementTxt +" --> "+webelementhref);
			}
		}
		
		


		
		 
		 
	 
	
		}	


