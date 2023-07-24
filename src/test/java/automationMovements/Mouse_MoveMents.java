package automationMovements;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mouse_MoveMents {
	
	public WebDriver driver;
	public ChromeOptions options; 
	
	@BeforeMethod 

	public void Setup() {
		
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new ChromeDriver(options);
		//driver.get("https://jqueryui.com");
		driver.get("https://browserstack.com");
		
	} 
	
	@Test
	public void hoverMouseOverButtonToSeeIfColorChanges()throws InterruptedException {
         Actions action = new Actions(driver);
		
		WebElement getADemoButton = driver.findElement(By.xpath("//div[@class='relative']/preceding::button[contains(text(),'Get a demo')]/following::button[contains(text(),'Get a demo')]"));
        WebElement getStartedFreeButton = driver.findElement(By.cssSelector("a#signupModalButton"));
        
        //move the mouse to the element, mouse hovering
		action.moveToElement(getADemoButton).perform();
		action.moveToElement(getStartedFreeButton).perform();
		action.moveToElement(getADemoButton).perform();
	
		Thread.sleep(3000);
		                                     //this is right click
		action.moveToElement(getADemoButton).contextClick().perform();
	}
	

}
