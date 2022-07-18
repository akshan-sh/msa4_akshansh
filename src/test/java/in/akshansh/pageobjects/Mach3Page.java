package in.akshansh.pageobjects;



import org.openqa.selenium.WebDriver;

import in.akshansh.uistore.Mach3PageUI;



public class Mach3Page {
	
	Mach3PageUI machUi;
	public Mach3Page(WebDriver driver)
	{
		machUi = new Mach3PageUI(driver);
	}
	
	public boolean verifyMach3TurboText() 
	{	
		boolean presence = machUi.getTurboText().isDisplayed();
		return presence;
		
	
	}
	
	
	
	
	
}
