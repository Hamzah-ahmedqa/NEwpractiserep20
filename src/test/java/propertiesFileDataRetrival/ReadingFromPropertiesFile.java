package propertiesFileDataRetrival;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ReadingFromPropertiesFile {

	WebDriver driver;
	EdgeOptions options;
	ChromeOptions Coptions;
	
	
	
	@Test
	public void TutorialsTest() throws InterruptedException, IOException {
		//create the object of properties class
		//create the object of file input stream class to access the properties file
		//go to properties of the file we made
//	C:\Users\ninja\eclipse-workspace\WEEKENDBATCH\com.maven.project\src\test\java\propertiesFileDataRetrival\TutorialsNinjaFile.properties
	
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		System.out.println("The common path which is universal is : " +System.getProperty("user.dir"));
		driver = new EdgeDriver(options);
	
		Properties prop = new Properties();                         //this user.dir is the C:\Users\ninja\eclipse-workspace\WEEKENDBATCH\com.maven.project
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesFileDataRetrival\\TutorialsNinjaFile.properties");
		prop.load(ip);
		
				driver.get(prop.getProperty("url"));
				driver.findElement(By.xpath(prop.getProperty("myAccountButton"))).click();
				driver.findElement(By.linkText("Login")).click();
		                                                                                 //this has to be passed in double qoutes 
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(prop.getProperty("ValidUsername"));
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(prop.getProperty("ValidPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
}
	@Test
	public void loginWithValidCredentials() throws IOException {
		
		Coptions = new ChromeOptions();
		Coptions.addArguments("--incognito");
		driver = new ChromeDriver(Coptions);	
		driver.manage().window().maximize();
		
		Properties prop = new Properties();                         //this user.dir is the C:\Users\ninja\eclipse-workspace\WEEKENDBATCH\com.maven.project
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesFileDataRetrival\\TutorialsNinjaFile.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("RediffUrl"));
		driver.findElement(By.cssSelector("input#login1")).sendKeys(prop.getProperty("ReddiffValidUserName"));
		driver.findElement(By.cssSelector("input#password")).sendKeys(prop.getProperty("RediffValidPassword"));
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		
		System.out.println("--------Reddif login test----------");
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	
	}
}