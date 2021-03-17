package com.selenium.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D7screenshot1 {
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\snap4.png");
		FileUtils.copyFile(Source,destination);
		driver.close();
		
	}

}
