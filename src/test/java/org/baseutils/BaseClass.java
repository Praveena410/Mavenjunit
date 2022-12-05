package org.baseutils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extentReports;
	
	@BeforeClass
	public static void browserlaunch()
	{
		reporter = new ExtentHtmlReporter("C:\\Users\\L E N O V O\\eclipse-workspace\\Mavenjunit\\FinalReport.html");
		extentReports =new ExtentReports();
		extentReports.attachReporter(reporter);
		
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();		
	}
	
	
	
	
	public static void  typedata(WebElement element,String data) {
		element.sendKeys(data);
	
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
		driver.close();
	}
}
