package com.takingAdvantageOfExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TNregisterANdLogin {
	EdgeDriver driver;
	EdgeOptions options;
	
	
	@Test(enabled = false, priority =1, dataProvider = "TutorialsNinjaRegister", dataProviderClass=ExcelDataAndDataProvider.class)
	 public void RegisterAccountWithExcel(String FirstName, String LastName, String Email, String TelePhone, String PassWord, String ConfirmPassWord )throws InterruptedException{
		options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(FirstName);
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(LastName);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(TelePhone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(PassWord);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(ConfirmPassWord);
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		//this worked, all the accounts were created
	}
	
	@Test( priority =1, dataProvider = "LoginSheetExcel", dataProviderClass=ExcelDataAndDataProvider.class)
	public void LoginWithExcelSheetInforMation(String Username, String Password) throws InterruptedException {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
