package in.akshansh.pageobjects;



import org.openqa.selenium.WebDriver;

import in.akshansh.uistore.SearchPageUI;





public class SearchPage {
	
	SearchPageUI searchUi;
	public SearchPage(WebDriver driver)
	{
		searchUi = new SearchPageUI(driver);
	}
	
	public boolean verifyResultText() 
	{	
		boolean presence = searchUi.getresultText().isDisplayed();
		return presence;
		
	
	}
	
	
	
	
	
}
