package travelWebsitesAndDynamicDropDowns;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Easemytrip_us_DynamicDropDown {

	WebDriver driver;
	@BeforeMethod
		public void settUp() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--inprivate");
		options.addArguments("--start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new EdgeDriver(options);
			
		driver.get("https://www.easemytrip.com");
		
			
		}
	@Test 
	public void toAndFromOnEaseMyTrip() throws Exception {
		
	
		driver.findElement(By.cssSelector("div#frmcity")).click();
		driver.findElement(By.cssSelector("input#a_FromSector_show")).sendKeys("tor");
	Thread.sleep(2000);

  driver.findElement(By.xpath("//span[contains(text(),'Toronto(YZD)')]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("div#tocity")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='searcIcn']/following::div[@id='toautoFill']/preceding::input[@placeholder = 'To' and @id = 'a_Editbox13_show']")).sendKeys("uta");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span#spnAitutaki")).click();
 
	 //can use actions class to scroll to element 
	}
		
	
}
