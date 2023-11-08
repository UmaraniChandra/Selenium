package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement electronics=driver.findElement(By.xpath("//li/a[text()='Electronics']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(electronics).perform();
		
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		
		if(driver.getTitle().contains("Apple"))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.close();
		
		
				
		

	}

}
