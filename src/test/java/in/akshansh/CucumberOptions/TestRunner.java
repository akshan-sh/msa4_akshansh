package in.akshansh.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/in/akshansh/features",
				glue = "in.akshansh.stepdefinitions",
				dryRun = false,
				/*for pretty reporting*/
				plugin = {"pretty", "html:target/report.html", 
				/*for extent reporting*/
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome = true)
public class TestRunner {

}
