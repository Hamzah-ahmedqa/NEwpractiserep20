package usingInheritenceInAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
   WebDriver driver;
    EdgeOptions options;
	 
@BeforeMethod
	public  void setUp() throws Throwable {
	//TestBase.openBrowserAndApplication();
	// driver = new EdgeDriver(options);
	
	
		
		
	}
	
		
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
	
	
	}
	@Test(priority = 2)
	public void verifyLoginWithInValidCredentials() {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("Therealslimshady4eva1222222222222222229@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("IamSecretlyEminem222222222221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		String actualWarningMesage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(actualWarningMesage.contains(expectedWarningMessage));
		softassert.assertAll();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
