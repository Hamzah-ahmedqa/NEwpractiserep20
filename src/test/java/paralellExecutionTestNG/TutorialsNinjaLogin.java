package paralellExecutionTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TutorialsNinjaLogin {
	public WebDriver driver;
	public EdgeOptions options;
	                                                //this will make them all run at once rather than 1 by 1 
	 @DataProvider(name = "LoginFortutorialsNinja", parallel = true)
	 public  Object[][] GetData(){                 //make sure to add this in the DataProvider Method
		 
		Object[][] data = {{"Therealslimshady4eva1229@gmail.com","IamSecretlyEminem221"},
				              { "Therealslimshady4eva1@gmail.com","IamSecretlyEminem221"},
				                 { "Therealslimshady4eva2@gmail.com","IamSecretlyEminem221"}};
		return data;
		           
		}  
	
	@Test(dataProvider ="LoginFortutorialsNinja", dataProviderClass = TutorialsNinjaLogin.class)
	public void LoginWithTest1(String username, String password) throws InterruptedException {
		options = new EdgeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(5000);
		driver.quit();
	}


}
