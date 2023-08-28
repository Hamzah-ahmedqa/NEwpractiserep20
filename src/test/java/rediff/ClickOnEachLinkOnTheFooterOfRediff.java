package rediff;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickOnEachLinkOnTheFooterOfRediff {

	WebDriver driver;
	EdgeOptions options;
	Actions actions;
	//div[@class='footer alignC']
	@BeforeMethod
	public void setUp() {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		 driver = new EdgeDriver(options);
		 driver.get("https://rediff.com");
		 actions = new Actions(driver);
		
	}
	@Test
	public void clickOnEachFooterLink() throws InterruptedException {
	WebElement footerContainer = driver.findElement(By.xpath("//div[@class='footer alignC']"));
	List <WebElement> footerLinks = footerContainer.findElements(By.tagName("a"));
	System.out.println(footerLinks.size());
	//div[@class='footer alignC']/a -this wouldve worked too
	for (int i = 0 ; i < footerLinks.size() ; i++) {
	        WebElement Link = footerLinks.get(i);
	        Link.click();
	        Thread.sleep(2000);
	        System.out.println("-------------------------------------------------------");
	        System.out.println("The current url is :"+ driver.getCurrentUrl());
	        System.out.println("-------------------------------------------------------");
	       driver.get("https://rediff.com");
	        footerLinks = footerContainer.findElements(By.tagName("a"));
	        Thread.sleep(2000);	
	                                                   }
		
	}
	@Test
	public void methodNumber2OfTryingTheSameThingButWithCssSelectors() {      
		                                                                         //this will point to all the as
		List<WebElement>rediffFooterLinks = driver.findElements(By.cssSelector("div.footer.alignC>a"));
		
		WebElement footerLinkref = driver.findElement(By.cssSelector("div.footer.alignC>a"));
		
		for( int i = 0; i<rediffFooterLinks.size() ; i++) {
			System.out.println(rediffFooterLinks.get(i).getText());
	     	String url  = rediffFooterLinks.get(i).getAttribute("href");
	     	System.out.println("--------------------");
			System.out.println(url);
			System.out.println("--------------------");
			actions.scrollToElement(footerLinkref);
			rediffFooterLinks.get(i).click();
			System.out.println("Title of this page is : " + driver.getTitle());
			driver.get("https://rediff.com");
/*call this again*/rediffFooterLinks = driver.findElements(By.cssSelector("div.footer.alignC>a"));
			
		}
		
		// What is StaleElementReferenceException ?
		/*
		 Link1 --> new webpage
		     
		     Link2  --> new webpage
		            
		           Link3 ---> new webpage
		 each one will redirect to another web page 
		 It is showing the stale element reference exception,
		 because after you go to a new link and come back selenium will not work like that
		 you cannot go back and continue operations on this,
		 you have to call the WebElement list again inside the iteration of the forloop
		
		 */
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
