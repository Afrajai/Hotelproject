package com.selenium.center;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		
		
		
		WebElement log_X = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.contextClick(log_X).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		WebElement topoffers = driver.findElement(By.xpath("//div[@class='xtXmba'][1]"));
		a.contextClick(topoffers).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		
		
	
		
		
		
	}
	
	
	
	

}
