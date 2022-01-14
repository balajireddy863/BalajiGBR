package Test.Sample2_mavin_proj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utilty.Base_Test;
import FrameWork_Utilty.Utility_functions;

public class newLoginTest extends Base_Test{
	@DataProvider(name="TestData")
	public Object[][] testdata(){

		Object [][] data = new Object[2][2];
		data[0][0]="pandey.aman1876@gmail.com";
		data[0][1]="Aman1234@";

		data[1][0]="balaji1@gmail.com";
		data[1][1]="balaji1234";

		return data;
	}

	@Test(dataProvider ="TestData")
	public void test2(String username,String PassWord) throws IOException
	{	
		WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
		Utility_functions.click(login);
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		Utility_functions.select_by_value(email, username);
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		Utility_functions.select_by_value(password, PassWord);
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']"));
		Utility_functions.click(loginButton);


	}

}
