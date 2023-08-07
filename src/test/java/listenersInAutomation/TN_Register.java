package listenersInAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Register {
	EdgeDriver driver;
	EdgeOptions options;
	
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException {
		
		options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test(priority=1)
	public void RegisterAccountWithValidRequirements(){
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("wallyTheCraker@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4439672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("WallyisHap98");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("WallyisHap98");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
