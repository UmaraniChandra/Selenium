package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingCoordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,5000)");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(3000);
		
		driver.close();

	}

}
