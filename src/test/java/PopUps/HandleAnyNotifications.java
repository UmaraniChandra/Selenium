package PopUps;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAnyNotifications {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Integer> contentSettings=new HashMap<String, Integer>();
		HashMap<String, Object> profile=new HashMap<String, Object>();
		HashMap<String, Object> preference=new HashMap<String, Object>();
		
		ChromeOptions options=new ChromeOptions();
		
		contentSettings.put("media_stream", 1);
		profile.put("managed_default_content_settings", contentSettings);
		preference.put("profile",profile);
		
		options.setExperimentalOption("prefs", preference);
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://webcamtests.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("webcam-launcher"));
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
