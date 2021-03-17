package com.selenium.center;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling_Demo {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", 
			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	Robot r = new Robot();
	
	
	
	WebElement mobile= driver.findElement(By.xpath("//a[text()='Mobiles'][1]"));
	a.contextClick(mobile).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);

	
	WebElement fas = driver.findElement(By.xpath("//a[text()='Fashion']"));
	a.contextClick(fas).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
	WebElement ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	a.contextClick(ele).build().perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(1000);
	
	
	
	String windowhandle = driver.getWindowHandle();
	Set<String> allId = driver.getWindowHandles();
	for (String id : allId) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title );
		
	}
	
	
	
		
		
		  String s ="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
for (String all : allId) {
	
 if(driver.switchTo().window(all).getTitle().equals(s))
 { break;
 }
 }
	}}		 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
