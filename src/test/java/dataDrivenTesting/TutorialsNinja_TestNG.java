package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//@DataProvider return a 2-d object array 
//pass the elements of that 2-d array
//create the @test and pass DataProvider


public class TutorialsNinja_TestNG {
	
public WebDriver driver;
public EdgeOptions options;

 @DataProvider
 public  Object[][] GetData(){
	 
	Object[][] data = {{"Therealslimshady4eva1229@gmail.com","IamSecretlyEminem221"},
			              { "Therealslimshady4eva1@gmail.com","IamSecretlyEminem221"},
			                 { "Therealslimshady4eva2@gmail.com","IamSecretlyEminem221"}};
	return data;
	           
	}  


@BeforeMethod
public void Setup() {
	options = new EdgeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--inprivate");
	
	driver = new EdgeDriver(options);
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	driver.findElement(By.linkText("Login")).click();	
	

	
}
@Test(dataProvider="GetData")
public void LoginWithTest1(String username, String password) throws InterruptedException {
	
	driver.findElement(By.cssSelector("input#input-email")).sendKeys(username);
	driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Thread.sleep(5000);
}

@AfterMethod
public void ShutDown() {
	driver.quit();
	
}
}
