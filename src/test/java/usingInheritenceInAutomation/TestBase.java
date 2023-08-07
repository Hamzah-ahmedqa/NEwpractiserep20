package usingInheritenceInAutomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class TestBase {

	public  WebDriver driver;
	public  EdgeOptions options;

	public  void openBrowserAndApplication() throws Throwable {
		options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--inprivate");

		driver = new EdgeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
		Thread.sleep(2000);
	}

}
