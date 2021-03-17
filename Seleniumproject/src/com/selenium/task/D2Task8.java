package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2Task8 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.swiggy.com");
		
		WebElement loc = driver.findElement(By.id("location"));
		loc.sendKeys("chennai");

}

}

