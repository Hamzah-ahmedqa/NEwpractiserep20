package moreAboutAutomationExtraLearning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ZoominAndOut {

	//zooming in and out of a browser
	public WebDriver driver;
	
	@Test
	public void zoomInAndOut() throws InterruptedException {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000); //zoom in 
		js.executeScript("document.body.style.zoom = '400%' ; ");
		
		Thread.sleep(2000); //zoom out
		js.executeScript("document.body.style.zoom = '40%' ; ");
		
		Thread.sleep(2000); //default
		js.executeScript("document.body.style.zoom = '100%' ; ");
		
		
	}
}
