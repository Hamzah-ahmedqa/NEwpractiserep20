package listenersInAutomationAndExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

// @Listeners(MyListener.class)
//this is for a single class level, for testcases in many different classes we hvae to use our xml.file

public class TestCaseForListenersLoginRediff {

	WebDriver driver;
	EdgeOptions options;

	@BeforeMethod
	public void setUp() {
		options = new EdgeOptions();
		options.addArguments("start-maximed");
		options.addArguments("inprivate");

		driver = new EdgeDriver(options);

		driver.get("https://rediff.com");

	}

	@Test(priority = 1)
	public void clickOnSignInLink() {
		driver.findElement(By.className("signin")).click();

	}
                            //this needs to be executed in 1 secound 
	@Test(priority = 2, timeOut = 1000)
	public void enterValidCredentials() throws InterruptedException {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000); //this will assert the fail because it is too long 
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		Assert.fail();

	}
                           //this will get skipped because the test it depends on will fail
	@Test(priority = 3, dependsOnMethods = "enterValidCredentials" )
	public void clickOnSignInButton() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();

	}

	@Test(priority = 4)
	public void clickOnLogoutLink() throws InterruptedException {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("rd_logout")).click();

	}

	@Test(priority = 5)
   public void clickOnReddifHomeLink() throws InterruptedException {
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("rd_logout")).click();
	
	
	WebElement rediffHomeLink = driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]"));
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(rediffHomeLink));
	
    driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
