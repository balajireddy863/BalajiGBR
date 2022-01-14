package Test.Sample2_mavin_proj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RegisterTestCase 
{	
	WebDriver driver;

	String fName="Balaji";
	String lName="reddy";
	String email="balaji@gmail.com";
	String pass="balaji1234";	
	@Test
	public void tc01()
	{

		System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tra\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");
		WebElement registerButton=driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		Click_Button(registerButton);

		WebElement RadioButton=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		Click_Button(RadioButton);

		WebElement firstName=driver.findElement(By.xpath("//input[@name=\"FirstName\"]"));
		Enter_Values(firstName,fName);

		WebElement lastName=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		Enter_Values(lastName, lName);

		WebElement EmailId=driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Enter_Values(EmailId, email);

		WebElement password=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		Enter_Values(password, pass);

		WebElement ConforPassword=driver.findElement(By.xpath("//input[@name=\"ConfirmPassword\"]"));
		Enter_Values(ConforPassword, pass);

		driver.findElement(By.xpath("//input[@name=\"register-button\"]")).click();
		driver.close();

	}

	public void Enter_Values(WebElement element,String value)
	{
		element.sendKeys(value);
	}

	public void Click_Button(WebElement button)
	{
		button.click();
	}
}