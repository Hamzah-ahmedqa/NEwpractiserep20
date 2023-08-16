package moreAboutAutomationExtraLearning;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTip {
//if a awebelement does not have a title, it does not have a tooltip, 
	//the tooltip and the title are the same
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
	 
	        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
	        
		driver = new EdgeDriver(options);
		driver.get("https://rediff.com");
	}
	
	@Test (priority =1 )
	public void getToolTipOfReddifMail() {
		WebElement mailLink = driver.findElement(By.linkText("Rediffmail"));
	    String toolTipmailLink = mailLink.getAttribute("title");
	    System.out.println("The tool tip for the Rediffmail link is : "+toolTipmailLink );
		
	}
	@Test (priority =2 )
	public void getToolTipOfMoneyLink() {
		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
	    String toolTipmoneyLink = moneyLink.getAttribute("title");
	    System.out.println("The tool tip for the money link is : "+toolTipmoneyLink );
		
	}
	@Test (priority =3 )
	public void getToolTipOfBusinessEmailLink() {
		WebElement businessEmailLink = driver.findElement(By.linkText("Business Email"));
	    String toolTipbusinessEmailLink = businessEmailLink.getAttribute("title");
	    System.out.println("The tool tip for the Business Email link is : "+toolTipbusinessEmailLink );
		
	}
	@Test (priority =4 )
	public void getToolTipOfVideosLink() {
		WebElement VideosLink = driver.findElement(By.linkText("Videos"));
	    String toolTipVideosLink = VideosLink.getAttribute("title");
	    System.out.println("The tool tip for the Videos link is : "+toolTipVideosLink );
		
		
	}
	@Test (priority =5 )
	public void getToolTipOfShoppingLink() {
		WebElement ShoppingLink = driver.findElement(By.linkText("Shopping"));
	    String toolTipShoppingLink = ShoppingLink.getAttribute("title");
	    System.out.println("The tool tip for the Shopping link is : "+toolTipShoppingLink );
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}
