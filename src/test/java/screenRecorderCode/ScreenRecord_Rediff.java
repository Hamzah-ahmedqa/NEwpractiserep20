package screenRecorderCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ScreenRecord_Rediff {
 
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		ScreenRecorderUtil.startRecord("setup");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
		
	}
	@Test
	public void loginTest() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign in")).click();;
		
		Thread.sleep(1000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		Thread.sleep(1000);
        driver.findElement(By.className("signinbtn")).click();	
        Thread.sleep(1500);
        
	}
	@AfterMethod
	public void tearDown() throws Exception {
		ScreenRecorderUtil.stopRecord(); //cannot add arguments in this one 
		driver.quit();
	}
	//refresh the project, and check the test recordings folder and watch with cool file viewer
	
}
