package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(" //div[contains( text()  ,'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Umarani\\Documents\\DESIGN OF EFFICIENT ERROR CORRECTING CODES.docx");
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
