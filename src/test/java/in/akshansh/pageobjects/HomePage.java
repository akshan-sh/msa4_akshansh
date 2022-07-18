package in.akshansh.pageobjects;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import in.akshansh.uistore.HomePageUI;



public class HomePage {
	
	HomePageUI homeUi;
	public HomePage(WebDriver driver)
	{
		homeUi = new HomePageUI(driver);
	}
	
	public void clickOnMach3UnderProducts() throws InterruptedException
	{	
		Actions action = new Actions(homeUi.driver);
		action.moveToElement(homeUi.getProducts()).build().perform();
		Thread.sleep(2000l);
		homeUi.getMACH3().click();
		
	
	}
	
	public void clickOnStyling()
	{	Actions action = new Actions(homeUi.driver);
		action.moveToElement(homeUi.getStyling()).build().perform();
		homeUi.getStyling().click();
	}
	
	public void search(String string) throws InterruptedException
	{
		homeUi.getSearchIcon().click();
		Thread.sleep(1000l);
		homeUi.getSearchBox().sendKeys(string);
		homeUi.getSearchBox().sendKeys(Keys.ENTER);
	}
	
	
	
	
	
}
