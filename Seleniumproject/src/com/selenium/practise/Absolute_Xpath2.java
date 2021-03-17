package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/search?q=tv&sid=ckf%2Cczl&as=on&as-show=on&otracker=AS_QueryStore_HistoryAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_HistoryAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=tv%7CTVs&requestId=e2a4b910-974c-4344-a222-f2a77dc75f90&as-searchtext=tv");
		 WebElement tv = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[4]/div/div/div/a/div/div/div/div/img"));
		 
		  tv.click();
		  
		  
		 // WebElement tv = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[6]/div/div/div/a/div[2]/div/div/div/img"));
	//tv.click();
		
		
		
		
	
	//WebElement wasmach = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[4]/div/div/div/a/div/div/div/div/img"));
	
	//wasmach.click();
	}

}
