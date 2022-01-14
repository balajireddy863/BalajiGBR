package Test.Sample2_mavin_proj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99test1 {
	@Test
	public void logintc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tra\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    WebElement ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    ele.sendKeys("123");
	    WebElement ele1 = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
	    ele1.click();
	    Alert alert =driver.switchTo().alert();
	    Thread.sleep(2000);
	    alert.accept();
	    //driver.switchTo().alert().accept();
	    Thread.sleep(5000);
	    alert.accept();
	    driver.close();
	}

}
