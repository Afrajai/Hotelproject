package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Stm {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
			
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.name("employees_c"));
		
	
		Select s = new Select(dropdown);
		
	
		
		 
		s.selectByValue("level2");
		Thread.sleep(2000);
		
		
		s.selectByVisibleText("101 – 250 employees");
		Thread.sleep(2000);
		
		//index starts 1
		s.selectByIndex(7);
		
		Thread.sleep(3000);
		
		
		
		
	}
	
	

}
