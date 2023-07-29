package propertiesFileDataRetrival;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestingWithExcelSheet {

	@DataProvider(name = "TutorialsNinja")
	public static Object[][] getTutorialsNinjaData() throws Exception{
		Object[][] data =  TestingWithExcelSheet.readDataFromExcel("TutNinjaLogin");
		return data;
		
	}
	                                      
	public static Object[] [] readDataFromExcel(String sheetName) throws Exception {
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\propertiesFileDataRetrival\\ExcelTestData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(ip);
		
		                                      //call the sheet
	       XSSFSheet sheet = workbook.getSheet(sheetName);
	       
	       //determine the rows and columns
	       
	    int rows =   sheet.getLastRowNum();
	    int cols = sheet.getRow(0).getLastCellNum();
		
	    Object[][]data = new Object[rows][cols];
	    
	    for(int i = 0 ; i<rows ; i++) {
	      XSSFRow row = sheet.getRow(i+1);   
	      
	      for(int j=0 ; j<cols; j++ ) {
	    	  
	    	XSSFCell cell =  row.getCell(j);
	    	
	    	CellType celltype = cell.getCellType();
	    	
	    	
	    	switch(celltype) {
	    	
	    	case STRING:
	    		data[i][j] = cell.getStringCellValue();
	    		break;
	    		
	    	case NUMERIC:
	    		data[i][j] = Integer.toString((int)cell.getNumericCellValue());
	    		break;
	    		
	    	case BOOLEAN:
	    		data[i][j] = cell.getBooleanCellValue();
	    		break;
	    		
	    		
	    	}//switch loop
	      } //outer loop
	    } //inner loop
	    
	    return data;
	    
	}
			
}
