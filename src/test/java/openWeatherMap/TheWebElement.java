package openWeatherMap;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TheWebElement {

	
	////img[@src='/themes/openweathermap/assets/img/logo_white_cropped.png']
	//xpath is an address of a webelement 
	
	public WebDriver driver;
    public EdgeOptions Eoptions;
	
	
	@Test
	public void clickOnImage()throws InterruptedException {
		
		Eoptions = new EdgeOptions();
		Eoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		Eoptions.addArguments("--start-maximized");
		Eoptions.addArguments("--inprivate");
		
		driver = new EdgeDriver(Eoptions);
		
		driver.get("https://openweathermap.org/api");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='/themes/openweathermap/assets/img/logo_white_cropped.png']")).click();
		
		Thread.sleep(5000);
		
		
		
		
	
	
	}
	
	
}
