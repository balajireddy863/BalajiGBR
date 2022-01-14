package Test.Sample2_mavin_proj;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectAndprint {
	@Test
	public void select() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tra\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@href=\"/books\"]")).click();

		WebElement drive = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select s1 = new Select(drive);
	
		List<WebElement> list = s1.getOptions();
		for (int i = 0; i<list.size(); i++) {
			WebElement drive2 = driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
			Select s2= new Select(drive2);
			s2.selectByIndex(i);
			Thread.sleep(1000);
			driver.close();

		}
	}

}



