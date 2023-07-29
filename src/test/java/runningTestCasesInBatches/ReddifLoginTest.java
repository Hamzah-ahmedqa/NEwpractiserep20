package runningTestCasesInBatches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReddifLoginTest {
public WebDriver driver;
public ChromeOptions options;


@Test
public void loginWithValidCredentials() {
	
	options = new ChromeOptions();
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);	
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.signinbtn")).click();
	
	System.out.println("--------Reddif login test----------");
}
@AfterMethod
public void tearDown() {
	
	driver.quit();
}
}
