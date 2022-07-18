package in.akshansh.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUI {
	
	public WebDriver driver;
	public HomePageUI(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public By products = By.xpath("//span[normalize-space()='Products']");
	public By MACH3 = By.linkText("MACH3");
	public By styling = By.xpath("//a[@class='event_menu_click'][normalize-space()='Styling']");
	public By searchIcon = By.xpath("//button[@id='searchIcon']");
	public By searchBox = By.xpath("//input[@id='search-box-input']");
	
	
	
	public WebElement getProducts()
	{
		return driver.findElement(products);
	}
	
	public WebElement getMACH3()
	{
		return driver.findElement(MACH3);
	}
	
	public WebElement getStyling()
	{
		return driver.findElement(styling);
	}
	
	public WebElement getSearchIcon()
	{
		return driver.findElement(searchIcon);
	}
	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
}
