package calendarDatePicker;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningVariousConcepts {

	WebDriver driver;
	EdgeOptions options;
	SoftAssert softAssert;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() throws Exception {

		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
		
		driver = new EdgeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void selectDate() {
		
		
		
		WebElement calendar = driver.findElement(By.cssSelector("input#datepicker"));
		calendar.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#ui-datepicker-div")));
		
        	
       //insert any date
		selectDateCalendar("31","January","2031");
		
	}
	
	@Test(priority = 2)
	public void usingJavaScriptExecutor() {
		
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("document.getElementById('datepicker').value='25/12/2026'");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	public void selectDateCalendar(String calendarDay, String calendarMonth, String calendarYear) {
		
		//February month cannot have more than 29 days 
		if(calendarMonth.equals("February") && Integer.parseInt(calendarDay)>29)
			return;
		
		//other months cannot have more than 31 days
		if(Integer.parseInt(calendarDay)>31) {
			System.out.println("Invalid date");
			return;
		}

		String monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println("Current month is "+monthYear);
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		int i = 1;
        while(!(month.equals(calendarMonth)&&year.equals(calendarYear))) {
        	driver.findElement(By.xpath("//a[@title='Next']")).click();
        	monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
        	month = monthYear.split(" ")[0];
    	    year = monthYear.split(" ")[1];
        	System.out.println("This is click number :"+i);
        	i++;
	}
        
	
         String dynamicXpath = 
        "//td[@data-handler = 'selectDay']/a[text()=\'"+calendarDay+"\']";
        
         try {
         driver.findElement(By.xpath(dynamicXpath)).click();
         }catch(Exception e) {
        	 System.out.println("invalid Date "+calendarDay+"/"+ calendarMonth + "/"+calendarYear);
         }
        
	}
}
