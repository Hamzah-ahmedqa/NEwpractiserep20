package includeAndExcludeTests;

import org.testng.annotations.Test;

public class RegisterTest {


	@Test(priority = 1)
	public void RegisterTest1() {
		
		System.out.println("This is the Test1 in our Register class");
	}
	
	@Test(priority = 2)
	public void RegisterTest2() {
		
		System.out.println("This is the Test2 in our Register class");
	}
	
	@Test(priority = 3)
	public void RegisterTest3() {
		
		System.out.println("This is the Test3 in Register class");
	}
}
