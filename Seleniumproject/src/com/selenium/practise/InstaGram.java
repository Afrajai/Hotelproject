package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaGram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("afra");
		
		
		
		
}

}
