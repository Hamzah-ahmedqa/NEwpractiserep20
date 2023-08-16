package moreAboutAutomationExtraLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BraveBrowser {

	public WebDriver driver;
	
	@Test
	public void codeInBraveBrowser() throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		Properties prop = new Properties();//create the object of properties
FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\moreAboutAutomationExtraLearning\\congif.properties");
		prop.load(ip);
		
		options.setBinary(prop.getProperty("path"));
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		driver=new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo");
		WebElement search = driver.findElement(By.cssSelector("input.form-control.input-lg"));
		search.click();
		search.sendKeys("Iphone",Keys.ENTER);
		
	}
	
}
