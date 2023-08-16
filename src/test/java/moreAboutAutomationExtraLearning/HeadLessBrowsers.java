package moreAboutAutomationExtraLearning;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class HeadLessBrowsers {

	//we can make the tests work in the background without taking up of our physical screen space
//if we run tests for two hours that mean we cant use our system for two hours, thats why there is headless mode
	
	
	public WebDriver driver;
	
	@Test(priority = 1)
	public void tryingHeadlessChrome() throws Exception {
		
	ChromeOptions options = new ChromeOptions();
	// options.setPageLoadStrategy(PageLoadStrategy.NONE);
	options.addArguments("headless");
	
//this all we need
//	options.addArguments("--start-maximized"); //this will be in the background anyway
	options.addArguments("--incognito");
//	options.addArguments("--no-sandbox");
	options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
	
	
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	Thread.sleep(2000);
	
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout') and @href = 'https://tutorialsninja.com/demo/index.php?route=account/logout']")).click();
		Thread.sleep(2000);
	driver.quit();
		
	}
	@Test
	public void headlessFirefox() throws Exception {
		
		FirefoxOptions options = new FirefoxOptions();
     
		options.addPreference("dom.webnotifications.enabled", false);
		options.addArguments("--disable-gpu");
		options.setAcceptInsecureCerts(true);
		options.addArguments("--headless");
		
		  driver = new FirefoxDriver(options);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Logout') and @href = 'https://tutorialsninja.com/demo/index.php?route=account/logout']")).click();
			Thread.sleep(2000);
		
			WebElement myAccountLogout = driver.findElement(By.cssSelector("div#content"));
			File file = new File(System.getProperty("user.dir")+"\\Screenshots\\openthis.png");
			File source = myAccountLogout.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(source, file);

			File destination = new File(System.getProperty("user.dir")+"\\Screenshots\\test.for.java.png");		
		
		driver.quit();
		
		
	}
//screenshots will still happen just the screenshot code, 
	//it will just be naked to our visible eye but the screenshot will get saved where we can see it
	
	
	
	
	
	
}
