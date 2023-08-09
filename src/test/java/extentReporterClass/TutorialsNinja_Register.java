package extentReporterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinja_Register {
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
	public void clickOnRegister(){
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
	
	}
	@Test (priority=2)
	public void fillInValidFirstName() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
	}
	@Test (priority=3)
	public void fillInValidLastName() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		
	}
	@Test (priority=4)
	public void fillInValidEmail() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		
	}
	@Test (priority=5)
	public void fillInValidPhoneNumber() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		
	}
	@Test (priority=6)
	public void fillInValidPassword() {
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("crunch1231");
	}
	@Test (priority=7)
	public void fillInValidpasswordAgain() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("crunch1231");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("crunch1231");
		
		
	}
	@Test (priority=8)
	public void agreeToNewsLetter() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("crunch1231");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("crunch1231");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		
	}
	@Test
	public void agreeToTermsAndConditons() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("crunch1231");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("crunch1231");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
	}
	@Test (priority=10)
	public void clickOnContinueButton() {
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Wally");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Craker1223@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4430672289");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("crunch1231");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("crunch1231");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
