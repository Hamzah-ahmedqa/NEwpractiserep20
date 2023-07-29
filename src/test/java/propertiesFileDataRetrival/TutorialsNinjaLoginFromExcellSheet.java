package propertiesFileDataRetrival;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaLoginFromExcellSheet {
	EdgeDriver driver;
	EdgeOptions options;

		@Test(dataProvider = "TutorialsNinja",dataProviderClass = TestingWithExcelSheet.class)
		public void LoginWithExcelSheet(String Username, String Password) throws InterruptedException {
			
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
		public void shutDown() {
			driver.quit();
		}
}
