package com.selenium.center;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selprj2 {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign.click();
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nourin2@gmail.com");
		Thread.sleep(1000);

		WebElement pswd = driver.findElement(By.id("passwd"));
		pswd.sendKeys("abdeen123");

		WebElement signin = driver.findElement(By.name("SubmitLogin"));
		signin.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions actt1 = new Actions(driver);
		actt1.moveToElement(women).build().perform();

		WebElement evedress = driver.findElement(By.xpath("//a[text()='Evening Dresses']"));

		actt1.click(evedress).build().perform();

		WebElement size = driver.findElement(By.xpath("//a[text()='M']"));

		size.click();

		WebElement check = driver.findElement(By.name("layered_id_attribute_group_7"));
		check.click();
		/*WebElement cotton = driver.findElement(By.id("layered_id_feature_5"));
		cotton.click();
		WebElement casual = driver.findElement(By.id("layered_id_feature_11"));
		casual.click();
		WebElement shortsleeve = driver.findElement(By.id("layered_id_feature_17"));
		shortsleeve.click();
		WebElement instock = driver.findElement(By.id("layered_quantity_1"));
		instock.click();
		WebElement fashion = driver.findElement(By.id("layered_manufacturer_1"));
		fashion.click();
		WebElement newcollection = driver.findElement(By.id("layered_condition_new"));
		newcollection.click();
//		WebElement range = driver.findElement(By.xpath("//a[@style='left: 62%;']"));
//		range.click();
		JavascriptExecutor js=(JavascriptExecutor) drive**/
		
		
		WebElement stock = driver.findElement(By.xpath("//span[@class='available-now']"));
		actt1.moveToElement(stock).build().perform();
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(4000);WebElement checkout = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
		checkout.click();
		WebElement checkout1 = driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
		checkout1.click();
		WebElement checkout2 = driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
		checkout2.click();
		/*
		 * WebElement agree = driver.findElement(By.id("cgv")); agree.click();
		 * WebElement checkout3 = driver.findElement(By.name("processCarrier"));
		 * checkout3.click();
		 */
		
		
		
		/*
		 * WebElement cotton =
		 * driver.findElement(By.id("uniform-layered_id_feature_1")); cotton.click();
		 * 
		 * WebElement causal = driver.findElement(By.xpath("//a[text()='Casual']"));
		 * causal.click();
		 * 
		 * WebElement maxidress =
		 * driver.findElement(By.xpath("//a[text()='Maxi Dress']")); maxidress.click();
		 * 
		 * WebElement addcart=
		 * driver.findElement(By.xpath("//a[@title='Add to cart']")); addcart.click();
		 */
		 
	}
	
}
