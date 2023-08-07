package retryinheritence;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestBase {
	public WebDriver driver;
	

	public WebDriver initializeBrowserAndOpenApplication(String browsername) {
		
		
		
		
		
		if(browsername.equalsIgnoreCase("chrome"));{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			
		}if(browsername.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("start-maximized");
			options.addArguments("--inprivate");
			driver = new FirefoxDriver(options);
			
		}else if(browsername.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--inprivate");
			driver = new EdgeDriver(options);
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		driver.get("https://rediff.com");
		return driver;
		
	
		
		
		
	}
}
