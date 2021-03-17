package com.automation.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions_Base extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		mouseOver(women, "move");
		
		WebElement cDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		
		mouseOver(cDress, "click");
		
		WebElement rclick = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		mouseOver(rclick, "move");
		mouseOver(rclick, "click");
		
		robott(rclick, "down");
		robott(rclick, "enter");
		
		
		
		
		WebElement stock = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span"));
		clickOnElement(stock);
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		clickOnElement(addtocart);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		
		WebElement checkout = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
		clickOnElement(checkout);
		WebElement checkout1 = driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
		clickOnElement(checkout1);
		WebElement checkout2 = driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
		clickOnElement(checkout2);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		
		//*[@id="center_column"]/ul/li/div/div[2]/span/span
}}

