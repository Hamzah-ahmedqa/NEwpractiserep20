package automationProjectwithMainMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class OptionsAndMore {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		
		options.addArguments("--inprivate");
		options.addArguments("--start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		WebDriver driver = new EdgeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
		
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Bob");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("The Builder");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("Datboi88229@gmail.com");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("123123123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Thisisasupersecret123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Thisisasupersecret123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        
        driver.quit();
		
		
		
		
		
		
		

	}

}
