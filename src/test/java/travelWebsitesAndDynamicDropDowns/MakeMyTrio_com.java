package travelWebsitesAndDynamicDropDowns;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MakeMyTrio_com {

	WebDriver driver;
	
	@BeforeMethod
public void setUp() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		
		driver = new EdgeDriver(options);
		driver.get("https://www.makemytrip.com");
		
	}
	
	@Test
	public void verifyTheTitleIsDisplayedProperly() {
		
		String actualTitle = "International Flights, Book Cheap International Air Tickets Online | MakeMyTrip India";
		String expectedTitle = driver.getTitle();	
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("The title matches correctly : "+ expectedTitle);
			
		}else {
			System.out.println("The expected title and actual title do not match");
		}
		
		
	}
	@Test
	public void verifyTheUrlMatchesTheAdressBar() {
		
		String actualUrl = "https://www.makemytrip.com";
		String expectedUrl = driver.getCurrentUrl();
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			
			System.out.println("The url matches :"+ expectedUrl);
		}else {
			System.out.println("The expected url and actual url do not match");
		}
		
	}
	@Test 
	public void scrollThroughAndClickOnFromCityAndToCity() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("was");
		Thread.sleep(2000); //need to use thread.sleep to automate suggestive dropdowns
		
		for(int i = 0 ; i <=3 ; i++) {
			
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
		
		}
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("label[for='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("new");
		
	for(int i = 0 ; i <=3 ; i++) {
			
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
	                                      }
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	
		
	}
	
	
}
