package flipKartAndMultipleWebElements;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKart {
WebDriver driver;
EdgeOptions options;
Properties prop;
FileInputStream ip;

	
	@BeforeMethod
	public void setUp() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\flipKartAndMultipleWebElements\\config.properties");
		prop.load(ip);
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		 options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
	     options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 driver = new EdgeDriver(options);
		 driver.get(prop.getProperty("url"));
		 
		
	}
	@Test
	public void forLoopForBrandsAndPrices() {
		
		//div[@class='_2WkVRV'] this class represent 40 sweatshirts 
		List<WebElement> sweatShirts = driver.findElements(By.xpath("//div[@class='_2WkVRV']"));
		//print the amount of shirts on the page
		System.out.println("The total number of sweat shirts on this page is :" +sweatShirts.size());
		
		//div[@class='_30jeq3'] this class represents the price of 40 shirts
		List<WebElement> priceOfSweatShirts = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		
		//div[@class='_3Ay6Sb'] this represents the discount precentage if it is applied to each shirt
		List<WebElement> discountPercentage = driver.findElements(By.xpath("//div[@class='_3Ay6Sb']"));
		
		for (int i = 0 ; i<sweatShirts.size() ; i++) {
			
			System.out.println("sweatshirt Brand -> |"+sweatShirts.get(i).getText()+"| Price ->:: "+priceOfSweatShirts.get(i).getText()+"| discount->"+discountPercentage.get(i).getText());
		}
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
}
