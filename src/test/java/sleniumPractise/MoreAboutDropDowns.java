package sleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MoreAboutDropDowns {

	public WebDriver driver;
	
	public EdgeOptions options;
	
	public Select select;
	
	@Test
	public void AutomateDropdown1() throws InterruptedException {
		
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		
		driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
		
		select = new Select(driver.findElement(By.cssSelector("select#tools")));
		select.selectByVisibleText("Cucumber");
		
		
		select = new Select(driver.findElement(By.cssSelector("select#tools1")));
		select.selectByVisibleText("TestNG");
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
	}
	
	
}
