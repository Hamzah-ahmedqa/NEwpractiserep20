package cssSelectorsJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Traversing_With_CssSelectors {

public WebDriver driver;
	
	public EdgeOptions options;
	public WebDriverWait wait;
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		driver = new EdgeDriver(options);
	driver.get("https://openweathermap.org/");
    Thread.sleep(3000);
	
	
	}
	
	@Test(priority=1)
	public void clickOnLogin()throws InterruptedException {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#desktop-menu>form+ul>li.user-li>a")));
		driver.findElement(By.cssSelector("div#desktop-menu>form+ul>li.user-li>a")).click();
		
		
		
	}
	@Test
	public void clickOnCreateAccount(){
		
		
		
	}
	@AfterMethod
	public void ShutDown() {
		driver.quit();
	}
	
}
