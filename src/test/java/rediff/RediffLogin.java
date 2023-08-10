package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RediffLogin {

    WebDriver driver;
    EdgeOptions options;


@BeforeMethod
    public void setup(){
    options = new EdgeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--inprivate");
    driver = new EdgeDriver(options);
driver.get("https://rediff.com");




}
    @Test(priority = 1)
    public void clickOnSignIn(){
driver.findElement(By.cssSelector("a.signin")).click();

    }
    @Test(priority = 2)
    public void enterValidUsername(){

        driver.findElement(By.cssSelector("a.signin")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
    }
    @Test(priority = 3)
    public void enterValidPassword(){
        driver.findElement(By.cssSelector("a.signin")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
       driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");

    }
    @Test(priority = 4)
    public void clickOnLogin(){
        driver.findElement(By.cssSelector("a.signin")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
        driver.findElement(By.cssSelector("input.signinbtn")).click();

        String actualWriteMailText = driver.findElement(By.xpath("//li[@class='rd_write']")).getText();
        String expectedWriteMailTest = "Write mail";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualWriteMailText.contains(expectedWriteMailTest));
        softAssert.assertAll();
        if(actualWriteMailText.contains(expectedWriteMailTest)){
            System.out.println("Write mail text is displayed properly : "+expectedWriteMailTest );

        }else{
            System.out.println("The Write mail text does not match this is the actual: " +actualWriteMailText);
            System.out.println("This is the expected :"+expectedWriteMailTest );
        }

    }

    @AfterMethod
    public void tearDown(){

driver.quit();    

    }
}
