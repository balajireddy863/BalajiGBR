package Test.Sample2_mavin_proj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import FrameWork_Utilty.Utility_functions;
import FrameWork_Utilty.Base_Test;

public class logintestcasesTest extends Base_Test {
	@Test
	public void test2() throws IOException
	{	
		WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		Utility_functions.select_by_value(email,Utility_functions.Test_configration("email"));
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		Utility_functions.select_by_value(password, Utility_functions.Test_configration("password"));
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']"));
		Utility_functions.click(loginButton);
		
	}
}
