package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		//step1:Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		
		//step 2:create an instance of Properties class
		Properties property=new Properties();
		
		//step 3:Load all the key-value pairs into Properties object
		property.load(fis);
		
		//step 4:Write Properties object
		property.put("user2", "trainee");
		property.put("pwd", "trainee");
		
		//step 5:save the file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "Updated Successfully");
		
		
		
		
		
		
	

	}

}
