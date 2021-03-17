package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_FF {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Welcome\\eclipse-workspace\\Seleni3\\Driver\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.redbus.com");
	
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl );
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	driver.manage().window().maximize();
	
	
	driver.navigate().to("https://www.magicbricks.com/");
	
	driver.navigate().refresh();
	
	driver.close();
	
	
	
	
	
	
	
	
	}

}
