package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Launch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleni3\\Driver\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
	
		
		driver.get("https://www.craftsvilla.com/");
	}

}
