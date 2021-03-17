package com.automation.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");

		getUrl("http://demo.automationtesting.in/Alerts.html");

		//simple alert

		WebElement alert_Btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		clickOnElement(alert_Btn);

		alert("accept");

		 //confirm alert
		 
		 WebElement okcancel_Btn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		 clickOnElement(okcancel_Btn);
		 

WebElement con_Btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		clickOnElement(con_Btn);
		wait(30);
		alert("dismiss");
		

		//prompt alert
 WebElement txt_Btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		 clickOnElement(txt_Btn);
		 wait(10);
		
WebElement prompt_Btn =driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	clickOnElement(prompt_Btn);
	wait(10);
		  
		alert("text");
		alert("accept");
		

		 
		 

	}

}