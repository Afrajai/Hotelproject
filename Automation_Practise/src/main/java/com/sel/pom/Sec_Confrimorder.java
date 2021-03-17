package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sec_Confrimorder {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement secconfirm_Btn;

	public Sec_Confrimorder(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSecconfirm_Btn() {
		return secconfirm_Btn;
	}
	
	
	

}
