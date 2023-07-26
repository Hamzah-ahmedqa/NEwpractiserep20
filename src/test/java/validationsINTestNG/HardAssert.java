package validationsINTestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

//TestNG has 2 forms of assertions, soft assert and hard assert

public class HardAssert {

	
	@Test
	public void logicTest() {
		
		if(2!=3) {
			System.out.println(2+3);
			
			Assert.assertTrue(true);
			Assert.fail();
			
			if(true!= false) {
				
				System.out.println("My logic is true");
			}
		} 
		
		
	}
}
