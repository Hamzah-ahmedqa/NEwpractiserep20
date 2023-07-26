package validationsINTestNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcepts {
	
	@Test
	public void logicTest() {
		SoftAssert softassert = new SoftAssert();
		
		if(2!=3) {
			System.out.println(2+3);
			
			softassert.assertTrue(true);
			softassert.fail();
			
			if(true!= false) {
				
				System.out.println("My logic is true");
			}
			softassert.assertAll(); // make sure to add this at the end of each testCase with all other softasserts
			            //it will collect pass or fail and give the output of all
		} 
		
		
	}
}
