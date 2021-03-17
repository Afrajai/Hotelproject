package com.selenium.task;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Amazon {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement fas = driver.findElement(By.xpath("//a[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(fas).build().perform();
		
		WebElement fshoe = driver.findElement(By.xpath("//a[text()='Formal Shoes']"));
		act.click(fshoe).build().perform();
		
		
		//WebElement simcards = driver.findElement(By.xpath("//span[text()='SIM Cards']"));
	//act.click(simcards).build().perform();
		
		
		//WebElement smg = driver.findElement(By.xpath("//a[text()='Samsung']"));
		//act.click(smg).build().perform();
		
		
	}

}
