package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class CreateNewAccount {

	public WebDriver driver;
	public EdgeOptions Eoptions;
	
	
	@Test
	public void MakeFaceBookAccount() throws InterruptedException {
		Eoptions = new EdgeOptions();
		
		Eoptions.addArguments("--start-maximized");
		Eoptions.addArguments("--inprivate");
		Eoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new EdgeDriver(Eoptions);// 
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("James");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bulger");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Thereal.jameswhitey@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Thereal.jameswhitey@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("IamTheRealGuy#123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select#month")).findElement(By.xpath("//option[@value='1' and contains(text(),'Jan')]")).click();   
		driver.findElement(By.cssSelector("select#day")).findElement(By.xpath("//option[@value='15' and contains(text(),'15')]")).click();
		driver.findElement(By.cssSelector("select#year")).findElement(By.xpath("//option[@value='1999' and contains(text(),'1999')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up') and @name='websubmit']")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
	
	
	
	
		
	
}
