package in.akshansh.pageobjects;



import org.openqa.selenium.WebDriver;

import in.akshansh.uistore.StylingPageUI;




public class StylingPage {
	
	StylingPageUI styleUi;
	public StylingPage(WebDriver driver)
	{
		styleUi = new StylingPageUI(driver);
	}
	
	public boolean verifyAnchorbeardText() 
	{	
		boolean presence = styleUi.getAnchorBeard().isDisplayed();
		return presence;
		
	
	}
	
	
	
	
	
}
