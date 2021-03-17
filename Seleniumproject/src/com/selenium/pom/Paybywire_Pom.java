package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paybywire_Pom {
	public static WebDriver driver;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payby;

	public Paybywire_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayby() {
		return payby;
	}
	

}
//a[@class='bankwire']