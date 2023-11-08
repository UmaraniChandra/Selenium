package WindowScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String date = getTime();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/windowSS"+date+".png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		driver.close();
		

	}
	public static String getTime() {
		Date  date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_YY_hh_mm_sss");
		return sdf.format(date);
		
	}

}
