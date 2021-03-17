package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2Task1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("chennai");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("tvl");
		
		
	}
	
	
	
	

}
