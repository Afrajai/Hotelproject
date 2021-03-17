package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/watches?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-watches");
		
		WebElement watch = driver.findElement(By.xpath("//div[@id='desktopSearchResults']/div[2]/section/ul/li[12]/a/div[1]/div/div/picture/img"));
		watch.click();
		
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
