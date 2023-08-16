package moreAboutAutomationExtraLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/*
  whenever we work in a company, we will work under a pipeline that has
  a development pipeline > QA pipeline > UAT > prod
  and there will be builds within each one, and we need to make sure the response code is right like 
  414 and etc
 
 */

public class ResponseCodeOfAURL {

	public WebDriver driver;
	
	@Test
	public void responseCodeLeanring() throws Exception, IOException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		Properties prop = new Properties();//create the object of properties
FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\moreAboutAutomationExtraLearning\\congif.properties");
		prop.load(ip);
		
	int responseCode = Request.Get(prop.getProperty("urlQA1")).execute().returnResponse().getStatusLine().getStatusCode();
	 
	System.out.println("The status code of Rediff is : " +responseCode);
	//this print 200

	if(responseCode==200) {
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(System.getProperty("urlQA1"));
	}else {
		System.out.println("The responde code is not 200");
	}
	
	}
	
	
	
	
}
