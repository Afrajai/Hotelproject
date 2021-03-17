package com.selenium.center;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.automation.practise.Base_Class;

public class Multiple_DropDown extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		
	
		getUrl("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//isMultiple(element);
		
		WebElement multi_Drop = driver.findElement(By.id("multi-select"));
		isMultiple(multi_Drop);
		
		getAllOptions(multi_Drop, "size");
	getAllSelected(multi_Drop, "5");
	getAllSelected(multi_Drop, "2");
	
	}
}
