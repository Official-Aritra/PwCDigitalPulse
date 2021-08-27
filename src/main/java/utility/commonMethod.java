package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class commonMethod {
	public String property_file_reading(String keyrequired) throws IOException
	{
		File file = new File("./TestData/Data.properties");
		FileInputStream fi = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fi);
		return prop.getProperty(keyrequired);
		
	}

	
	
}
