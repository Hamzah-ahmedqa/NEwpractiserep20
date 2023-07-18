package automationProjectwithMainMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoteAllowOriginsMeaning {
	
	static WebDriver driver; 
	static ChromeOptions options;
	

	public static void main(String[] args) throws InterruptedException {
	    
		
		
		options = new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments(" --remote-allow-origins=*");
		
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,null);
		
		driver.navigate().to("https://walmart.com");
	Thread.sleep(3000);
//	wait.until(ExpectedConditions.elementToBeClickable(by.))
	
		driver.quit();
		
		
		

	}

}
