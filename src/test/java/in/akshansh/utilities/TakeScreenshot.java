package in.akshansh.utilities;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeScreenshot {
	

	
		
		public static String takeSs(WebDriver driver) throws IOException
		{
			Date date = new Date();
			
			String outputFileName = "./Screenshots/"+ 
			date.toString().replace(" ", "-").replace(":", "_")+".png";
			
			File outputPath = new File(outputFileName);
			File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ss,outputPath);
			return outputPath.getAbsolutePath();
			
		}
	

}

//another utility to take screenshot is embedded in the StepDefintion class with hook @After