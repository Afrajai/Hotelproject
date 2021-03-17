package com.automation.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fb_Base extends Base_Class {
	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		getUrl("https://www.facebook.com/");

		WebElement sign = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		clickOnElement(sign);

		WebElement fstname = driver.findElement(By.name("firstname"));
		inputValueElement(fstname, "aaaa");

	wait(20);
		
		  WebElement lstname = driver.findElement(By.name("lastname"));
		  inputValueElement(lstname, "fffff");
		  
		  
		/*
		 * WebElement day = driver.findElement(By.id("day")); selectTheElement(day,
		 * "value", "10");
		 * 
		 * 
		 * 
		 * WebElement radio =
		 * driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		 * clickOnElement(radio);
		 */
		 

	}
}
