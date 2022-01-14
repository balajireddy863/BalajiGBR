package Test.Sample2_mavin_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_TestAnnot {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String email="balaji1@gmail.com";
		String password="balaji1234";
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		WebElement validate= driver.findElement(By.xpath("(//a)[2][@class='account']"));
		if(validate.getText().equalsIgnoreCase(email)) {
			System.out.println("validation successful");
		}
		driver.quit();
	}
}
