package listenersInAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_login {
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
	public void LoginWithValidCredentials() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("wallyTheCraker@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("WallyisHap98");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
