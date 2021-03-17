package com.selenium.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.craftsvilla.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println (currentUrl);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.spar.com/");
		
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
	
		driver.close();
		
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
