package applyingDateToAutomation;

import java.util.Arrays;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DateTimeStampForLoginWithBrokenCHROME {

	WebDriver driver;
	SoftAssert softassert;
	ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {

		softassert = new SoftAssert();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
		driver = new ChromeDriver(options);
		
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
	
		
	}
	@Test
	public void verifyLoginWithValidCredentials() throws Exception {
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout') and @href = 'https://tutorialsninja.com/demo/index.php?route=account/logout']")).click();
		
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		
	}
	@Test(invocationCount = 5)
	public void verifyLoginWithINValidCredentials() throws Exception {              //want to use different numbers between the word and @gmail.com
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva"+ dateTimeStamp() +"@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class,' alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage),"The message is not displayed correctly");
		
		//what if we want to give this invocationcount and make it run 5 times with different wrong usernames and passwords
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	public String dateTimeStamp() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":","_");
		
	}
	
}
