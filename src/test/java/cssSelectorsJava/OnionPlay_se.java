package cssSelectorsJava;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

public class OnionPlay_se {

	public WebDriver driver;
	
	public EdgeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new EdgeDriver(options);
		driver.get("https://onionplay.se");
		
		
	}
	
	
	@Test
	public void SearchFuntioonTest()throws InterruptedException {
		driver.findElement(By.cssSelector("input[id=s]")).sendKeys("Legend");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#s+button[type=submit]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Legend 2015')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'STREAM')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),' Watch for Free ')]")).click();
		driver.switchTo().alert().dismiss();
		
		

	
	
	
}
}