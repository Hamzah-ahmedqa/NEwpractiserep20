package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeperateTestCases {
	
	
public WebDriver driver;
public EdgeOptions options;	

	@BeforeMethod
	public void Setup() {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		 
		driver = new EdgeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		

	}
	         // you can pass the dataprovidername here instead //pass this method and add the .class of the class name where the data provider is
	@Test(dataProvider="GetNinjaData",dataProviderClass = SeperateDataProvider.class)
	public void LoginWithTest1(String username, String password) throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void ShutDown() {
		driver.quit();
}
	}
