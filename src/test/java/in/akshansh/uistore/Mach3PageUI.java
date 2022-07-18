package in.akshansh.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mach3PageUI {
	
	public WebDriver driver;
	public Mach3PageUI(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public By turboText = By.cssSelector("body > div:nth-child(2) > main:nth-child(3) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)");
	
	
	
	
	public WebElement getTurboText()
	{
		return driver.findElement(turboText);
	}
	

	
	
	
	
}
