package usingInheritenceInAutomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBase {

	public static WebDriver driver;
	public static EdgeOptions options;
	
public static void openBrowserAndApplication() throws Throwable {
	options = new EdgeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.addArguments("--start-maximized");
	options.addArguments("--inprivate");
	
	driver = new EdgeDriver(options);
	Thread.sleep(2000);
			driver.get("http://tutorialsninja.com/demo");
	
}
	
}
