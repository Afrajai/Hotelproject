package com.automation.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Shopping_Purchase extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");

		
		  WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		  clickOnElement(sign);
		  
		  
		  WebElement email = driver.findElement(By.id("email"));
		  inputValueElement(email, "nourin2@gmail.com");
		  
		  isEnabled(email);
		  
		  isDisplayed(email);
		  
		  clear(email);
		  
		  
		  inputValueElement(email, "nournjai@gmail.com");
		  
		  getTitle();
		 
		WebElement pswd = driver.findElement(By.id("passwd")); 
		inputValueElement(pswd ,"abdeen123");
		 
		  WebElement signInEntry = driver.findElement(By.name("SubmitLogin"));
		 clickOnElement(signInEntry);
		 
		 //create acc
		 
		 WebElement signcr = driver.findElement(By.xpath("//a[@class='login']"));
	
		 clickOnElement(signcr);
		 
		
		  WebElement emailcr = driver.findElement(By.id("email_create"));
		 
		  inputValueElement(emailcr, "afra@gmail.com");
		  
		  takescreen(driver,"C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\img46.png");
		
		 WebElement submit = driver.findElement(By.id("SubmitCreate"));
		clickOnElement(submit);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement radio_btn = driver.findElement(By.id("id_gender2"));
		clickOnElement(radio_btn);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 
		 WebElement firstname = driver.findElement(By.id("customer_firstname"));

		inputValueElement(firstname, "aara");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));

		inputValueElement(lastname, "anika");
		
		WebElement paass = driver.findElement(By.id("passwd"));
		inputValueElement(paass, "azimaaa");
		
		
		WebElement day = driver.findElement(By.id("days"));
		selectTheElement(day,"value","5");
		
		
		WebElement month = driver.findElement(By.id("months"));
		selectTheElement(month, "text", "March ");
		
		WebElement year = driver.findElement(By.id("years"));
		selectTheElement(year, "value", "2017");
		
		
		WebElement check = driver.findElement(By.id("newsletter"));
		clickOnElement(check);
		
		WebElement fstnam = driver.findElement(By.id("firstname"));
		inputValueElement(fstnam, "jjjj");
		
		WebElement lstname = driver.findElement(By.id("lastname"));
		inputValueElement(lstname, "nnnnn");
		
		
		WebElement cmpy = driver.findElement(By.id("company"));
		inputValueElement(cmpy, "tcs");
		
		WebElement adddres = driver.findElement(By.id("address1"));
	inputValueElement(adddres, "chennnai");
	
	WebElement addd2 = driver.findElement(By.id("address2"));
	inputValueElement(addd2, "tvl");
	
	WebElement citi = driver.findElement(By.id("city"));
	inputValueElement(citi, "dubai");
	
	WebElement state = driver.findElement(By.id("id_state"));
	selectTheElement(state, "value", "5");
	
	WebElement zip = driver.findElement(By.name("postcode"));
	inputValueElement(zip, "00000");
	
	WebElement addinf = driver.findElement(By.id("other"));
	inputValueElement(addinf, "hi all");
	
	WebElement phonne = driver.findElement(By.id("phone"));
	inputValueElement(phonne, "1233345679");
	
	
	WebElement mob = driver.findElement(By.id("phone_mobile"));
	inputValueElement(mob, "9876543210");
	
	
	WebElement myaddress = driver.findElement(By.xpath("//input[@value='My address']"));
	
		inputValueElement(myaddress, "sharajh");
		
		
		WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		clickOnElement(register);
		
		 // close();
		 
	}

}
