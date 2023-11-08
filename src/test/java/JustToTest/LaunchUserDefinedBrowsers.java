package JustToTest;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchUserDefinedBrowsers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		System.out.println("Enter Your Choice:");
		Scanner s=new Scanner(System.in);
		String choice=s.next();
		
		switch (choice){
		case "chrome":
			 System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		     driver=new ChromeDriver();
		     break;
		case "firefox":
			 WebDriverManager.firefoxdriver().setup();
		     driver=new ChromeDriver();
		     break;
		case "edge":
			 WebDriverManager.firefoxdriver().setup();
		     driver=new ChromeDriver();
		     break;
		default:
			System.out.println("Invalid Browser info");
		}
		Thread.sleep(3000);
		driver.close();
		
	}
}
		
			
		
			
		
		

	


