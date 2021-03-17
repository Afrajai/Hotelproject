package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
			System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	
	WebElement crt_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	crt_Btn.click();
	
	Thread.sleep(2000);
	
	WebElement dob = driver.findElement(By.id("day"));

	Select s = new Select(dob);
	s.selectByValue("2");
	
	Thread.sleep(3000);
	
	
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByVisibleText("Apr");
	Thread.sleep(1000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByIndex(17);
	
	Thread.sleep(2000);
	
}

}