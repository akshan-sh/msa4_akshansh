package in.akshansh.stepdefinitions;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.akshansh.utilities.PropertyReading;




public class Base 
{	PropertyReading gp = new PropertyReading();
	WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",gp.getFromProperty("chromePath") );
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver navigateDriver() throws IOException
	{
		driver.get(gp.getFromProperty("Home"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}


