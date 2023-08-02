package retryFailedLoginTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
                                     //interface implemented by the class MyRetry
public class MyRetry  implements IRetryAnalyzer {

	private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	                             //this is our retry count
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	

  //(retryAnalyzer = MyRetry.class)
}
