package listenersInAutomationAndExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	// go to source and click on add unimplemented methods and select all
	
	@Override
	public void onStart(ITestContext context) {
		                 //this is also an interface
		System.out.println("Operation started");
		
	}

	@Override  
	public void onTestStart(ITestResult result) {
		//ITestResult is an interface, it is acting as an input parameter inside that unimplemented method	
		String testName = result.getName();
		System.out.println(testName + " Starting Test");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " Test Passed :)");
	
	}

	@Override                     
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " Test Failed :(");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " Test got skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " Test took too long");
		
	}
	


@Override     //this is after start like your done
public void onFinish(ITestContext context) {
	 System.out.println("Operation Ended");

} 
	
	
	
	
	// --------------------- these bottom two are not related to the test cases
//this is onStart like im about to start
/*	@Override
	public void onStart(ITestContext context) {
		                 //this is also an interface
		ITestListener.super.onStart(context);
	}

	@Override     //this is after start like your done
	public void onFinish(ITestContext context) {
		 
		ITestListener.super.onFinish(context);
	}                                                       */

}
