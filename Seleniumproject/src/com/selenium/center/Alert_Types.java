package com.selenium.center;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		 
		WebElement alert_Btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		 alert_Btn.click();
		 
		 Alert simple_Alert = driver.switchTo().alert();
		 simple_Alert.accept();
		 
		 Thread.sleep(2000);
		 
		 //confirm alert
		 
		 WebElement okcancel_Btn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 okcancel_Btn.click();
		 
		 WebElement confirm_Btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		 confirm_Btn.click();
		
		 Alert confirm_Alert = driver.switchTo().alert();
		 confirm_Alert.accept();
		 
		 Thread.sleep(3000);
		 
		 //prompt alert
		 
		 WebElement txt_Btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		 
		 txt_Btn.click();
		 
		 WebElement prompt_Btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		 prompt_Btn.click();
		 
		 
		 Alert prompt_Alert = driver.switchTo().alert();
		 String text = prompt_Alert.getText();
		 System.out.println("TEXT :" + text);
		 
		 prompt_Alert.dismiss();
		
		
		
	}
	
	
	
	
	

}
