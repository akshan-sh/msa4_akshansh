package in.akshansh.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporting {
	
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss").format(new Date());
	public ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Reports/" + timeStamp + ".html");
	
	{
		extent.attachReporter(spark);
		spark.config().setDocumentTitle("Extent Test Report");
	}
	
	protected ExtentTest test;

}
