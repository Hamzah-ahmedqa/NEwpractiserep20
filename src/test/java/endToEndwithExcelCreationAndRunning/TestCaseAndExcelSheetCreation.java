package endToEndwithExcelCreationAndRunning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseAndExcelSheetCreation {
	
	EdgeDriver driver;
	EdgeOptions options;
	
	@Test(priority = 1)
	public void createNewExcelFile() throws IOException {                                    //set a path for creating our excel sheet---WE MUST ADD .xlsx
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\endToEndwithExcelCreationAndRunning\\ThisisOursheet.xlsx";       
		         //create an object for our workbook
		Workbook workbook = new XSSFWorkbook();
		                                           //pass the path here 
		FileOutputStream outputStream = new FileOutputStream(filePath);
		
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		
		
		
	}
	@Test(priority = 2)
	public void createNewSheetAndPassDataIntoIt()throws IOException {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\endToEndwithExcelCreationAndRunning\\ThisisOursheet.xlsx";
		String sheetName = "Register";
		String[] firstname = {"Jack","Peter","Johnny","Peter","William","Tom","Bugs","Mickey","Ethan"};	
		String[] lastname = {"Sparrow","Griffin","Depp","Parker","Turner","Cruise","Bunny","Mouse","Hunt"};
		
		String[] email = {"CaptainJackSparrow@gmail.com", "IamGriffin@yahoo.com", "JohnnyDeppster@gmail.com",
				          "PeterPhotography@gmail.com", "WilliamTurn3r@gmail.com", "CruisingForNow@yahoo.com",
			               "WhatsupDoc@Gmail.com","ClubHouseRules@Gmail.com","EthanontheHunt@gmail.com"};
		
		String[]telephone = {"4104104411","4434433344","2211122121","3454567890","9998883232",
				            "6669996969","9996669696","0002223434","1112223223"};
		
		String[] password = {"BlackPearlLover123","TheDogtalks69","Amberismean221","IamSpiderMan321",
				   "StuckOnThedutch66","idomyownStunts23","CarrotFan321","IhateMinnie84", "ijumpoffShit55"};
		
		String[] confirmPassword = {"BlackPearlLover123","TheDogtalks69","Amberismean221","IamSpiderMan321",
				   "StuckOnThedutch66","idomyownStunts23","CarrotFan321","IhateMinnie84", "ijumpoffShit55"};
		
		FileInputStream inputStream = new FileInputStream (filePath);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet =  workbook.createSheet(sheetName);
		
				                                       
		Row headRow = sheet.createRow(0);
		headRow.createCell(0).setCellValue("firstname");
		headRow.createCell(1).setCellValue("lastname");
		headRow.createCell(2).setCellValue("email");
		headRow.createCell(3).setCellValue("telephone");
		headRow.createCell(4).setCellValue("password");
		headRow.createCell(5).setCellValue("confirmPassword");
		
		for(int i = 0; i < firstname.length; i++) {
			Row row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(firstname[i]);
			row.createCell(1).setCellValue(lastname[i]);
			row.createCell(2).setCellValue(email[i]);
			row.createCell(3).setCellValue(telephone[i]);
			row.createCell(4).setCellValue(password[i]);
			row.createCell(5).setCellValue(confirmPassword[i]);
		}
		
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		
		
	}
	@Test(priority = 3, dataProvider = "TutorialsNinjaRegister", dataProviderClass = DataprovidersForExcel.class )
	public void TutorialsNinjaRegisterTest(String firstname,String lastname,String email,String telephone,String password,String confirmPassword ) throws Throwable {
		
		options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");
		
		driver = new EdgeDriver(options);
		Thread.sleep(2000);
				driver.get("http://tutorialsninja.com/demo");
				
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(firstname);
				driver.findElement(By.cssSelector("input#input-lastname")).sendKeys(lastname);
				driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
				driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(telephone);
				driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
				driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(confirmPassword);
				driver.findElement(By.xpath("//input[@name='newsletter' and @value='0']")).click();
				driver.findElement(By.xpath("//input[@name='agree']")).click();
				driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
				driver.quit();
	}
	
	@Test(priority = 4)
	public void createNewSheetToPassCreatedDataInPreviousTestCase()throws Throwable {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\endToEndwithExcelCreationAndRunning\\ThisisOursheet.xlsx";
		String sheetName = "Login";
		
		String[] email = {"CaptainJackSparrow@gmail.com", "IamGriffin@yahoo.com", "JohnnyDeppster@gmail.com",
		          "PeterPhotography@gmail.com", "WilliamTurn3r@gmail.com", "CruisingForNow@yahoo.com",
	               "WhatsupDoc@Gmail.com","ClubHouseRules@Gmail.com","EthanontheHunt@gmail.com"};
		
		String[] password = {"BlackPearlLover123","TheDogtalks69","Amberismean221","IamSpiderMan321",
				   "StuckOnThedutch66","idomyownStunts23","CarrotFan321","IhateMinnie84", "ijumpoffShit55"};
		
		FileInputStream inputStream = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.createSheet(sheetName);
		
		int rowNum = 0;
		Row row = sheet.createRow(rowNum++);
		Cell usernameCell = row.createCell(0);
		usernameCell.setCellValue("username");
		Cell passwordCell = row.createCell(1);
		passwordCell.setCellValue("password");
		
		for(int i = 0; i < email.length ; i++) {
			row =sheet.createRow(rowNum++);
			usernameCell = row.createCell(0);
			usernameCell.setCellValue(email[i]);
			passwordCell = row.createCell(1);
			passwordCell.setCellValue(password[i]);
		}
		
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
		
		
		
	}
	@Test(priority =5, dataProvider = "TutorialsNinjaLogin", dataProviderClass = DataprovidersForExcel.class )
	public void TutorialsNinjaLoginWithExcelNewlyCreatedData(String username, String password) throws Throwable {
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
				
				SoftAssert softassert = new SoftAssert();
			WebElement myAccountProfileText = driver.findElement(By.xpath("//h2[contains(text(),'My Account')]"));
			softassert.assertTrue(myAccountProfileText.isDisplayed());
			if(myAccountProfileText.isDisplayed()) {
				System.out.println("This account has successfully logged in :" + username);
				
			}else {
				System.out.println("This account has not logged in successfuly :" + username);
			}
			softassert.assertAll();
				driver.quit();
	}

  }

