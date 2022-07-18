package in.akshansh.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReading
{
	Properties prop = null;
	FileInputStream fis = null;
	
	public String getFromProperty(String name) throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("./Properties/data.properties");
		prop.load(fis);
		return prop.getProperty(name);
	}
	

}
