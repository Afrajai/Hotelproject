package com.selenium.center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchGoogle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//to get the url
		driver.get("https://www.amazon.in");
		
		//to get the current url
		//driver.getCurentUrl
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		//to get the title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://meesho.com/");
		
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.close();
		
		Thread.sleep(10000);
		
		driver.quit();
		
		
		
	
		
		
		
	}

}
