package regrassionTest;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameWork.WebDriverFactory;
import pageObject.LandingPage;
import pageObject.SearchPage;

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
		Thread.sleep(3000);
		
		landingPageObj.wedNreg();
		
		landingPageObj.regiName("lobid");
		
		landingPageObj.searchButton();
	
		String actualTitle = driver.getTitle();
		System.out.println("Page actual Title : "+ actualTitle);
		String expectedTitle = "Find a Registry | Bed Bath & Beyond";
		AssertJUnit.assertEquals(actualTitle,expectedTitle);
		
		SearchPage searchPageObj = PageFactory.initElements(driver, SearchPage.class);
		String expected ="We found 1 registries";
		searchPageObj.resultTest(expected);
		

		
		
		
	}

}