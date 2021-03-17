package com.adaction.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Pom {
	
public static WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logout;

	
	public WebElement getLogout() {
		return logout;
	}
	

}
