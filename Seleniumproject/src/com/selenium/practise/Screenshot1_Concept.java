package com.selenium.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1_Concept {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement usrname = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		usrname.sendKeys("jainul");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pwd.sendKeys("1234556");
		
		WebElement login_Btn = driver.findElement(By.xpath("//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
		login_Btn.click();
		
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver; //type casting narrow 
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\snap1.png");
		
		FileUtils.copyFile(source, destination);
		
		driver.close();
		
		
		
		
	}

}
