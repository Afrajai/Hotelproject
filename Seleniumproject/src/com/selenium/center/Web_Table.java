package com.selenium.center;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		System.out.println("*****ALL DATA******");
		
		for (WebElement datas : all_data) {
			String text = datas.getText();
			System.out.println(text);
			
		}
		
		System.out.println("********PARTICULAR DATA**********");
		
		List<WebElement> particular_Data = driver.findElements(By.xpath("//table/tbody/tr[3]/td[2]"));
	
	
	
	
	
	}
	
	
	
	
	
	
	

	
	
}
