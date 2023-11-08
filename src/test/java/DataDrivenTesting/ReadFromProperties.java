package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// Step 1:convert physical file into java readable object
		//new FileInputStream-->throws FileNotFoundException
		FileInputStream fis= new FileInputStream("src/test/resources/data.properties");
		
		//step 2:Create an instance for properties class
		Properties property=new Properties();
		//step 3:Load all key-value pairs from fis properties class
		//property.load(fis)-->throwsIOException
		property.load(fis);
		//step 4: fetch data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		

	}

}
