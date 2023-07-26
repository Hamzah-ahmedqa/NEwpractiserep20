package validationsINTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*softassert.assertTrue(flase,expectedwarningmessage)
 * softassert.assertFalse
 *  softassert.assertEquals
 * softassert.assertNotEquals
 * softassert.assertFail
 */

public class SoftassertInAutomation {
	
	public WebDriver driver;
	public EdgeOptions options;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		options = new EdgeOptions();
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 1)
	public void verifyTopPageWarningMessage()throws InterruptedException {
	
		Thread.sleep(5000);
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		String expectedWarningMessage = "Warning: You must agree to the Privacy Policy!";
		
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		if(actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("Warning Message is properly displayed");
			System.out.println(actualWarningMessage);
			System.out.println("------Test--------");
		}else {
			System.out.println("Warning Message is not displayed properly");
		}
		softassert.assertAll();
	}
	@Test(priority=2)
	public void verifyFirstNameWarningMessageTest() throws InterruptedException {
        
				Thread.sleep(5000);
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).getText();
		String expectedWarningMessage = "First Name must be between 1 and 32 characters!";
		
		softassert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).isDisplayed());
		if(driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).isDisplayed()) {
			System.out.println("Warning Message is properly displayed");
			System.out.println(actualWarningMessage);
			System.out.println("------Test--------");
		}else {
			System.out.println("Warning Message is not displayed properly");
		}
		softassert.assertAll();
	}
	
	@Test(priority=3)
	public void lastNameWarningMessage() throws InterruptedException{
		
		Thread.sleep(5000);
		
	String actualWarningMessage = driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")).getText();
	String expectedWarningMessage = "Last Name must be between 1 and 32 characters!";
	
	softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	if(actualWarningMessage.contains(expectedWarningMessage)) {
		System.out.println("Warning Message is properly displayed");
		System.out.println(actualWarningMessage);
		System.out.println("------Test--------");
	}else {
		System.out.println("Warning Message is not displayed properly");
	}
	softassert.assertAll();
		
	}
      
	@Test(priority = 4)
	public void verifyNinjaEmailWarningMessage() {
	
		String actualWaringMessage = driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div")).getText();
		String expectedWarningMessage = "E-Mail Address does not appear to be valid!";
		
		softassert.assertEquals(expectedWarningMessage, actualWaringMessage);
		
		softassert.assertAll();
	}
	@Test(priority = 5)
	public void verifyTelephoneWarningMessageTest() {
		

		String actualWaringMessage = driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div")).getText();
		String expectedWarningMessage = "Telephone must be between 3 and 32 characters!";
		
		softassert.assertFalse(!(driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div"))).isDisplayed());
		softassert.assertAll();
		
		
	}
	@Test(priority=6)
	public void verifyPasswordWarningMessage() {
		
		String actualWarningMessage = driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")).getText();
		String expectedWarningMessage = "Telephone must be between 3 and 32 characters!";
		
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		if(actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("Warning Message is properly displayed");
			System.out.println(actualWarningMessage);
			System.out.println("------Test--------");
		}else {
			System.out.println("Warning Message is not displayed properly");
		}
		softassert.assertAll();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}

