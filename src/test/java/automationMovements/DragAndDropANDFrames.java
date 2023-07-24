package automationMovements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropANDFrames {
	
	public WebDriver driver;
	public FirefoxOptions options; 
	
	@BeforeMethod 

	public void Setup() {
		
		options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--private");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new FirefoxDriver(options);
		driver.get("https://jqueryui.com/droppable");
		
	
		
		
}
	@Test 
	public void handlingFrames() {
		
		
		//total number of frames
	List<WebElement> totalframes = 	driver.findElements(By.xpath("//iframe[@class='demo-frame']"));	
	System.out.println("Total Frames :" + totalframes.size());
	
	//since there is only one frame the index position of that is 0, arrays 1st position is 0th index
	driver.switchTo().frame(0);
	
	WebElement source = driver.findElement(By.cssSelector("div#draggable"));
	WebElement target = driver.findElement(By.cssSelector("div#droppable"));
	
	Actions action = new Actions(driver);
	action.dragAndDrop(source, target).perform();
	
	
	}
	
}