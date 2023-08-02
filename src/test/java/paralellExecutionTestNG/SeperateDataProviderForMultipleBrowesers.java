package paralellExecutionTestNG;

import org.testng.annotations.DataProvider;

public class SeperateDataProviderForMultipleBrowesers {

	 @DataProvider(name = "LoginFortutorialsNinja", parallel = true)
	 public  Object[][] GetData(){                 //make sure to add this in the DataProvider Method
		 
		Object[][] data = {{"Therealslimshady4eva1229@gmail.com","IamSecretlyEminem221"}};
		return data;
		           
		} 
	
	
}
