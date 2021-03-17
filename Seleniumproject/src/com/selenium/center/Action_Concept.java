package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;

import com.automation.practise.Base_Class;

public class Action_Concept extends Base_Class{
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		//clickElement(women);
	
		Actions actt1 = new Actions(driver);
		
		actt1.moveToElement(women).build().perform();
		
		
		WebElement cDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		
		//clickElement(cDress);
		actt1.doubleClick(cDress).build().perform();
		
		
		
	}

}
