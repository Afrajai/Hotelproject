package com.selenium.center;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement rclick = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		
		act.contextClick(rclick).build().perform();
		
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
