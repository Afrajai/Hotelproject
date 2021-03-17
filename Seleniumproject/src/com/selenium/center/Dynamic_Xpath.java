package com.selenium.center;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=kurthis+latest+model+2020+collection&crid=3RWUYVULZX880&sprefix=kurth%2Caps%2C753&ref=nb_sb_ss_ts-a-p_2_5");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.MINUTES);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	 
		
		List<WebElement> all_prize = driver.findElements(By.xpath("//span[@aria-hidden='true']//parent::span[@class='a-price-whole']"));

		List<Integer> prizelist = new ArrayList<Integer>();
		


	
	for (WebElement price : all_prize) {
		
		
		String text = price.getText().replace(",", "");
	Integer value = Integer.valueOf(text);
		 
		 prizelist.add(value);
	}
		 
		 System.out.println(prizelist);
		 int size = prizelist.size();
		 System.out.println(size);
		 System.out.println("max value:"+Collections.max(prizelist));
		
		 }
	
	}
