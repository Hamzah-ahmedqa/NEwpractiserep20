package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTutorialsNinja {

	public WebDriver driver;
	
	
	
	@Test(priority=1)
	@Parameters({"browser","url","username","password","myAccountButton","inputButton"})
	public void LoginWithValidCredentials(String browser,String url,String username,String password,String myAccountButton,String inputButton) throws InterruptedException {
		
		if(browser.equals("edge")){
			driver = new EdgeDriver();	
			
		}else if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		
				driver.get(url);
				Thread.sleep(2000);
				driver.findElement(By.xpath(myAccountButton)).click();
				driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector(inputButton)).click();
		Thread.sleep(5000);
	
	
	}@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
