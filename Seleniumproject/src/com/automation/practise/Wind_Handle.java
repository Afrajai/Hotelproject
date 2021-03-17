package com.automation.practise;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Wind_Handle extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		getUrl("https://www.amazon.in/");

		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles'][1]"));
		mouseOver(mobile, "move");
		mouseOver(mobile, "rightclick");
		robott(mobile, "down");
		robott(mobile, "enter");

		WebElement fas = driver.findElement(By.xpath("//a[text()='Fashion']"));
		mouseOver(fas, "move");
		mouseOver(fas, "rightclick");
		robott(fas, "down");
		robott(fas, "enter");

		WebElement ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

		mouseOver(ele, "move");
		mouseOver(ele, "rightclick");
		robott(ele, "down");
		robott(ele, "enter");

		//windowsHandle();
		//windowsHandless(type, "single window");
		
		  
		  JavascriptExecutor js =(JavascriptExecutor)driver;
		  
 WebElement amazon = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		  
		  scrollActions(amazon, "view");
		  
		  
		  
		  
		  
 WebElement cho =driver.findElement(By.xpath("//h2[text()='Chocolates, sweets & more']"));
		  
		  scrollActions(cho, "view");
		  
		 

	}
}