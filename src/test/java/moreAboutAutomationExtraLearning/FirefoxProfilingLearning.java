package moreAboutAutomationExtraLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class FirefoxProfilingLearning {
 WebDriver driver;
 
	
	//open fire fox and instead of x for exit 
	//go to the three lines and click exit/close
	//then Firefox profiling can be done
	//type this in widnows+r 
	
	// firefox.exe -p -profilemanager
	//choose default or any profile
	// you can also create your own profile
	
	@BeforeMethod
	public void setUp() throws Exception {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--inprivate");
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		String[]excludedSwitches = {"disable-infobars"};
		options.setCapability("moz:firefoxOptions",ImmutableMap.of("excludedSwitches",excludedSwitches));
		
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile fireFoxProfile = new FirefoxProfile();
		options.setProfile(fireFoxProfile);
		
		driver = new FirefoxDriver(options);
		
		driver.get("https://rediff.com");
		Thread.sleep(2000);
		
	}
	@Test 
	public void verifyCurrentTitleAndUrl() {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String actualtitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle = driver.getTitle();
		
		String actualCurrentUrl = "https://www.rediff.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		if(actualtitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
		}else {
			System.out.println("Either Title or Url is wrong");
	}
	
		
		
	}
	@AfterMethod 
	public void tearDown() {
		
		driver.quit();
	}
}
