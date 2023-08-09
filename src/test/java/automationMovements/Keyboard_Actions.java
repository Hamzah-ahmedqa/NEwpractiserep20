package automationMovements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_Actions {
public WebDriver driver;
public ChromeOptions options;


@Test
public void KeyBoardActions() {
	
	options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	
	driver = new ChromeDriver(options);
	
			driver.get("http://tutorialsninja.com/demo");
			driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("Therealslimshady4eva1229@gmail.com");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("IamSecretlyEminem221");
		//	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
             // instead of this lets use actions to hit enter
			
			Actions actions = new Actions(driver);
			
			WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
	//		actions.sendKeys(Keys.ENTER).perform();			
			
}

}
