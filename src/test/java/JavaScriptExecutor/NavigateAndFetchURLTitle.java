package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndFetchURLTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]","https://www.ebay.com/");
		
		System.out.println(js.executeScript("return document.title"));
		
		System.out.println(js.executeScript("return document.URL"));
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
