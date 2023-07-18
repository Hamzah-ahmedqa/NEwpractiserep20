package testNGBeginning;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Boohooman {
	//THIS IS NOT WORKING------BROKEN CODE

	public WebDriver driver;
	public EdgeOptions options;
	
	String Validpassword = "Hamzah24";
	String ValidUserName = "peoplentechresumes@gmail.com";
	
	@BeforeMethod
	public void openBrowser() {
		
		options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		driver.get("https://boohooman.com/us/");
		
		if(driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).isDisplayed()) {
			 		driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
		}
		
	
	}
	
	@Test(priority=1)
	public void clickOnLogin() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.js-header-customer-info")).click();
		driver.findElement(By.xpath("//a[@title='Login']")).click();
	}
	
	@Test(priority=2, dependsOnMethods ="clickOnLogin")
	public void signInWithValidCredentials() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.js-header-customer-info")).click();
		driver.findElement(By.xpath("//a[@title='Login']")).click();
		 driver.findElement(By.cssSelector("input.input-text.username.required")).sendKeys(ValidUserName);
 		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Validpassword);
	driver.findElement(By.cssSelector("button.login-page-button.js-login-page-button")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 3, dependsOnMethods = {"signInWithValidCredentials","clickOnLogin"})
	public void LoginWithInValidCredentials() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.js-header-customer-info")).click();
		driver.findElement(By.xpath("//a[@title='Login']")).click();
 driver.findElement(By.cssSelector("input.input-text.username.required")).sendKeys(ValidUserName+3);
 		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Validpassword+33);
	driver.findElement(By.cssSelector("button.login-page-button.js-login-page-button")).click();
		Thread.sleep(5000);
	
	}
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	} 
	
	
	
}
