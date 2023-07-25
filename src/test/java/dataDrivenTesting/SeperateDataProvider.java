package dataDrivenTesting;

import org.testng.annotations.DataProvider;

public class SeperateDataProvider {

	                   //we can put the name here and pass this instead of the method name in our testcases class
	@DataProvider //(name = DataForninjatutorials)
	 public static  Object[][] GetNinjaData(){
		 
		Object[][] data = {{"Therealslimshady4eva1229@gmail.com","IamSecretlyEminem221"},
				              { "Therealslimshady4eva1@gmail.com","IamSecretlyEminem221"},
				                 { "Therealslimshady4eva2@gmail.com","IamSecretlyEminem221"}};
		return data;
		           
		}  
	//can multiple data providers here
	
	
	
	
	
	
}
