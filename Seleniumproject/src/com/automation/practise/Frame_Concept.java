package com.automation.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept extends Base_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		
		getUrl("http://demo.automationtesting.in/Frames.html");
		
		
		driver.manage().window().maximize();
		wait(30);
		//to switch over to  the frame

		//driver.switchTo().frame("SingleFrame");
		
   WebElement stxt = driver.findElement(By.xpath("//input[@type='text']"));
      inputValueElement(stxt, "Iframe");
      wait(20);
      mainFrame();

        
        // driver.switchTo().defaultContent();
         
        wait(20);
         
		/*
		 * WebElement iButton =
		 * driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		 * 
		 * 
		 * iButton.click();
		 * 
		 * 
		 * WebElement oFrame =
		 * driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		 * 
		 * driver.switchTo().frame(oFrame);
		 * 
		 * WebElement inFrame =
		 * driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		 * 
		 * driver.switchTo().frame(inFrame); Thread.sleep(30000);
		 */

//WebElement iText = driver.findElement(By.xpath(""));
//iText.sendKeys("InnerFrame");

driver.switchTo().defaultContent();

//Thread.sleep(50000, 3);
driver.close();




	}
}
