package regrassionTest;


import frameWork.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.SearchPage;

import java.util.Iterator;
import java.util.Set;

public class RegistrySearch extends WebDriverFactory {
	
	
	/**Given user is on bed and bath beyond landing page
	 * when user click on weeding and gift registry
	 * And user enter first name/last name
	 * when user click on search button
	 * user is on search result page
	 * Then I verify user is getting search result
	 */
//class contain all the nods and services 
	
	@Test
	public void regisrtySearchTest() throws InterruptedException {
		getDriver();

		LandingPage landingPageObj = PageFactory.initElements(driver, LandingPage.class);
		Thread.sleep(2000);
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();

		subWindowHandler = iterator.next();

		driver.switchTo().window(subWindowHandler);
		landingPageObj.alartWindow();
		driver.switchTo().window(parentWindowHandler);

		landingPageObj.wedNreg();
		
		landingPageObj.regiName("lobid");
		
		landingPageObj.searchButton();
		parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		subWindowHandler = null;
		handles = driver.getWindowHandles(); // get all window handles
		iterator = handles.iterator();

		subWindowHandler = iterator.next();

		driver.switchTo().window(subWindowHandler);
		landingPageObj.alartWindow();
		driver.switchTo().window(parentWindowHandler);

		landingPageObj.clg();

		landingPageObj.clckon();


		String actualTitle = driver.getTitle();
		System.out.println("Page actual Title : "+ actualTitle);
		String expectedTitle = "Find a Registry | Bed Bath & Beyond";
		AssertJUnit.assertEquals(actualTitle,expectedTitle);
		
		SearchPage searchPageObj = PageFactory.initElements(driver, SearchPage.class);
		String expected ="We found 1 registries";
		searchPageObj.resultTest(expected);
		

		
		
		
	}

}