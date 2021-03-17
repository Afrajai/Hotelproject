package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2Task6 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get(" https://twitter.com/login");
	
		 WebElement user = driver.findElement(By.name("session[username_or_email]"));
	user.sendKeys("jainul7777");
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
}
