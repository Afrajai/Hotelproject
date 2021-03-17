package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sectshirt_Proceed1 {
	public static WebDriver driver;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement t_procee1;

	public Sectshirt_Proceed1(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getT_procee1() {
		return t_procee1;
	}
	
}