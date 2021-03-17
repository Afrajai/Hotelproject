package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement amazon = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	js.executeScript("arguments[0].scrollIntoView()", amazon);
	
	Thread.sleep(1000);
	
	
	
	WebElement today = driver.findElement(By.xpath("//span[@class='a-color-base']"));
	js.executeScript("arguments[0].scrollIntoView()", today);
	
	String text = today.getText();
	System.out.println(text);
	Thread.sleep(1000);
	
	
	
	WebElement cho = driver.findElement(By.xpath("//h2[text()='Chocolates, sweets & more']"));
	js.executeScript("arguments[0].scrollIntoView()", cho);
	
	Thread.sleep(1000);
	
	
	
	}
	
	
	

}
