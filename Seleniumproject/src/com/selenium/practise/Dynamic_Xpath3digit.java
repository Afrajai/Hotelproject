package com.selenium.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath3digit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=kurtis+for+women+under+500&crid=1HUULDU9V70TT&sprefix=kurtis+for+women+under%2Caps%2C389&ref=nb_sb_ss_ts-a-p_3_22");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		List<WebElement> all_Price = driver.findElements(By.xpath("//span[@aria-hidden='true']//parent::span[@class='a-price-whole']"));
		
		List<Integer> price_List = new ArrayList<Integer>();
		
		for (WebElement prize :all_Price) {
			
			String s = prize.getText().replace(",", "");
			int value = Integer.parseInt(s);
			
			price_List.add(value);
			
		}
		
		System.out.println(price_List);
		
		
		int size = price_List.size();
		System.out.println("size :" + size);
		
		
		
	}

}
