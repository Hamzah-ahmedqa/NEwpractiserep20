package moreAboutAutomationExtraLearning;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class Disable_inforBar {

	public WebDriver driver;
	public ChromeOptions options;
	public EdgeOptions Eoptions;
	public FirefoxOptions foptions;
	
	@Test
	public void letsDisableTheInfoBar() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		
		//you know when it says the browser is being controlled by automated test software 
		//to make that go away lets do this
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
		                              //this is always excludeSwitches
		driver = new ChromeDriver(options);
		driver.get("https://google.com");
		
		
	}

	@Test 
	public void disableInfoBarsInFireFox() {
		foptions = new FirefoxOptions();
		
		foptions.addArguments("--inprivate");
		foptions.addArguments("--start-maximized");
		                              // can use --start-fullscreen for firefox
		foptions.addPreference("browser.tabs.remote.autostart", false);
		
		String[]excludedSwitches = {"disable-infobars"};
		foptions.setCapability("moz:firefoxOptions",ImmutableMap.of("excludedSwitches",excludedSwitches));
		driver = new FirefoxDriver(foptions);
		driver.get("https://rediff.com");
	}
	
	@Test
	public void 
	disableInfoBarInEdge() {
		   EdgeOptions options = new EdgeOptions();
	        options.setPageLoadStrategy(PageLoadStrategy.NONE);
	        options.addArguments("--inprivate"); 
	        options.addArguments("--start-maximized");
	        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

	        WebDriver driver = new EdgeDriver(options);
	        driver.get("https://google.com");
		
	}
	
}
