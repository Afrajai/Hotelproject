package com.selenium.center;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	
	
	private static final String TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nourin@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("1234jainul");
		
		
		WebElement login_Btn = driver.findElement(By.name("login"));
		
		login_Btn.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver; //driver------>class
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\snap2.png");
		
		FileUtils.copyFile(source,destination);
		driver.close();
		
	}

}
