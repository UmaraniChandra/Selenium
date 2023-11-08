package autosuggistions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingMobilePrices {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.className("L0Z3Pu")).click();
		
		List<WebElement>mobileNames=driver.findElements(By.className("_4rR01T"));
		for(int i=0;i<mobileNames.size();i++)
		{
			String name= mobileNames.get(i).getText();
			String price=driver.findElement(By.xpath("//div[text()='"+name+"']/ancestor::div[@class='_3pLy-c row']"
					+"/descedent::div[@class='_30jeq3 _1_WHN1']")).getText();
			System.out.println(name+"\t"+price);
		}
		driver.close();
		

	}

}
