package com.selenium.center;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign.click();
		Thread.sleep(200);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kathir12@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("123456789");
		WebElement signin = driver.findElement(By.name("SubmitLogin"));
		signin.click();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions act=new Actions(driver);
		act.moveToElement(women).build().perform();
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		tshirt.click();
		WebElement check = driver.findElement(By.name("layered_id_attribute_group_3"));
		check.click();
		WebElement colour = driver.findElement(By.name("layered_id_attribute_group_14"));
		colour.click();
		WebElement cotton = driver.findElement(By.id("layered_id_feature_5"));
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
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement stock = driver.findElement(By.xpath("//span[@class='available-now']"));
		act.moveToElement(stock).build().perform();
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span"));
		addtocart.click();
		Thread.sleep(4000);
		WebElement checkout = driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span"));
		checkout.click();
		WebElement checkout1 = driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span"));
		checkout1.click();
		WebElement checkout2 = driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span"));
		checkout2.click();
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();
		WebElement checkout3 = driver.findElement(By.name("processCarrier"));
		checkout3.click();
}
}
	

