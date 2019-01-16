package pageObject;

import org.openqa.selenium.By;

import frameWork.BasePage;



public class LandingPage extends BasePage{

	public By weedingAndgift = By.xpath("//*[@id='top-nav-menu']/li[5]/div[1]/div/button/span");
	
	public By SingIn = By.xpath ("//*[@id='accountLink']");
	
	public By products = By.xpath ("//*[@id=\"firstTopNavItem\"]/span");
	
	public By regName = By.id("searchRegistry-text");
	
	public By searchButton = By.xpath("//*[@id='tabPanel4']/div/div/div/section/div/ul[1]/div/form/div[2]/button");
	
	public By title = By.xpath("/html/head/title/text()");


	public By College = By.xpath("//*[@id=\'top-nav-menu\']/li[3]/div[1]/div/button");

	public By ClickOn = By.xpath("//*[@id=\'app\']/div[2]/div[3]/main/section/section/div/div/div/ul/li/div[4]/a");


	public By alertWind = By.cssSelector("#rclModal > button");
	
	public void wedNreg() {
		clickOn(weedingAndgift);
	}
	
	public void regiName(String name)
	{
		enterData(regName, name);
	}
	
	public void searchButton()
	{
		clickOn(searchButton);
	}
	
	public void clg (){
		clickOn(College);
	}
	
	public void clckon(){
		clickOn(ClickOn);
	}
    public void alartWindow(){
		clickOn(alertWind);
	}
}
    
