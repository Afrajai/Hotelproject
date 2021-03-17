package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conformodrer_Pom {
	
	public static WebDriver driver;

	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement conform;

	public Conformodrer_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConform() {
		return conform;
	}
	
	
	
	
}
