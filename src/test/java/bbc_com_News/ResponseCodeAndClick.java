package bbc_com_News;

import java.util.Arrays;
import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ResponseCodeAndClick {

	WebDriver driver;
	ChromeOptions options;
	SoftAssert softAssert;
	
	
	@BeforeMethod
	public void setUp() {
		softAssert = new SoftAssert();
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation","disable-infobars"));
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//come back to 47:56
		driver = new  ChromeDriver(options);
		driver.get("https://bbc.com");		
	
		
	}
	@Test
	public void bbcHeaderLinks() throws Exception {
		//if the code returns as 200 then click the link
	List<WebElement> bbcHeaderLinks = driver.findElements(By.cssSelector("nav.orbit-header-links.international>ul>li"));
	System.out.println(bbcHeaderLinks.size());	//how many links are in the header
	
	for (int i = 0 ; i<bbcHeaderLinks.size(); i++ ) {
		
		System.out.println(bbcHeaderLinks.get(i).getText()+"-->"+bbcHeaderLinks.get(i).isDisplayed());
		String url = bbcHeaderLinks.get(i).getAttribute("href");
		System.out.println(url);
		boolean result = validateResponseCode(url);
		softAssert.assertTrue(result,"invalid response code");
		                     //true    //false
		System.out.println("--------------------------------------");
		
		bbcHeaderLinks.get(i).click();
		Thread.sleep(1000);
		System.out.println("The title of this page is : " +driver.getTitle());
		driver.get("https://bbc.com");
		Thread.sleep(1000);
		bbcHeaderLinks = driver.findElements(By.cssSelector("nav.orbit-header-links.international>ul>li"));
		
	}
	softAssert.assertAll();
	
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	public boolean validateResponseCode(String url) throws Exception, Exception {
		
		int responseCode = 0;
		responseCode = Request.Get("https://bbc.com").execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("The response code for this url : "+url+" is -> "+responseCode);
		
		if(responseCode==200) {
			System.out.println("the response code is clickabe");
			return true;
			
		}else {
			System.out.println("the response code is unclickabe");
			return false;
		}
		
		
	}
	
}
