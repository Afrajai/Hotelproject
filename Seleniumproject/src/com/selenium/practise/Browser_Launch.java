 package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
