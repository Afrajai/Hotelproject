package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecProce3 {
	
	public static WebDriver driver;
	@FindBy(name="cgv")
	private WebElement checkk;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
private WebElement proce3;
	

public SecProce3(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

public WebElement getCheckk() {
	return checkk;
}

public WebElement getProce3() {
	return proce3;
}

}
