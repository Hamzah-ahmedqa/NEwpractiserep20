package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaRegisterAccountTest {
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
	public void RegisterAccountWithValidRequirements() throws InterruptedException{
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Bulger");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("JamesWhiteyBulger@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4436572289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamBulger@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("IamBulger@123");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		System.out.println("--------ninja create account test----------");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
