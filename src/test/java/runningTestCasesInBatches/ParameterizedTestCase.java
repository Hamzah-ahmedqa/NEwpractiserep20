package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestCase {

	public WebDriver driver;
	

	
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void parameterizedTest(String browser, String url, String username, String password) {
		
		if(browser.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
		driver.get(url);
		driver.findElement(By.cssSelector("input#login1")).sendKeys(username);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		
	}
	
	
	
	
	
	
	
	
}
