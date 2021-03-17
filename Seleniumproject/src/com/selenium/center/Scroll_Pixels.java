package com.selenium.center;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Pixels {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	Thread.sleep(1000);
	 JavascriptExecutor js = (JavascriptExecutor) driver;//add caste : narrow type casting
	 js.executeScript("window.scrollBy(0,15000)");

}
}