package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9dropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.gettyimages.in/");
		//WebElement crimage_Btn = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		//Select s = new Select(crimage_Btn);
		
		//boolean multiple = s.isMultiple();
		//System.out.println( multiple);
		
		driver.get("http://adactinhotelapp.com/");
		
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("jai");
	
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("1234");
	
	
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	 login.click();
	
	
	 
	 WebElement crt_Txt = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	
	
	 String text = crt_Txt.getText();
	 System.out.println(text);
	 
	 
	 WebElement element = driver.findElement(By.xpath("//input[@id='full_name']"));
	
	element.sendKeys("jjjjjjj");
	
	
	
	
	
	}

}
