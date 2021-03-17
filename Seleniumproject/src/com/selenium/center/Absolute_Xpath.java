package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		
		
		
		
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/s?k=iphone+5s&crid=TS9A27PZHJBG&sprefix=iphone%2Caps%2C996&ref=nb_sb_ss_ts-doa-p_3_6");
		
		WebElement iphone = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		iphone.click();
		driver.close();
	}
}
	
	
	
	