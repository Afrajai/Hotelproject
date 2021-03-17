package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch45 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("afrajainul77@gmail.com");
		
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("234556778");
		
		
		//WebElement login = driver.findElement(By.id("u_0_b"));
		//login.click();
		
		
		
		
	
		//WebElement search = driver.findElement(By.xpath("//a[@role='button']"));
	
		//search.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		firstname.sendKeys("priya");
		
		
		
		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		
		String text2 = text.getText();
		System.out.println(text2);
		
		
		
		
		WebElement findElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		String name = findElement.getText();
		System.out.println(name);
		/*
		 * WebElement text3 = driver.findElement(By.
		 * xpath("//h2[contains(text(),'Facebook people in your life')]"));
		 * 
		 * String text4 = text3.getText(); System.out.println(text4);
		 */
		
	}

	
	
	
	
}
