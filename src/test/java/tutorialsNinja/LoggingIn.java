package tutorialsNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoggingIn {
	

	EdgeDriver driver;
	EdgeOptions options;
	
	
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException {
		
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				driver.findElement(By.linkText("Login")).click();
				
	// enabled = false paired with alwaysRun= true 
				//enabled = false will overpower alwaysRun=true
				//TestNG will execute alphabetically 
				//its always enabled = true unless you declare otherwise
		
	}
	
	@Test(priority=1/*,   enabled = false*/)
	public void LoginWithValidCredentials() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
	
	}
	
	@Test(priority=2,dependsOnMethods = "LoginWithValidCredentials")
	public void LoginWithInValidCredentials() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimsh==================ady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221000000000000000000000000000000");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
	//	Assert.fail();
	
	}
	
	@Test(priority=3, dependsOnMethods = {"LoginWithValidCredentials","LoginWithInValidCredentials"},alwaysRun = true)
	public void LoginWithnoCredentials() throws InterruptedException {
		

		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
	
	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	

	
	
	
	
	

}
