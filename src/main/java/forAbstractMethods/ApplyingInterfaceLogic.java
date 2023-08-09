package forAbstractMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplyingInterfaceLogic {
	
                           //chromeDriver is an implementing class
	public WebDriver driver = new ChromeDriver();
	//webDriver is an interface
	//WebDriver has a lot of abstract Methods
	
	//we are able to point to the object of ChromeDriver class using the reference driver we created
	//an interface can refer to the object of a class
	
	
	@Test
	public void someTest() {
		driver.manage().window().maximize();
		   //these are unimplemented or abstract methods of WebDriver interface
		//we dont know how they are doing this, but we can call and use them
		//that is our input, and the output is the browser opening and maximizing 
		
		driver.get("https://roblox.com");
		       // this an overloaded unimplemented method
		
	}
	
	
}
