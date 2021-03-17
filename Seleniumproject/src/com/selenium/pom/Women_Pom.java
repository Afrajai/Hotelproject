package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Pom {
	
	public static WebDriver driver;

	@FindBy(xpath="//a[@title='Women']")
private WebElement women;
	
	@FindBy(xpath="//a[@title='Casual Dresses']")
	private WebElement casual;

	public Women_Pom(WebDriver driver2) {
	
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getWomen() {
		return women;
	}

	
	public WebElement getCasual() {
		
		return casual;
	}


	



}



/*
 * WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
 * mouseOver(women, "move");
 * 
 * WebElement cDress =
 * driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
 * 
 * mouseOver(cDress, "click");
 * 
 * 
 * 
 * 
 * 
 */



/*
 * WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
 * mouseOver(women, "move");
 * 
 * WebElement cDress =
 * driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
 * 
 * mouseOver(cDress, "click");
 * 
 * WebElement rclick = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
 * mouseOver(rclick, "move"); mouseOver(rclick, "click");
 * 
 * robott(rclick, "down"); robott(rclick, "enter");
 */