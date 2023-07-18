package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TraversingWithXpathAlsoCreateAccount {

	public WebDriver driver;
	public EdgeOptions options;
	public Select select;
	
	@BeforeMethod
	public void navigateToRediff() {
		
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		driver = new EdgeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://rediff.com");
		
	}
	
	@Test(priority = 1)
	public void SignUpWithValidCredentials() throws InterruptedException {
		
driver.findElement(By.xpath("//a[@class='signin']/following-sibling::a[contains(text(),'Create Account')]")).click();     
 Thread.sleep(5000);
 
 driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[@type='text' and @maxlength='61']")).sendKeys("James Whitey Bulger");
	
	driver.findElement(By.xpath("//input[@type='text' and @maxlength = '30'][1]")).sendKeys("JamesWhiteyBulger");       
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("JAumes@1233Buloger#");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("JAumes@1233Buloger#");
		driver.findElement(By.xpath("//input[@class='nomargin']")).click();
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Select a Security Question')]/following-sibling::td[@colspan='3']/child::select")));
		select.selectByVisibleText("What is your favourite pass-time?");
		driver.findElement(By.xpath("//input[@type='password' and @maxlength='30']")).sendKeys("AutoMating and being a mafia boss");
		driver.findElement(By.xpath("//input[@id='mobno']/preceding::input[@type='text' and @maxlength='30']/following::input[@type='text' and @maxlength='30']")).sendKeys("Madison");
		driver.findElement(By.cssSelector("input#mobno")).sendKeys("4432750852");
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]")));
		select.selectByVisibleText("01");
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]")));
		select.selectByVisibleText("JAN");
	
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]/following-sibling::select")));
		select.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]/following-sibling::select/following::select[@id='country']")));
		select.selectByVisibleText("United States");
		
		Thread.sleep(50000);
		
		driver.findElement(By.cssSelector("input#Register")).click();
		
		Thread.sleep(10000);
	} 
	@Test(priority = 2, dependsOnMethods = "SignUpWithValidCredentials",enabled = false, alwaysRun = true)
	public void SignUpWithINValidCredentials() throws InterruptedException {
		
driver.findElement(By.xpath("//a[@class='signin']/following-sibling::a[contains(text(),'Create Account')]")).click();     
Thread.sleep(5000);
driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[@type='text' and @maxlength='61']")).sendKeys("James Whiteyyyyyyyyyyyyyyyyyy Bulger");
	driver.findElement(By.xpath("//input[@type='text' and @maxlength = '30'][1]")).sendKeys("JamesWhitey00000000000000Bulger");       
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("JAumes@12330000000000000000008888888888888888000000000000Buloger#");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("JAumes@124444444444444444444444477777777777777777777777444444433Buloger#");
		driver.findElement(By.xpath("//input[@class='nomargin']")).click();
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Select a Security Question')]/following-sibling::td[@colspan='3']/child::select")));
		select.selectByVisibleText("What is your favourite pass-time?");
		driver.findElement(By.xpath("//input[@type='password' and @maxlength='30']")).sendKeys("AutoMating and being a mafia boss");
		driver.findElement(By.xpath("//input[@id='mobno']/preceding::input[@type='text' and @maxlength='30']/following::input[@type='text' and @maxlength='30']")).sendKeys("Madison11111111111111111111111111111111111111111");
		driver.findElement(By.cssSelector("input#mobno")).sendKeys("4432750852");
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]")));
		select.selectByVisibleText("01");
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]")));
		select.selectByVisibleText("JAN");
	
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]/following-sibling::select")));
		select.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='m']")).click();
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td[@colspan='3']/child::select[1]/following-sibling::select[1]/following-sibling::select/following::select[@id='country']")));
		select.selectByVisibleText("United States");
		
		Thread.sleep(50000);
		
		driver.findElement(By.cssSelector("input#Register")).click();
	
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
