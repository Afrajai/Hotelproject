package com.adaction.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchclick_Pom {
	
public static WebDriver driver;
	
	//@FindBy(xpath="//input[@type='radio'][1]")
	
@FindBy(id="radiobutton_1")
	private WebElement radiobtn;

@FindBy(name="continue")
private WebElement continuebtn;

public static WebDriver getDriver() {
	return driver;
}

public WebElement getRadiobtn() {
	return radiobtn;
}

public WebElement getContinuebtn() {
	return continuebtn;
}

	
	
	

}
