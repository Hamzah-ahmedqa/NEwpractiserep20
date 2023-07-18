package tutorialsNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomatetutorialsNinjaMakeAccount {

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
	
	@Test(priority=1, enabled = false)
	public void RegisterAccountWithValidRequirements(){
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Slim");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Shady");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4436672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
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
	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
