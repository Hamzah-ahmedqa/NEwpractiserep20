package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReddifRegisterCreateAccountTest {
	public WebDriver driver;
	public EdgeOptions options;
	public Select select;
    public SoftAssert softassert;
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
		String actualCheckAvailabilityMessage = driver.findElement(By.cssSelector("div#check_availability")).getText();
		String expectedCheckAvailabilityMessage = "Yippie! The ID you've chosen is available.";
		
		softassert.assertTrue(actualCheckAvailabilityMessage.contains(expectedCheckAvailabilityMessage));
		
		
		driver.findElement(By.cssSelector("input#newpasswd")).sendKeys("TheRealJames234#");
		driver.findElement(By.cssSelector("input#newpasswd1")).sendKeys("TheRealJames234#");
		driver.findElement(By.xpath("//input[@class='nomargin']")).click();
		Thread.sleep(2000);
		
		select = new Select(driver.findElement(By.xpath("//td[contains(text(),'Select a Security Question')]/following-sibling::td[@colspan='3']/child::select")));
		select.selectByVisibleText("What is your favourite pass-time?");
		driver.findElement(By.xpath("//input[@type='password' and @maxlength='30']")).sendKeys("BeingABoss");
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
		String actualWarningMessage = driver.findElement(By.xpath("//div[@class='errbody']/child::div")).getText();
		String expectedWarningMessage = "Sorry! We will not be able to register you right now.";
		
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		if(actualWarningMessage.contains(expectedWarningMessage)) {
			System.out.println("Warning message is displayed properly");
			System.out.println(actualWarningMessage);
			System.out.println("---Reddif register account test---");
		}else {
			System.out.println("Warning message is not displayed properly :"+actualWarningMessage);
		}
		softassert.assertAll();
}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
