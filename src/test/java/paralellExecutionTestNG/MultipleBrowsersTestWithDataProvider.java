package paralellExecutionTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class MultipleBrowsersTestWithDataProvider {

	WebDriver driver;
	EdgeOptions options;
	ChromeOptions coptions;
	FirefoxOptions foptions;
	
	@Test(dataProvider ="LoginFortutorialsNinja", dataProviderClass = SeperateDataProviderForMultipleBrowesers.class)
	public void EdgeLoginTest(String username, String password) throws InterruptedException {
		System.out.println("The thread for this test is :"+Thread.currentThread());
		
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	@Test(dataProvider ="LoginFortutorialsNinja", dataProviderClass = SeperateDataProviderForMultipleBrowesers.class)
	public void firefoxLoginTest(String username, String password) throws InterruptedException {
		System.out.println("The thread for this test is :"+Thread.currentThread());
		foptions = new FirefoxOptions();
		foptions.addArguments("--start-maximized");
		foptions.addArguments("--inprivate");
		
		driver = new FirefoxDriver(foptions);
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.quit();
	
	}

@Test(dataProvider ="LoginFortutorialsNinja", dataProviderClass = SeperateDataProviderForMultipleBrowesers.class)
public void ChromeTestLogin(String username, String password) throws InterruptedException {
	System.out.println("The thread for this test is :"+Thread.currentThread());
	coptions = new ChromeOptions();
	coptions.addArguments("--start-maximized");
	coptions.addArguments("--incognito");
	
	driver = new ChromeDriver(coptions);
	driver.get("http://tutorialsninja.com/demo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	driver.findElement(By.linkText("Login")).click();
	
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Thread.sleep(5000);
	driver.quit();



//parallel execution rarely ever works
}
	
	
}
