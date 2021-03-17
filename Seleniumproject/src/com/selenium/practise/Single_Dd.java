package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dd {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.id("select-demo"));
		
	
		Select s = new Select(dropdown);
		
		s.selectByValue("Sunday");
		Thread.sleep(2000);
		
		
		s.selectByVisibleText("Wednesday");
		
		Thread.sleep(3000);
		
		s.selectByIndex(5);
		Thread.sleep(2000);
		
		System.out.println("size");
		

}
}