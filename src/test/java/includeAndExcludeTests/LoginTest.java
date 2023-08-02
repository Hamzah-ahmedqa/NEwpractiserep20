package includeAndExcludeTests;

import org.testng.annotations.Test;

public class LoginTest {


	@Test(priority = 1)
	public void LoginTest1() {
		
		System.out.println("This is the Test1 in our Login class");
	}
	
	@Test(priority = 2)
	public void LoginTest2() {
		
		System.out.println("This is the Test2 in our Login class");
	}
	
	@Test(priority = 3)
	public void LoginTest3() {
		
		System.out.println("This is the Test3 in Login class");
	}
	
}
