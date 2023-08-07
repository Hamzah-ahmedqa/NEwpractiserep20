package retryinheritence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	 driver =  initializeBrowserAndOpenApplication("edge");
	
			}
	

	
@Test (priority = 1)
public void verifyRediffLoginWithValidUsernameAndValidPassword() throws InterruptedException {
	

	
	
	driver.findElement(By.xpath("//a[@class='signin']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	SoftAssert softassert = new SoftAssert();
	softassert.assertTrue(driver.findElement(By.cssSelector("a.rd_logout")).isDisplayed());
	softassert.assertAll();
	driver.quit();
	}
	
@Test (priority = 2)
public void verifyRediffLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException {
	
	
	driver.findElement(By.xpath("//a[@class='signin']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("login1")).sendKeys("seleniumpanda556@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@12399");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	SoftAssert softassert = new SoftAssert();
	//softassert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Temporary Issue. Please try again later. [#5002]')]")).isDisplayed());
	String actualWarningMessage = driver.findElement(By.xpath("//b[contains(text(),'Temporary Issue. Please try again later. [#5002]')]")).getText();
	String expectedWarningMessage = "Temporary Issue. Please try again later. [#5002]";
	softassert.assertTrue(actualWarningMessage.equals(expectedWarningMessage));
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
