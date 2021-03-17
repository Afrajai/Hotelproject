package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sectshirt_Proceed2 {
	
	public static WebDriver driver;
	
@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
private WebElement procce ;

public Sectshirt_Proceed2(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getProcce() {
	return procce;
}


}




//*[@id="center_column"]/form/p/button/span