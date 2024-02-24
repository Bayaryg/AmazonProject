package project1test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class LaunchQuit {
	
	public static WebDriver driver;
	@BeforeMethod	
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	}
	
	@AfterMethod
	public void close_browser() throws IOException
	
	{
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File source=ts1.getScreenshotAs(OutputType.FILE);
		File destination=new File(".\\ScreenshotsProject1\\"+getClass()+".jpeg");
		FileUtils.copyFile(source, destination);
		
		driver.quit();
		
	}

}
