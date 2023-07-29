package com.takingAdvantageOfExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataAndDataProvider {
	
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	@DataProvider(name="LoginSheetExcel")
	public static Object[][] loginWithExcelSheet() throws Exception{
		Object[][] data =  ExcelDataAndDataProvider.readDataFromExcel("Login");
		return data;
	}
	
	@DataProvider(name = "TutorialsNinjaRegister")
	public static Object[][] getTutorialsNinjaData() throws Exception{
		Object[][] data =  ExcelDataAndDataProvider.readDataFromExcel("Register");
		return data;
		
	}
	
public static Object[] [] readDataFromExcel(String sheetName) throws Exception {
		
		 ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\takingAdvantageOfExcel\\RegisterAndLoginForTN.xlsx");
		
		 workbook = new XSSFWorkbook(ip);
				                                    //call the sheet
	     sheet = workbook.getSheet(sheetName);
	       
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
