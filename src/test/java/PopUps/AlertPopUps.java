package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement courseTab=driver.findElement(By.id("course"));
		Actions action=new Actions(driver);
		action.moveToElement(courseTab).perform();
		

		driver.findElement(By.xpath("//span/a[text()='Selenium']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.=' Add to Cart']")).click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		WebElement itemAddedMessage=driver.findElement(By.xpath("//span[@class='message']"));
		Thread.sleep(3000);
		System.out.println(itemAddedMessage.getText());
		Thread.sleep(3000);
		
		driver.close();
		Thread.sleep(3000);
		
		
		
		
		
		
		

	}

}
