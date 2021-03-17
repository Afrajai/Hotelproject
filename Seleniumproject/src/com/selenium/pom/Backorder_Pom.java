package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Backorder_Pom {
	public static WebDriver driver;
	@FindBy(xpath="//i[@class='icon-chevron-left']")
	private WebElement back;

	public Backorder_Pom(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getBack() {
		return back;
	}
	
	

}
