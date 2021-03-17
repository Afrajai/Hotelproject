package com.selenium.task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_Screen {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		sign_in.click();
		
		TakesScreenshot tss = (TakesScreenshot) driver;
		File s1 = tss.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\pic1.png");
		FileUtils.copyFile(s1, d1);
		
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions actt1 = new Actions(driver);
		
		actt1.moveToElement(women).build().perform();
		File s2 = tss.getScreenshotAs(OutputType.FILE);
		File d2 = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\pic2.png");
		FileUtils.copyFile(s2, d2);
		
		
		
		WebElement cDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		actt1.doubleClick(cDress).build().perform();
		File s3 = tss.getScreenshotAs(OutputType.FILE);
		File d3 = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\pic3.png");
		FileUtils.copyFile(s3, d3);
		
		
		
		WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
		
		instock.click();
		File s4 = tss.getScreenshotAs(OutputType.FILE);
		File d4 = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\pic4.png");
		FileUtils.copyFile(s4, d4);
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
	
		addtocart.click();
		
		File s5 = tss.getScreenshotAs(OutputType.FILE);
		File d5 = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\pic5.png");
		FileUtils.copyFile(s5, d5);
		
		
		WebElement proceed1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed1.click();
		
		
		
		WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed2.click();
	
		
		WebElement viewaddcart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		viewaddcart.click();
		//a[@title='View my shopping cart']
	
	
	
	}
	
	
	
	
	}


