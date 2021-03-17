package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	

	@FindBy(name="passwd")
	private WebElement password;
	
	@FindBy(xpath="//i[@class='icon-lock left']")
	private WebElement  sign;

	public Login_Pom(WebDriver driver2) {
		
		this.driver = driver2;
		 
		PageFactory.initElements(driver, this );
		
		
	}

	

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}
	
	

}
