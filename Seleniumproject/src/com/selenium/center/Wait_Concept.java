package com.selenium.center;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement amazon = driver.findElement(By.id("nav-logo-sprites"));
		
		WebDriverWait wait = new WebDriverWait(driver,30); //	WebDriverWait ---->class
		wait.until(ExpectedConditions.visibilityOf(amazon));//ExpectedConditions--->class
	
	
	
	}

}
