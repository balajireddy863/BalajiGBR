package FrameWork_Utilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_functions {
	public static String Test_configration(String key) throws IOException {
		String filestore ="./Test_configration/config.properties";
		FileInputStream fil =new FileInputStream(filestore);

		Properties prog = new Properties();
		prog.load(fil);
		String value = prog.getProperty(key);
		return value;
	}
	public static void click(WebElement ele) { 
		ele.click();

	}
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);	
	}

	public static void select_by_text(WebElement ele,String value) {
		Select select = new Select(ele); 
		select.selectByVisibleText(value);
	}
	public static void select_by_value(WebElement ele,String value) {
		Select select = new Select(ele); 
		select.selectByValue(value);
	}
	public static void select_by_index(WebElement ele,int index) {
		Select select = new Select(ele); 
		select.selectByIndex(index);
	}

}
