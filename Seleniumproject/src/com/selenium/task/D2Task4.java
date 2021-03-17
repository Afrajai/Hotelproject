package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2Task4 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
	
	WebElement names = driver.findElement(By.id("login_username|input"));
	names.sendKeys("nourin");
	
	
	
		
		
		
		
	}

}
