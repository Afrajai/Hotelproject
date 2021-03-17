package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed2_Pom {
	
	
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement proceed2;


	public Proceed2_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	


	
}
