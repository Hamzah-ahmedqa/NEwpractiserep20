package retryFailedLoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RediffAndTutNinja {

	WebDriver driver;
	EdgeOptions options;
	
	 // @Ignore this has the same power as enabled = false, this should go on top of the test we want to ignore
	@Test (retryAnalyzer = MyRetry.class)
	public void rediffLoginTest() {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		driver = new EdgeDriver(options);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.name("proceed")).click();
		driver.quit();
	//	Assert.fail();
		
	//how to rerun the failed test cases only, this one and whatever other ones are failed
		//if its 7, 3 ,1, or whatever 
		
	}
	@Ignore //ignore over powers alwaysRun = True
	@Test(alwaysRun = true)
	public void tutorialsNinjaTest() throws InterruptedException {
	options = new EdgeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--inprivate");
	
	driver = new EdgeDriver(options);
			driver.get("http://tutorialsninja.com/demo");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Thread.sleep(5000);
			driver.quit();
	}
}
