package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart_Pom {
	public static WebDriver driver;
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
private WebElement addcart;

	public Addcart_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddcart() {
		return addcart;
	}
	
}
