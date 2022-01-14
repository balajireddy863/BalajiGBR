package FrameWork_Utilty;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class Base_Test {
	public WebDriver driver;
	@BeforeClass
	public void beforeTest() throws IOException, InterruptedException {
		String chromePath=System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tra\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//String url = Utility_functions.Test_configration("AppUrl");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



		//driver.get("http://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void close()
	{
		driver.close();

	}
}
