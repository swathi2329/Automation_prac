package com.automation.practice.tests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.automation.practice.pages.BaseClass;

public class BaseTest extends BaseClass {

	@BeforeClass
	public void initiateBrowser()
	{
		System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "chromepath");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
