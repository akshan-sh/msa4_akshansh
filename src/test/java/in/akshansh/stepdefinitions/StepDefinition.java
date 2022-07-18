package in.akshansh.stepdefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.akshansh.pageobjects.HomePage;
import in.akshansh.pageobjects.Mach3Page;
import in.akshansh.pageobjects.SearchPage;
import in.akshansh.pageobjects.StylingPage;
import in.akshansh.utilities.Logging;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition
{	
	
	Base base = new Base();
	Logging logger = new Logging();
	
	@Given("The driver is initialized")
	public void the_driver_is_initialized() throws IOException {
		base.initializeDriver();
		logger.log.info("Driver is initialized");
	}
	@Given("I am on the gillette homepage")
	public void i_am_on_the_gillette_homepage() throws IOException {
		base.navigateDriver();
		logger.log.info("navigated to gillette homepage");
	}
	@When("I hover on Products and click on MACH3 under brands")
	public void i_hover_on_products_and_click_on_mach3_under_brands() throws InterruptedException {
		HomePage home = new HomePage(base.driver);
		home.clickOnMach3UnderProducts();
		logger.log.info("clicked on MACH3 under the Products dropdown menu on homepage");
	}
	@Then("I find the text Gillette MACH3 Turbo is present on the directed page")
	public void i_find_the_text_gillette_mach3_turbo_is_present_on_the_directed_page() {
	    Mach3Page mach = new Mach3Page(base.driver);
	    boolean result = mach.verifyMach3TurboText();
	    logger.log.info("Verifying Gillete MACH3 Turbo text on the MACH3 page");
	    if(result) {
	    	Assert.assertTrue(result);
	    	logger.log.trace("Gillete MACH3 Turbo is present on the Mach3 page");
	    }
	    else {
	    	logger.log.error("Gillete MACH3 Turbo is NOT present on the Mach3 page");
	    	Assert.assertTrue(result);
	    	
	    }
		
	}
	@Then("I close the browser")
	public void I_close_the_browser() {
	    base.driver.quit();
	    logger.log.info("quitting the browser window");
	}
	
	@When("I click on Styling under Learn in the footer section")
	public void i_click_on_styling_under_learn_in_the_footer_section() throws InterruptedException {
	   HomePage home = new HomePage(base.driver);
	   home.clickOnStyling();
	   logger.log.info("clicking on Styling under Learn list of footer section");
	   Thread.sleep(5000l); //waiting for the styling page to load
	}
	@Then("I find the text Facial Hair Styles: The Anchor Beard")
	public void i_find_the_text_facial_hair_styles_the_anchor_beard() {
	    StylingPage style = new StylingPage(base.driver);
	    boolean result = style.verifyAnchorbeardText();
	    logger.log.info("Verifying Facial Hair Styles: The Anchor Beard text is present on the Styling page");
	    if(result) {
	    	Assert.assertTrue(result);
	    	logger.log.trace("Facial Hair Styles: The Anchor Beard text is present on the Styling page");
	    }
	    else {
	    	logger.log.error("Facial Hair Styles: The Anchor Beard text is NOT present on the Styling page");
	    	Assert.assertTrue(result);
	    	
	    }
	    
	}
	
	@When("I search for the Razor")
	public void i_search_for_the_razor() throws InterruptedException {
		HomePage home = new HomePage(base.driver);
		home.search("Razor");
		logger.log.info("Searching for Razor on the homepage");
		
	}
	
	
	@Then("I find the text Results For Razor appears at top of the search results")
	public void i_find_the_text_results_for_razor_appears_at_top_of_the_search_results() {
	    SearchPage search = new SearchPage(base.driver);
	    boolean result = search.verifyResultText();
	    logger.log.info("Verifying if Results For Razor text is present on the search results page");
	    if(result) {
	    	Assert.assertTrue(result);
	    	logger.log.trace("Results For Razor text is present on the Styling page");
	    }
	    else {
	    	logger.log.error("Results For Razor text is NOT present on the Styling page");
	    	Assert.assertTrue(result);
	    	
	    }
	    
	}

	@After
	public  void takeSs(Scenario scenario) throws IOException
	{
	{	if(scenario.isFailed())
		{
			final byte[] screenshot = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image");
			logger.log.error("Taking the screenshot for the failed test scenario");
		}
		
	}

}
}
	
	

