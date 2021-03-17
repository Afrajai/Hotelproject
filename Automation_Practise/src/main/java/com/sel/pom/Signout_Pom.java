package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout_Pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout_Btn;

	public Signout_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignout_Btn() {
		return signout_Btn;
	}
	

}
