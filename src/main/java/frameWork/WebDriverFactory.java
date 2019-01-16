package frameWork;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

	protected static WebDriver driver = null;
	private String uRL = "https://www.bedbathandbeyond.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void initializeDriver() {

		System.setProperty("webdriver.chrome.driver", "/home/lobid/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(uRL);
		getDriver().manage().window().maximize();
        
	}

	@AfterClass
	public void tearDown() throws InterruptedException {

		if (driver != null) {
			//driver.manage().deleteAllCookies();
			 Thread.sleep(3000);
			//driver.quit();
			//driver.switchTo().alert().accept(); // Accept ()method emulates the action of clicking OK / YES button
			
			//driver.switchTo().alert().dismiss(); // Dismiss () method emulates the action of clicking NO/ CANCEL button
		
		}

	}
}