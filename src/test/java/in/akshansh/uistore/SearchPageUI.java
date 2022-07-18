package in.akshansh.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageUI {
	
	public WebDriver driver;
	public SearchPageUI(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public By resultText= By.xpath("//h1[normalize-space()='Results For \"Razor\"']");
	
	

	
	public WebElement getresultText()
	{
		return driver.findElement(resultText);
	}
	

	
	
	
	
}
