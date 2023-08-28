package moreAboutAutomationExtraLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Multiple_WebElements {

	WebDriver driver;
	/*
	  driver.findElementby.
	  linkText
	  tagName
	  partialLinkText
	  id
	  classname
	 xpath
	 cssselector
	 name
	 
	 */
	
	@Test
	public void bbcNewsChannel() throws Throwable {
		
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://bbc.com");
	
//	driver.findElements(By.tagName("a"));//to find all the links that are on the page with the tag name of a
		//thats why it is elements
	List<WebElement> BBCLINKS = driver.findElements(By.tagName("a"));
	System.out.println("The total number of links on the BBC.com website is : "+BBCLINKS.size());
	
	//what if we want the 101st link out of the links that are present 
	//index position is one less becuase it starts from 0
	WebElement Link101 = BBCLINKS.get(100);
	//lets get the text or name of this
	System.out.println("Link text of Link101 is :"+Link101.getText());
	
	//href attribute is always pointing to link, with an a or anchor html tag
	//each link will have that ^
	
	// what is the link url of link 101?
	System.out.println(Link101.getAttribute("href"));
	
	//what is the x and y cordinate of our link
	System.out.println("The X cordinate is :"+Link101.getLocation().x+" --and the Y cordinaate is :"+Link101.getLocation().y);
	
	//click on our link?
//	Link101.click();
	
	System.out.println("----------------------------");
	//list all the links?
	for(int i  = 0 ; i< BBCLINKS.size()-1; i++ ) {
		
		WebElement Links = BBCLINKS.get(i);             //if its displayed will show true 
		System.out.println(Links.getText()+"---->"+Links.isDisplayed());
		                                            //if its not displayed it will return false
		//Links.click();
	//if we want to click each link
	
	}                                                      
	
	
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
