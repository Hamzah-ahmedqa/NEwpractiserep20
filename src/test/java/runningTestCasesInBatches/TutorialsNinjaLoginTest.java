package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaLoginTest {

	

	EdgeDriver driver;
	EdgeOptions options;
	
	
	@Test(priority=1)
	public void LoginWithValidCredentials() throws InterruptedException {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		System.out.println("--------Ninja login test----------");
	
	}@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
