package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class AutomateDropDown {


	
	public WebDriver driver;
	public EdgeOptions Eoptions;
	public Select select;
	
	
	@BeforeMethod
	public void ClickOnLogin() {
		
	Eoptions = new EdgeOptions();
		
		Eoptions.addArguments("--start-maximized");
		Eoptions.addArguments("--inprivate");
		Eoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new EdgeDriver(Eoptions);// 
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	}
	
	@Test 
	public void AutomateDropDownForFaceBook() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("James");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bulger");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Thereal.jameswhitey@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Thereal.jameswhitey@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("IamTheRealGuy#123");
		Thread.sleep(2000);
		
		
		 select = new Select(driver.findElement(By.cssSelector("select#month")));
		 select.selectByVisibleText("Jan");
		 
		 select = new Select(driver.findElement(By.cssSelector("select#day")));
		 select.selectByVisibleText("31");
		 
		 select = new Select(driver.findElement(By.cssSelector("select#year")));
		 select.selectByVisibleText("1955");
	
			driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Sign Up') and @name='websubmit']")).click();
			Thread.sleep(5000);
			
		
			
	}
	
	@AfterMethod
	public void teardown() {
		
		//driver.quit();
	}
	
	
	
	
	
}
