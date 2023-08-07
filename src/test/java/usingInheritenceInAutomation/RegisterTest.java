package usingInheritenceInAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends TestBase{

	 WebDriver driver;
	 EdgeOptions options;
	
	
	@BeforeMethod
	public  void BrowserSetup() throws Throwable {
	
	//	TestBase.openBrowserAndApplication();
	//	driver = new EdgeDriver(options);	
			
		
	}
	
	@Test(priority=1)
	public void RegisterAccountWithValidRequirements(){
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("james");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("bullger");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("JamesWhiteyBulger@yahoo.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4102172289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("BulgerBoss12");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("BulgerBoss12");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")).isDisplayed());
		softassert.assertAll();
	}
	@Test(priority=2)
	public void RegisterAccountWithInvalidRequirements() throws InterruptedException{
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("SliMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMm");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("ShaDDDDDDD########################################dy");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1200000000000000000000000000029@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("443667000000000000000000000000000000000000000000000000000002289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("I##########################################3amSecretl000000000000000000000000000000yEminem221");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("IamSecret#################################@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@lyEminem221");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Thread.sleep(3000);
	SoftAssert softassert = new SoftAssert();
	softassert.assertTrue(driver.findElement(By.xpath("	//div[@class='text-danger' and contains(text(),'First Name')]")).isDisplayed());
	softassert.assertAll();
	
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
