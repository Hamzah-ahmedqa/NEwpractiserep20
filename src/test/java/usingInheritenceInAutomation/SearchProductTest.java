package usingInheritenceInAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProductTest extends TestBase{
	 WebDriver driver;
	 EdgeOptions options;
	
	
	@BeforeMethod
	public  void BrowserSetup() throws Throwable {
		 //TestBase.openBrowserAndApplication();
	//	driver = new EdgeDriver(options);
	
				
				
	}
	@Test(priority = 1)
	public void searchForValidproduct() {
		this.driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("HP");
		this.driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		softassert.assertAll();
		this.driver.quit();
		
	}
	@Test(priority = 2)
	public void searchForInValidproduct() {
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("Dell");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
		
		SoftAssert softassert = new SoftAssert();
	
		softassert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'There is no product that matches the search criteria.')]")).isDisplayed());
		softassert.assertAll();
		driver.quit();
	}
}
