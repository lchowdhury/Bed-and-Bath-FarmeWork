package pageObject;

import org.openqa.selenium.By;

import frameWork.BasePage;

public class SearchPage extends BasePage{
	public By result = By.xpath("//*[@id='app']/div[2]/div[3]/main/section/aside/div[1]/section/div[1]/h3");
	
	public void resultTest(String expected) {
		verifyText(result,expected);
		
	}
	
}
