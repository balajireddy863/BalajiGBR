package Test.Sample2_mavin_proj;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class DemoDropdown {
		

		@Test
		public void simple() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tra\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com");
			WebElement Books = driver.findElement(By.xpath("//a[@href=\"/books\"]"));
			Books.click();
			
			WebElement Books1 = driver.findElement(By.xpath("//Select[@id=\"products-orderby\"]"));
			Books1.click();
			Select B = new Select(Books1);
			B.selectByIndex(2);
			WebElement Books2 = driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
			Books2.click();
			Select a = new Select(Books2);
			a.selectByIndex(2);
			Thread.sleep(1000);
			WebElement Book3 = driver.findElement(By.xpath("//select[@id=\"products-viewmode\"]"));
			Book3.click();
			Select c = new Select(Book3);
			c.selectByVisibleText("List");
		
			driver.close();
			
			
			

		}

	}

