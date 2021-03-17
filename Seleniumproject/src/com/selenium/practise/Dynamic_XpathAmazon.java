package com.selenium.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_XpathAmazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=kurtis+for+women+latest&crid=26D1MG70UMW0U&sprefix=kurti%2Caps%2C1717&ref=nb_sb_ss_ts-a-p_4_5");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MINUTES);
		
		List<WebElement> all_prizes = driver.findElements(By.xpath("//span[@aria-hidden='true']//preceding::span[@class='a-price-whole']"));
		
	List<Integer> price_List = new ArrayList<Integer>();
	
	for (WebElement prizes : all_prizes) 
	{
		String prizesss = prizes.getText().substring(1).replace("," , "");
	int value = Integer.parseInt(prizesss);
		
		//Integer value= Integer.valueOf(prizesss);
		price_List.add(value);
		
		
		
		
		}
	
	System.out.println(price_List);
	
	//size
	int size = price_List.size();
	System.out.println("size :" + size);
	
	
	
	
	
	
	
	
	}

}
