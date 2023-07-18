package testNGBeginning;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TryingAnnotations {

//@AnnotationName	

	@BeforeSuite
	public void SampleBeforeSuiteTest() {
		
		System.out.println("This is the before suite method");
	}
	
	@BeforeTest
	public void sampleBeforeTest() {
		System.out.println("This is the before test method");
		
	}
	
	@BeforeClass
	public void sampleBeforeClassTest() {
		System.out.println("This is the before class method");
		
	}
	
	@BeforeMethod
	public void sampleBeforeMethodTest() {
		System.out.println("This is the before method method");
		
	}
	
	@Test
	public void VerifySomeBullshit() {
		System.out.println("here we are testing the bullshit");
		
	}
	
	@Test
	public void VerifySomeOtherBullshit() {
		System.out.println("here we are testing more bullshit");
		
	}
	
	@Test
	public void VerifyEvenMoreBullshit() {
		System.out.println("here we are even more bullshit");
		Assert.fail("Deliberitly failing this test case");
		}
	
	@AfterMethod
	public void sampleAfterMethod() {
		System.out.println("This is the after method method");
		
	}
	
	@AfterClass
	public void sampleAfterClass() {
		System.out.println("This is the after class method");
		
	}
	
	@AfterTest
	public void sampleAfterTest() {
		
		System.out.println("This is the after test method");
	}
	
	@AfterSuite
	public void sampleAfterSuite() {
		System.out.println("This is the after suite method");
		
	}
	
}
