package extentReporterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaLoginTest {
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
	@Test (priority = 1)
	public void clickOnMyAccount() {

		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	
	}
	
	@Test (priority = 2)
	public void clickOnLogin() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	
	@Test(priority=3)
	public void enterValidCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("wallyTheCraker@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("WallyisHap98");
		Assert.fail();
		
	}
	                                      //this will skip becuase the one it depends on is failing
	@Test(priority = 4,dependsOnMethods  = "enterValidCredentials")
	public void clickOnLoginButton() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
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
