package com.selenium.center;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_pract {
	public static void main(String[] args) throws Throwable {
		
		
	System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
	
	sign_in.click();
	
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
	 email.sendKeys("nourin2@gmail.com");
	 
	 
	 WebElement submit = driver.findElement(By.id("SubmitCreate"));
	 
	 submit.click();
	 Thread.sleep(3000);
	 
	 
	 WebElement radio_btn = driver.findElement(By.id("id_gender2"));
	 radio_btn.click();
	 
	 Thread.sleep(2000);
	 
	 WebElement firstname = driver.findElement(By.id("customer_firstname"));
	 
	 firstname.sendKeys("abdeen");
	 Thread.sleep(1000);
	 
	 WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
	 
	 lastname.sendKeys("nourin");
	 Thread.sleep(2000);
		
	 
	 WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
	 
	 pswd.sendKeys("abdeen123");
	 
	 Thread.sleep(2000);
	 
	 WebElement days = driver.findElement(By.id("days"));
	 Select s1 = new Select(days);
	 s1.selectByValue("3");
	 Thread.sleep(2000);
	 
	 
	 
	 WebElement months = driver.findElement(By.id("months"));
	 Select s2 = new Select(months);
	 s2.selectByVisibleText("February ");
	 Thread.sleep(2000);
	 
	 
	 WebElement years = driver.findElement(By.id("years"));
	 Select s3 = new Select(years);
	 s3.selectByIndex(3);
	 Thread.sleep(2000);
	 
	 
	 WebElement check_box = driver.findElement(By.xpath("//input[@type='checkbox']"));
	 
	 check_box .click();
	 Thread.sleep(1000);
	 
	 
	 WebElement options = driver.findElement(By.id("optin"));
	 options.click();
	 Thread.sleep(1000);
	 
	 WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	 name.sendKeys("anik");
	 Thread.sleep(1000);


	 WebElement name2 = driver.findElement(By.id("lastname"));
	 
	 name2.sendKeys("izaan");
	 Thread.sleep(1000);

	 
	 WebElement comp = driver.findElement(By.id("company"));
	 
	 comp.sendKeys("tcs");
	 Thread.sleep(1000);
	 
	 
	 WebElement addr = driver.findElement(By.xpath("//input[@name='address1']"));

	 addr.sendKeys("chennai");
	 Thread.sleep(1000);
	 
	 
	 WebElement addr1 = driver.findElement(By.xpath("//input[@name='address2']"));
	 
	 addr1.sendKeys("tvl");
	 Thread.sleep(1000);
	 
	 
	 WebElement cities = driver.findElement(By.xpath("//input[@name='city']"));
	 cities.sendKeys("tvm");
	 
	 Thread.sleep(1000);
	 
	 WebElement states =  driver.findElement(By.id("id_state"));
	Select s5 = new Select(states);

	s5.selectByVisibleText("California");;
	Thread.sleep(2000);
	
	
	
	WebElement code = driver.findElement(By.id("postcode"));
	code.sendKeys("12345");
	Thread.sleep(1000);
	
	
	WebElement count = driver.findElement(By.id("id_country"));
	
	Select s7 = new Select(count);
	
s7.selectByValue("21");
Thread.sleep(1000);


WebElement addinf = driver.findElement(By.name("other"));

addinf.sendKeys("9765400006");
Thread.sleep(1000);


WebElement phone = driver.findElement(By.name("phone"));

phone.sendKeys("04632-222345");
Thread.sleep(1000);


WebElement mob = driver.findElement(By.id("phone_mobile"));

mob.sendKeys("9699656609");

Thread.sleep(1000);


WebElement assign = driver.findElement(By.name("alias"));
assign .sendKeys("nagerkovil");
Thread.sleep(1000);


WebElement regs = driver.findElement(By.id("submitAccount"));

regs.click();
Thread.sleep(1000);






	}
	
	
	

}
