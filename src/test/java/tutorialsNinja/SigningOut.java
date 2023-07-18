package tutorialsNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigningOut {
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
				
	
		
	}
	
	@Test(priority=1/*,   enabled = false*/)
	public void LoginWithValidCredentialsAndSigningout() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout') and @href = 'https://tutorialsninja.com/demo/index.php?route=account/logout']")).click();
		
	
		
}
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}
	
	
}
