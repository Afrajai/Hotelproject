package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Method {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		
		//is Enabled
		
		boolean enabled = email.isEnabled();
		System.out.println(enabled);
		
		//is Displayed
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		//send keys
		email.sendKeys("NOURINJAI@gmail.com");
		
		//get Attribute
		String attribute = email.getAttribute("value");
		System.out.println("passed value :" +attribute);
		
		//get Attribute---->get the value by passing attribute name
		
		String attribute2 = email.getAttribute("id");
		System.out.println("Attribute value :" + attribute2);
		
		//clear
		email.clear();
		
		//send keys
		
		email.sendKeys("abdeen@gmail.com");
		
		//get Text
		
		WebElement create_Txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_Txt.getText();
		System.out.println("Text :" +text);
		
		//click
		
		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		
		create_Btn .click();
		Thread.sleep(20000);
		
		
		WebElement radio_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio_Btn.click();
		
		//is Selected
		
		boolean selected = radio_Btn.isSelected();
		
		System.out.println(selected);
		
		}
}
