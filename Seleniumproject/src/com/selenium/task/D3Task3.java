package com.selenium.task;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class D3Task3 {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	//FIRST NAME
		
	WebElement first_Name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	first_Name.sendKeys("jainul");
	Thread.sleep(2000);
		
	//LAST NAME
		
	WebElement last_Name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last_Name .sendKeys("nourin");
	Thread.sleep(2000);
		 
	 //ADDRESS
		 
	 WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	 address.sendKeys("chennai");
	 Thread.sleep(1000);
	 
	 
	 //EMAIL
		 
	 WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	 
	 //is Enabled
	 boolean enabled = email.isEnabled();
	 System.out.println( enabled);
	 
	 //is Displayed
	 
	 boolean displayed = email.isDisplayed();
	 System.out.println( displayed);
	 
	 //send keys
	 
    email.sendKeys("jainul@gmail.com");
    
    Thread.sleep(1000);
    
    //get Attribute value
    String attribute = email.getAttribute("value");
    
    System.out.println("passed value :" + attribute);
    
    //get attribute name
    
    String attribute2 = email.getAttribute("id");
    System.out.println("attribute value " + attribute2);
    
    //clear
 email.clear();
	
	//send keys
	email.sendKeys("abdeen@gmail.com");
	
	Thread.sleep(2000);
	//PHONE
	
	WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	phone .sendKeys("1234567890");
	
	//RADIO BTN
	
    WebElement radio_Btn = driver.findElement(By.xpath("//input[@value='Male']"));
   radio_Btn.click();
    //Thread.sleep(2000);

		 
	//HOBBIES

   // WebElement hobbie =driver.findElement(By.xpath("//label[text()='Hobbies']"));
   // hobbie.click();
   // Thread.sleep(1000);
    
    
    //MOVIE
		 
	// WebElement movi = driver.findElement(By.xpath("//label[text()='Movies ']"));
	//movi.click();
	//Thread.sleep(2000);
	
	/*//LANGUAGE
	
	WebElement lang = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
	 Select ss = new Select(lang);
	 boolean multiple = ss.isMultiple();
	 System.out.println(multiple);
	 //ss.selectByIndex(3);
	 
	 
	 //get the options
	 
	 System.out.println("List of options");
	List<WebElement> options = ss.getOptions();
	
	//fore
	
	for (WebElement goption : options) {
		
		String text = goption .getText();
		System.out.println(text);
	}
	
	//to get the size
	System.out.println("size");
	int size = options.size();
	System.out.println( size);
	
	//getAll Selectoptions
	List<WebElement> all_Select = ss.getAllSelectedOptions();
	for (WebElement select : all_Select) {
		System.out.println(select.getText());
		
	}*/
	
//SKILL 
WebElement skill = driver.findElement(By.xpath("//select[@ng-model='Skill']"));

Select s = new Select(skill);

s.selectByValue("Adobe Photoshop");
Thread.sleep(2000);

s.selectByValue("Android");
Thread.sleep(2000);

s.selectByVisibleText("Backup Management");
Thread.sleep(2000);

s.selectByIndex(6);
Thread.sleep(2000);

//s.deselectAll();

//Thread.sleep(2000); 
s.selectByValue("Analytics");


WebElement country = driver.findElement(By.id("countries"));
		

//WebElement country_b =  driver.findElement(By.xpath("//select[@type='text']"));
Select s1 = new Select(country);

s1.selectByValue("Algeria");
Thread.sleep(2000);


s1.selectByVisibleText("Argentina");
Thread.sleep(2000);

/*WebElement selectcountry = driver.findElement(By.xpath("//span[@role='combobox']"));
Select s6 = new Select(selectcountry);
s6.selectByIndex(3);
Thread.sleep(1000);*/


WebElement dob = driver.findElement(By.xpath("//label[text()='Date Of Birth']"));
String text = dob .getText();
System.out.println("Text" + text);


WebElement yrbx = driver.findElement(By.id("yearbox"));

Select s2 = new Select(yrbx);


s2.selectByValue("1921");
Thread.sleep(2000);


WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

Select s3 = new Select(month);
s3.selectByValue("February");

Thread.sleep(1000);

WebElement day = driver.findElement(By.id("daybox"));
Select s4 = new Select(day);
s4.selectByVisibleText("4");


WebElement pass = driver.findElement(By.xpath("//input[@id='firstpassword']"));
pass.sendKeys("23378966jai");


WebElement secpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
secpass.sendKeys("4567jaiN");

TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);

File destination = new File("C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\snap5.png");

FileUtils.copyFile(source,destination);

//driver.switchTo().frame("automation demo site");
//WebElement inFrame = driver.findElement(By.xpath("//body[@ng-app='Registerform']"));

//driver.switchTo().frame(inFrame);
//Thread.sleep(30000);
//driver.switchTo().defaultContent();



WebElement widg = driver.findElement(By.xpath("//a[text()='Widgets']"));

Actions ac = new Actions(driver);
ac.moveToElement(widg).build().perform();



//driver.close();











	}

}
