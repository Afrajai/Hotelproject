package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserss {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Sel1\\src\\Driver\\chrome\\chromedriver.exe ");
		 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.flipkart.com");
	}

}
