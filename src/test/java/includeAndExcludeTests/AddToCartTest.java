package includeAndExcludeTests;

import org.testng.annotations.Test;

public class AddToCartTest {

	/*
	 * Instead of using enabled = false 
	 * we can use the xml file 
	 */
	
	@Test(priority = 1)
	public void AddToCartTest1() {
		
		System.out.println("This is the Test1 in our add to cart class");
	}
	
	@Test(priority = 2)
	public void AddToCartTest2() {
		
		System.out.println("This is the Test2 in our add to cart class");
	}
	
	@Test(priority = 3)
	public void AddToCartTest3() {
		
		System.out.println("This is the Test3 in our add to cart class");
	}
	
}
