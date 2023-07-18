package testNGBeginning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreAboutAnnotations {
	
	
	
	public WebDriver driver;
	public EdgeOptions options;
	
	@BeforeMethod
	public void Setup() {
		
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		driver = new EdgeDriver(options);
		
		driver.get("https://roblox.com");
		
	}
	
	@Test(priority=1) //you can enabled = false to pause the testcase
	public void LoginWithValidCredentials() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#main-login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-username")).sendKeys("CookieSwirl223I");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-password")).sendKeys("Haniyah2215");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#login-button")).click();
		Thread.sleep(5000);
		
	}
	
	@Test (priority=2)
	public void LoginWithInValidCredentials() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#main-login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-username")).sendKeys("CookieSwirl22300000I");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login-password")).sendKeys("Haniyah77772215");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#login-button")).click();
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	public void ShutDown() {
		driver.quit();
	}
	
	
	
	

}
