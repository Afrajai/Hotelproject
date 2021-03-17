package com.automation.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class2 {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	return driver;
		
		
	}
		
		  public static void clickOnElement(WebElement element)
		 
		  { 
			  element.click();
		  
		  }
		  
		  
		  
		  public static void inputValueElement(WebElement element, String value)
		  
		 { 
			  element.sendKeys(value); 
			  }
		
		  
		  public static void getUrl(String url)
		  {
			  driver.get(url);
			  
		  }
		  
		  public static boolean SelectByValue(WebElement element,String value)
		  {
			  boolean f = true;
			 try {
				Select s = new Select(element) ;
				 s.selectByValue(value);
				 f = true;
				 return true;
			} 
			 
			 catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				 return false;
			}
			 
			 finally
			 {
				 if(f)
				 {
					 System.out.println("option selected by value");
				 }
				 else
				 {
					 System.out.println("option not selecetd");
				 }
			 
			 }
			 
		  }
}
