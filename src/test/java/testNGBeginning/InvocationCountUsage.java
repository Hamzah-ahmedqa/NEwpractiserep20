package testNGBeginning;

import org.testng.annotations.Test;

public class InvocationCountUsage {
	
	
	
	
	
	@Test(priority=1)
	public void anything1() {
		System.out.println("This is test case 1");
	}
	
	
	@Test(priority=2)
	public void anything2() {
		System.out.println("This is test case 2");
	}
	                  //invocationCount means that you are specifying how many times you want the testcase to run
	@Test(priority=3, invocationCount=5)
	                  //this can be 100 or anything
	public void anything3() {
		System.out.println("---------------------");
		System.out.println("This is test case 3");
		System.out.println("---------------------");
	}
	
	
	

}
