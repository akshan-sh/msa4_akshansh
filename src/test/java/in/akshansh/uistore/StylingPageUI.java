package in.akshansh.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StylingPageUI {
	
	public WebDriver driver;
	public StylingPageUI(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public By anchorBeard = By.xpath("//a[@title='Facial Hair Styles: The Anchor Beard']//div//h3");
	
	
	
	
	public WebElement getAnchorBeard()
	{
		return driver.findElement(anchorBeard);
	}
	

	
	
	
	
}
