package automationProjectwithMainMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MultipleDriverCode {
		
	
	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions Eoptions = new EdgeOptions();
		ChromeOptions Coptions = new ChromeOptions();
		FirefoxOptions Foptions = new FirefoxOptions();
		
	//	WebDriver driver = new EdgeDriver(options);	
		
		String browserName = "Chrome";
		
		if(browserName.equals("Chrome")) {
			Coptions.addArguments("--start-maximized");
			Coptions.addArguments("--incognito");
			
			WebDriver driver = new ChromeDriver(Coptions);
			driver.get("https://amazon.com");
			Thread.sleep(3000);
			driver.quit();
			System.out.println("The Chrome browser opened");
			
		}else if(browserName.equals("Edge")) {
			Eoptions.addArguments("--start-maximized");
			Eoptions.addArguments("--inprivate");
			
			WebDriver driver = new EdgeDriver(Eoptions);
			driver.get("http://Roblox.com");
			Thread.sleep(3000);
			driver.quit();
			System.out.println("The Edge browser opened");
			
		}else if (browserName.equals("FireFox")) {
			Foptions.addArguments("--start-maximized");
			Foptions.addArguments("--private");
			
			WebDriver driver = new FirefoxDriver(Foptions);
			driver.get("https://walmart.com");
			Thread.sleep(3000);
			driver.quit();
			System.out.println("The FireFox browser opened");
			
		}else {
			System.out.println("Nothing opened");
		}
		
	
		
		
		
		
		
		
		
		
		

	}

}
