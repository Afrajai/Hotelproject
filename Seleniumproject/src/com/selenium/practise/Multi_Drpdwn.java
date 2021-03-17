package com.selenium.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Drpdwn {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		
		WebElement muldd = driver.findElement(By.id("multi-select"));
		
		Select s = new Select(muldd);
		
		s.selectByValue("New York");
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("Pennsylvania");
		Thread.sleep(1000);
		
		s.selectByIndex(3);
		
		Thread.sleep(4000);
		
		
		List<WebElement> allselect  = s.getAllSelectedOptions();
		System.out.println(allselect.size());
		
		
		
		s.deselectAll();
		
		Thread.sleep(3000);
		
		
         s.selectByValue("New York");
		
		Thread.sleep(1000);
		
		s.selectByVisibleText("Pennsylvania");
		Thread.sleep(1000);
		
		//List<WebElement> allselect  = s.getAllSelectedOptions();
		//System.out.println(allselect.size());
		
		
}

}
